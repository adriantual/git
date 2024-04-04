import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Calc;

public class calcTest {


    @Test
    public void testSuma()
    {
        int f = 4;
        int e = 8;

        Calc calculadora = new Calc();

        int resultado = calculadora.suma(f,e);

        
        assertEquals(12, resultado);

    }


}
