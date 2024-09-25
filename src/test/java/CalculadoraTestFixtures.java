import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraTestFixtures {
    private Calculadora calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculadora();
    }

    @Test
    public void testAdicionar() {
        assertEquals(8, calc.adicionar(5, 3));
        assertEquals(0, calc.adicionar(-1, 1));
        assertEquals(-5, calc.adicionar(-2, -3));
    }

    @Test
    public void testSubtrair() {
        assertEquals(2, calc.subtrair(5, 3));
        assertEquals(-2, calc.subtrair(-1, 1));
        assertEquals(1, calc.subtrair(-2, -3));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(15, calc.multiplicar(5, 3));
        assertEquals(-3, calc.multiplicar(-1, 3));
        assertEquals(6, calc.multiplicar(-2, -3));
    }

    @Test
    public void testDividir() {
        assertEquals(2, calc.dividir(6, 3));
        assertEquals(-2, calc.dividir(-6, 3));
        assertEquals(2, calc.dividir(-6, -3));
    }

    @Test
    public void testDividirPorZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.dividir(5, 0);
        });
        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }

    @Test
    public void testFatorial() {
        assertEquals(120, calc.fatorial(5)); // 5!
        assertEquals(1, calc.fatorial(0)); // 0! = 1
        assertEquals(1, calc.fatorial(1)); // 1! = 1
    }

    @Test
    public void testFatorialDeNumeroNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.fatorial(-1);
        });
        assertEquals("Fatorial de número negativo não é definido.", exception.getMessage());
    }

    @Test
    public void testPotenciaComNumeroNegativo() {
        assertEquals(-8, calc.potencia(-2, 3)); // (-2)^3
        assertEquals(4, calc.potencia(-2, 2)); // (-2)^2
        assertEquals(81, calc.potencia(-3, 4)); // (-3)^4
    }

    @Test
    public void testPotenciaComExponenteNegativo() {
        assertEquals(0.25, calc.potencia(-2, -2)); // (-2)^-2
        assertEquals(-0.3333, Math.round(calc.potencia(-3, -1) * 10000.0) / 10000.0); // (-3)^-1
    }
}
