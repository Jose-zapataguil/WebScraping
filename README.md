# WebScraping - Java

## Flujo del Programa

El programa se divide en tres pequeñas fases:

  -Conexión con el sitio web y extracción de los datos.
  
    Los datos son guardados en un fichero, el cual pasaremos al procesador.
    
  -Procesado de los datos.  
  
    El procesador coge el fichero correspondiente, lo procesa y lo convierte en una lista de arrays de String.
    
  -Exportar la información
  
    Los datos de esta listan son escritos en un fichero .csv
  

## Requisitos

Los requisitos para la ejecución del programa dependerá de la forma de hacerlo.

En el caso de ejecutar el programa desde IntelliJ por ejemplo, necesitaremos agregar dos librerias que se han usado en el codigo:

  -JSOUP: https://jsoup.org/download
  
  -JavaCSV: http://www.java2s.com/Code/Jar/j/Downloadjavacsvjar.htm
  
En caso de ejecutarlo con el fichero .jar ejecutable, solo necesitaremos tener Java instalado en nuestro ordenador(Para el caso anterior tambien es necesario).

## Instalación

Para agregar las librerias anteriormente mencionadas lo haremos de la siguiente forma:

1) Click derecho sobre la carpeta del proyecto y entramos en Open Module Settings.
2) En el apartado Libraries, pulsamos en el boton + para agregar una librería.
3) Indicamos la ruta de las dos librerías y aplicamos los cambios.

Deberia quedar de esta manera.

![image](https://user-images.githubusercontent.com/81249604/116101138-dfd89c00-a6ad-11eb-8fc7-80344080eb70.png)


## Funcionamiento

Para explicar el funcionamiento del programa lo vamos a dividir en las 3 funcionalidades principales:

-Obtención de datos:
  
  Establecemos la conexión con el sitio web. Creamos un BufferedReader a traves de dicha conexión y un BufferedWriter con el fichero en el que vamos a guardar la información.
  Mediante un bucle, vamos leyendo la información del sitio y guardandola en nuestro fichero. Cerramos la conexión y mostramos un mensaje de exito.

-Procesado de datos.

-Exportación de datos.

## Prueba de ejecución


