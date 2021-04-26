import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Procesador {

    public List procesarRSS() {
        DateFormat format = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);
        DateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat hora = new SimpleDateFormat("HH:mm:ss");
        List<String[]> procesado = new ArrayList<String[]>();
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            File f = new File("fichero.xml");
            Document doc = builder.parse(f);
            doc.getDocumentElement().normalize();
            NodeList listaNodos = doc.getElementsByTagName("item");
            for (int i = 0; i < listaNodos.getLength(); i++) {
                ArrayList<String> item = new ArrayList();
                Node nodo = listaNodos.item(i);
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nodo;
                    NodeList titulos = e.getElementsByTagName("title");
                    NodeList redactor = e.getElementsByTagName("dc:creator");
                    NodeList pubDate = e.getElementsByTagName("pubDate");
                    Node categoria = e.getElementsByTagName("category").item(0);
                    for (int j = 0; j < titulos.getLength(); j++) {
                        item.add(titulos.item(j).getTextContent());
                        if (categoria == null) {
                            item.add("Sin Categoria");
                        } else {
                            item.add(categoria.getTextContent());
                        }
                        item.add(redactor.item(j).getTextContent());
                        Date date = format.parse(pubDate.item(j).getTextContent());
                        item.add(fecha.format(date));
                        item.add(hora.format(date));
                    }
                    String[] result = item.toArray(new String[0]);
                    procesado.add(result);
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return procesado;
    }

    public List procesarHTML() {
        List<String[]> procesado = new ArrayList<String[]>();
        File f = new File("index.html");
        try {
            org.jsoup.nodes.Document doc = Jsoup.parse(f, "UTF-8");
            org.jsoup.nodes.Element div = doc.getElementById("articleListContent");
            Elements articulos = div.getElementsByClass("c-product-card");
            for (org.jsoup.nodes.Element articulo : articulos) {
                ArrayList<String> items = new ArrayList();
                items.add(articulo.attr("data-brand"));
                items.add(articulo.attr("data-name"));
                items.add(articulo.attr("data-price"));
                if (articulo.getElementsByClass("c-badge c-badge--success cy-product-flags-free-shipping").size() == 0) {
                    items.add("0");
                } else {
                    items.add("1");
                }
                if (articulo.getElementsByClass("c-badge c-badge--gold cy-product-flags-promotion").size() == 0) {
                    items.add("0");
                } else {
                    items.add("1");
                }
                String opiniones = articulo.getElementsByClass("c-star-rating__text cy-product-rating-result").text().split(" ")[0];
                if (opiniones.equals("")) {
                    items.add("0");
                    items.add("0");
                } else {
                    items.add(opiniones);
                    items.add(articulo.getElementsByClass("c-star-rating__text cy-product-text").text());
                }
                String[] result = items.toArray(new String[0]);
                for (int i = 0; i < result.length; i++) {
                    System.out.println(result[i]);
                }
                procesado.add(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return procesado;
    }
}
