public class AppCalculadora {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();


        //Teste da soma 
        System.out.println("Soma: "+calculadora.soma(5,5));

        //Teste da subtração
        System.out.println("Subtração: "+calculadora.subtracao(5, 5));
    }
}
