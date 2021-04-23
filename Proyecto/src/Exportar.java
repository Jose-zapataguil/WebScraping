
import com.csvreader.CsvWriter;
import java.io.IOException;
import java.util.List;
import java.util.Iterator;




public class Exportar {


    public static void exportarCSV(List<String[]> procesado) {

        String archivoCSV = "C:\\archivo.csv";

        try {

            CsvWriter writer = new CsvWriter(archivoCSV);

            writer.write("Título");
            writer.write("Creador");
            writer.write("Fecha de publicación");
            writer.write("Categoría");


            writer.endRecord();


            Iterator i = procesado.iterator();
            while(i.hasNext())
            {
                writer.write(i.next().toString());
                writer.endRecord();
            }

            writer.close();


        } catch(IOException e) {
            e.printStackTrace();
        }
    }


}
