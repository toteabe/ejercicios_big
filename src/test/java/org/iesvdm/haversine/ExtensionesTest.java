package org.iesvdm.haversine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExtensionesTest {

    @Test
    public void distanciaIgualadaGranada() {
        var posIgualada = new Posicion(new BigDecimal("41.57879"),  new BigDecimal("1.617221"));
        var posGranada = new Posicion(new BigDecimal("37.176487"), new BigDecimal("-3.597929"));

        BigDecimal distanciaKM = Extensiones.distanciaKM(posIgualada, posGranada);

        System.out.println(distanciaKM);
        System.out.println(distanciaKM.setScale(12, RoundingMode.HALF_UP));

        Assertions.assertEquals(new BigDecimal("664.202809944782"), distanciaKM.setScale(12, RoundingMode.HALF_UP));
    }
}
