package org.iesvdm.haversine;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Extensiones {

    public static final BigDecimal RADIO_TIERRA_KM = new BigDecimal("6378");
    public static final BigDecimal PI =  new BigDecimal(Math.PI);
    public static final BigDecimal grados180 = new BigDecimal("180");


    public static BigDecimal distanciaKM(Posicion posicionOrigen, Posicion posicionDestino) {

        var difLatitudGrados = posicionDestino.getLatitud().subtract(posicionOrigen.getLatitud());
        var difLongitudGrados = posicionDestino.getLongitud().subtract(posicionOrigen.getLongitud());

        var difLatitud = enRadianes(difLatitudGrados);
        var difLongitud =enRadianes(difLongitudGrados);

        var a = Math.pow(Math.sin(difLatitud.divide(BigDecimal.TWO).doubleValue()),2)
                + Math.cos(enRadianes(posicionOrigen.getLatitud()).doubleValue())
                * Math.cos(enRadianes(posicionDestino.getLatitud()).doubleValue())
                * Math.pow(Math.sin(difLongitud.divide(BigDecimal.TWO).doubleValue()), 2);

        var c = 2.0d * Math.atan2(Math.sqrt(a), Math.sqrt(1 -a));

        return Extensiones.RADIO_TIERRA_KM.multiply(new BigDecimal(c));
    }

    public static BigDecimal enRadianes(BigDecimal anguloGrados) {

        return Extensiones.PI.multiply(anguloGrados).divide(grados180, 12, RoundingMode.HALF_UP);

    }

    public static BigDecimal alCuadrado(BigDecimal valor ) {

        return valor.multiply(valor);

    }
}
