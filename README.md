# WebScraping - Java

## Flujo del Programa

El programa se divide en tres pequeñas fases:

  -Conexión con el sitio web y extracción de los datos.
  
    Los datos son guardados en un fichero, el cual pasaremos al procesador.
    
  -Procesado de los datos.  
  
    El procesador coge el fichero correspondiente, lo procesa y lo convierte en una lista de arrays de String.
    
  -Exportar la información
  
    Los datos de esta lista son escritos en un fichero .csv
  

## Requisitos

Los requisitos para la ejecución del programa dependerá de la forma de hacerlo.

En el caso de ejecutar el programa desde IntelliJ por ejemplo, necesitaremos agregar dos librerias que se han usado en el codigo:

  -JSOUP: https://jsoup.org/download
  
  -JavaCSV: http://www.java2s.com/Code/Jar/j/Downloadjavacsvjar.htm
  
En caso de ejecutarlo con el fichero .jar ejecutable, solo necesitaremos tener Java instalado en nuestro ordenador(Para el caso anterior tambien es necesario).
## Opciones del programa

1) Generar un .csv a partir del FEED RSS de la página la opinion de Murcia.
2) Generar un .csv a partir del HTML de la página de ofertas de PCComponentes.
3) Generar un .csv a partir del HTML de la página de novedades hombre de Decathlon.
4) Cierra el programa.

## Instalación y ejecución desde IntelliJ

1) Descargar y descomprimir el proyecto.
2) Abrir el proyecto File > Open > Ruta del fichero descomprimido

Agregar las librerias anteriormente mencionadas:

1) Click derecho sobre la carpeta del proyecto y entramos en Open Module Settings.
2) En el apartado Libraries, pulsamos en el boton + para agregar una librería.
3) Indicamos la ruta de las dos librerías y aplicamos los cambios.

Deberia quedar de esta manera.

![image](https://user-images.githubusercontent.com/81249604/116101138-dfd89c00-a6ad-11eb-8fc7-80344080eb70.png)

Una vez hecho todo lo anterior, abrimos el fichero Main y click derecho Run `Main.main()`

![imagen](https://user-images.githubusercontent.com/79518642/116216726-3515bb80-a749-11eb-9468-3168d6756a7e.png)

Saldrá una ventana con las opciones del programa

![imagen](https://user-images.githubusercontent.com/79518642/116216852-5b3b5b80-a749-11eb-9207-451bf3470929.png)


## Ejecución desde cmd

1) Descargar el repositorio.
2) Descomprimir la carpeta descargada.
3) Dentro de la carpeta "Proyecto" hay otra carpeta llamada Programa que contiene el ejecutable .jar, llevala donde quieras.
4) Abre un cmd y escribe lo siguiente.  `java -jar [ruta del fichero .jar]`
- Al ejecutar ese comando se muestra el menu con las opciones del programa  

 ![imagen](https://user-images.githubusercontent.com/79518642/116215449-fb908080-a747-11eb-9e37-265511135f40.png)


