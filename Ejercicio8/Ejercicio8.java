package Ejercicio8;

public class Ejercicio8 {
    public static void main(String[] args) 
    {
        String cadena = "Llego mañana";
        String resultado = conCodigoPar(cadena);
        System.out.println("Cadena con códigos pares: " + resultado);

    }
    
        public static String conCodigoPar(String str) 
        
        {
            if (str.isEmpty()) {
                return ""; // Caso base: cadena vacía
            } 
            else 
            {
            char caracter = str.charAt(0);

                if ((int) caracter % 2 == 0) 
                {
                    return caracter + conCodigoPar(str.substring(1));
                } 
                else 
                {
                    return conCodigoPar(str.substring(1));
                }
            }
        }
    
    
    
}
