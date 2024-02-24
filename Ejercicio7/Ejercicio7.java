package Ejercicio7;

public class Ejercicio7 {
    public static void main(String[] args) 
    {
        String mensaje = "Hola Mundo";
        int desplazamiento = 3;
        String mensajeCifrado = cifrarCadena(mensaje, desplazamiento);
        System.out.println("Mensaje cifrado: " + mensajeCifrado);

    }
    
        public static String cifrarCadena(String str, int desplazamiento) 
        {
            if (str.isEmpty()) 
            {
                return ""; 
            }
            else 
            {
                char caracter = str.charAt(0);
                char caracterCifrado = cifrarCaracter(caracter, desplazamiento);
                return caracterCifrado + cifrarCadena(str.substring(1), desplazamiento);
            }
        }
    
        private static char cifrarCaracter(char caracter, int desplazamiento) 
        {
            if (Character.isLetter(caracter)) 
            {
                char base = Character.isUpperCase(caracter) ? 'A' : 'a';
                return (char) ((caracter - base + desplazamiento) % 26 + base);
            } 
            else 
            {
                return caracter; 
            }
        }
}
    

