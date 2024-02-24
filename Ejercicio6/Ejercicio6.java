package Ejercicio6;

public class Ejercicio6 {

    public static void main(String[] args) 
    {
        String cadena = " Hola ";
        int resultado = sumaCodigos(cadena);
        System.out.println("La suma de los códigos de la cadena " + cadena + " es: " + resultado);
    }

    public static int sumaCodigos(String str) 
    {
        return sumaCodigosRecursiva(str, 0);
    }

    private static int sumaCodigosRecursiva(String str, int index) 
    {
        if (index == str.length()) 
        {
            return 0; 
        } 
        else 
        {
            char caracter = str.charAt(index);
            return (int) caracter + sumaCodigosRecursiva(str, index + 1);
        }
    }
}
