import com.csvreader.CsvWriter;
import java.io.IOException;
import java.util.List;
import java.util.Iterator;


public class Exportar {


    public void exportarCSV(List<String[]> procesado) {

        String archivoCSV = "archivo.csv";

        try {

            CsvWriter writer = new CsvWriter(archivoCSV);
            writer.write("Titulo");
            writer.write("Creador");
            writer.write("Fecha de publicacion");
            writer.write("Categoria");


            writer.endRecord();

            for (int i = 0; i < procesado.size(); i++) {
                for (int j = 0; j < procesado.get(i).length; j++) {
                    writer.write(procesado.get(i)[j]);
                }
                writer.endRecord();
            }
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
