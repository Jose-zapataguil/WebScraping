import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Traer_Datos td = new Traer_Datos();
        Procesador p = new Procesador();
        List<String[]> datos = new ArrayList<>();
        int num = 0;
        System.out.println("Escoge una opción");
        System.out.println("1-RSS La opinión de Murcia");
        System.out.println("2-HTML Ofertas Pccomponentes");
        System.out.println("3-HTML Ofertas Hombre Decathlon");
        System.out.println("4-Salir");
        System.out.println();
        num = sc.nextInt();
        if (num == 1) {
            td.traerDatos("https://www.laopiniondemurcia.es/rss", "");
            datos = p.procesarRSS();
        } else if (num == 2) {
            td.traerDatos("", "https://www.pccomponentes.com/ofertas-especiales");
            datos = p.procesarHTMLPc();
        } else if (num == 3) {
            td.traerDatos("", "https://www.decathlon.es/es/special-page/product-gender-hombre/_/N-1hhmrozZ1dph4y0");
            datos = p.procesarHTMLDecathlon();
        }
        Exportar ex = new Exportar();
        ex.exportarCSV(datos, num);
    }

}
