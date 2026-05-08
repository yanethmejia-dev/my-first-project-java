public class App {

  // Variables globales de la clase
  static String nombre_estudiante = "Yaneth";
  static int edad = 35;
  static float peso = 51.5f;
  static boolean estudiante_activo = false;
  static String texto_estudiante_activo = "";

  public static void main(String[] args) {

    if (estudiante_activo) {
        texto_estudiante_activo = "Sí";
    }else{
        texto_estudiante_activo = "No";
    }
    
    // Espacio entre las variables
    System.out.println(nombre_estudiante + " " + edad +  " " + peso);
    // Salto de línea entre las variables
    System.out.println(nombre_estudiante + "\n" + edad +  "\n" + peso);
    // Guión intermedio entre las variables
    System.out.println(nombre_estudiante + " - " + edad +  " - " + peso);
    // Interpolación de mensajes en Java utilizando format 
    System.out.println("Me llamo " + nombre_estudiante + ", tengo " + edad +  " años y peso " + peso + " kg.");
    System.out.println("Estudiante activo: " + texto_estudiante_activo);
   }
}


