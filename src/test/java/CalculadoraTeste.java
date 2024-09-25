import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTeste {

    @Test
    public void testAdicionar() {
        Calculadora calc = new Calculadora();
        assertEquals(8, calc.adicionar(5, 3));
        assertEquals(0, calc.adicionar(-1, 1));
        assertEquals(-5, calc.adicionar(-2, -3));
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.subtrair(5, 3));
        assertEquals(-2, calc.subtrair(-1, 1));
        assertEquals(1, calc.subtrair(-2, -3));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(15, calc.multiplicar(5, 3));
        assertEquals(-3, calc.multiplicar(-1, 3));
        assertEquals(6, calc.multiplicar(-2, -3));
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6, 3));
        assertEquals(-2, calc.dividir(-6, 3));
        assertEquals(2, calc.dividir(-6, -3));
        assertEquals(2.6666666666666665, calc.dividir(8,3));
        assertEquals(7.619047619047619, calc.dividir(40,5.25));
        assertEquals(10.458333333333334, calc.dividir(125.5, 12));


        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.dividir(5, 0);
        });
        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }

    @Test
    public void testFatorial() {
        Calculadora calc = new Calculadora();
        assertEquals(120, calc.fatorial(5)); // 5!
        assertEquals(1, calc.fatorial(0)); // 0! = 1
        assertEquals(1, calc.fatorial(1)); // 1! = 1

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.fatorial(-1);
        });
        assertEquals("Fatorial de número negativo não é definido.", exception.getMessage());
    }

    @Test
    public void testPotencia() {
        Calculadora calc = new Calculadora();
        assertEquals(8, calc.potencia(2, 3)); // 2^3
        assertEquals(1, calc.potencia(2, 0)); // 2^0
        assertEquals(0.25, calc.potencia(2, -2)); // 2^-2
        assertEquals(81, calc.potencia(-3, 4)); // (-3)^4)
    }
}
