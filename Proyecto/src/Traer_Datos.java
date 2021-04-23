import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.*;


public class Traer_Datos {
    public Traer_Datos(){

    }

    public void traerDatos(){

    try{
        URL html = new URL("https://www.laopiniondemurcia.es/");
        URL xml = new URL("https://www.laopiniondemurcia.es/rss");

        File fhtml = new File("fichero.html");
        File fxml = new File("fichero.xml");

        BufferedReader bf_html = new BufferedReader(new InputStreamReader(html.openStream()));
        BufferedReader bf_xml = new BufferedReader(new InputStreamReader(xml.openStream()));

        BufferedWriter bw_html = new BufferedWriter(new FileWriter(fhtml));
        BufferedWriter bw_xml = new BufferedWriter(new FileWriter(fxml));
        String linea;
        while((linea = bf_html.readLine())!=null){
            bw_html.write(linea);
        }
        bf_html.close();
        bw_html.close();
        System.out.println("Fichero html creado correctamente");
        String linea2;
        while((linea2 = bf_xml.readLine())!=null){
            bw_xml.write(linea2);
        }
        bf_xml.close();
        bw_xml.close();
        System.out.println("Fichero xml creado correctamente");




    }catch(Exception ex){
        ex.printStackTrace();
    }


    }
}

