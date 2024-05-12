public class Calculadora {

    private int num1;
    private int num2;
    private int resultado;

//Construtor completo

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //metodo somar
    public int somar() {
        resultado= num1 + num2;
        return resultado;
            }
    // Método subtrair
    public int subtrair() {
        resultado = num1 - num2;
        return resultado;
    }
    // Método multiplicar
    public int multiplicar() {
        resultado = num1 * num2;
        return resultado;
    }

    // Método dividir
    public int dividir() {
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        } else {
            resultado = (num1 / num2);
            return resultado;
        }
    }
}

