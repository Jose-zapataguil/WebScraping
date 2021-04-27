import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;


public class Traer_Datos {
    public Traer_Datos(){

    }

    public void traerDatos(String _xml, String _html){

    try{
        //HTML

        if (_xml.equals("")) {

            URLConnection conexion = new URL(_html).openConnection();
            conexion.addRequestProperty("User-Agent", "Mozilla");
            conexion.connect();
            File fhtml = new File("fichero.html");
            BufferedReader bf_html = new BufferedReader(new InputStreamReader(conexion.getInputStream(),  StandardCharsets.UTF_8));
            BufferedWriter bw_html = new BufferedWriter(new FileWriter(fhtml, StandardCharsets.UTF_8));
            String linea;
            while ((linea = bf_html.readLine()) != null) {
                bw_html.write(linea);
            }
            bf_html.close();
            bw_html.close();
            System.out.println("Fichero html creado correctamente");
        } else {
            //XML
            URL xml = new URL(_xml);


            File fxml = new File("fichero.xml");

            BufferedReader bf_xml = new BufferedReader(new InputStreamReader(xml.openStream(), StandardCharsets.UTF_8));

            BufferedWriter bw_xml = new BufferedWriter(new FileWriter(fxml,StandardCharsets.UTF_8));
            String linea2;
            while ((linea2 = bf_xml.readLine()) != null) {
                bw_xml.write(linea2);
            }
            bf_xml.close();
            bw_xml.close();
            System.out.println("Fichero xml creado correctamente");
        }



    }catch(Exception ex){
        ex.printStackTrace();
    }


    }
}

