public class main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();


        System.out.println("Adição: " + calc.adicionar(5, 3));
        System.out.println("Subtração: " + calc.subtrair(5, 3));
        System.out.println("Multiplicação: " + calc.multiplicar(5, 3));
        System.out.println("Divisão: " + calc.dividir(5, 1)); // Teste de divisão por zero
        System.out.println("Fatorial: " + calc.fatorial(5));
        System.out.println("Potência: " + calc.potencia(2, 3));
    }
}
