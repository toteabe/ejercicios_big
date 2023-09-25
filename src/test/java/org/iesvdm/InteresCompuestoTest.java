package org.iesvdm;

import org.iesvdm.InteresCompuesto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class InteresCompuestoTest {

    @Test
    public void cuandoPrincipal1000Interes5porcientoY10peridos() {

        String principal = "1000";
        int interes = 5;
        int periodos = 10;

        InteresCompuesto interesCompuesto = new InteresCompuesto(new BigDecimal(principal), new BigDecimal(interes).divide(new BigDecimal(100)), periodos);
        interesCompuesto.calculaMontoFinal();
        BigDecimal cantidadFinal = interesCompuesto.getC().setScale(2, RoundingMode.HALF_UP);

        Assertions.assertEquals(new BigDecimal("1628.89"), cantidadFinal);
    }

}
