import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Traer_Datos td = new Traer_Datos();
//        td.traerDatos();
        Procesador p = new Procesador();
        List<String[]> datos = p.procesarHTML();
    }

}
