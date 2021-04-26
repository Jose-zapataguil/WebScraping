import com.csvreader.CsvWriter;
import java.io.IOException;
import java.util.List;



public class Exportar {


    public void exportarCSV(List<String[]> procesado, int numero) {

        String archivoCSV = "archivo.csv";

        try {

            CsvWriter writer = new CsvWriter(archivoCSV);

            if(numero==1){
            writer.write("Titulo");
            writer.write("Creador");
            writer.write("Fecha de publicacion");
            writer.write("Categoria");
            writer.endRecord();}

            else if(numero==2){
            writer.write("Categoria");
            writer.write("Marca");
            writer.write("Nombre");
            writer.write("Precio");
            writer.write("Envio gratis");
            writer.write("Promocion");
            writer.write("Numero de valoraciones");
            writer.write("Media de valoraciones");
            writer.endRecord();
            }

            else if(numero==3){
            writer.write("Categoria");
            writer.write("Marca");
            writer.write("Nombre del producto");
            writer.write("Precio");
            writer.write("Opiniones");
            writer.write("Disponible");
            writer.endRecord();
            }


            for (String[] strings : procesado) {
                for (String string : strings) {
                    writer.write(string);
                }
                writer.endRecord();
            }
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
