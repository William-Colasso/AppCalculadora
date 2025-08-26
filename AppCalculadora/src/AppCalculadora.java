public class AppCalculadora {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();

        //Teste divisão
        System.out.println("Divisão: " + calculadora.divisao(10, 5));
        //Teste multiplicação
        System.out.println("Multiplicação: " + calculadora.multiplicacao(10, 5));
        
    }
}
