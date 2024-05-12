public class Principal {
    public static void main(String[] args) {
        // Teste 1: Valores normais
        Calculadora calculadora1 = new Calculadora(40, 2);

        System.out.println("Soma: " + calculadora1.somar());
        System.out.println("Subtração: " + calculadora1.subtrair());
        System.out.println("Multiplicação: " + calculadora1.multiplicar());
        System.out.println("Divisão: " + calculadora1.dividir());

        // Teste 2: Dividindo por zero
        Calculadora calculadora2 = new Calculadora(40, 0);

        System.out.println("\nSoma: " + calculadora2.somar());
        System.out.println("Subtração: " + calculadora2.subtrair());
        System.out.println("Multiplicação: " + calculadora2.multiplicar());
        System.out.println("Divisão: " + calculadora2.dividir()); // Erro de divisão por zero!
    }
}
