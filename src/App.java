public class App {
    public static void main(String[] args){
        
       int resultado = suma(5, 10, 14);
       System.out.println("El resultado es " + resultado);
    }

    public static int suma(int a, int b, int c){
        int resultado = a + b + c;
        return resultado;
    }
}
