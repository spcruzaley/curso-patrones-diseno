package com.patrones.estructurales.bridge;

import com.patrones.estructurales.bridge.pagos.MetodoPago;
import com.patrones.estructurales.bridge.pagos.PagoCrypto;
import com.patrones.estructurales.bridge.pagos.PagoPayPal;
import com.patrones.estructurales.bridge.pagos.PagoTarjetaCredito;
import com.patrones.estructurales.bridge.plataformas.Plataforma;
import com.patrones.estructurales.bridge.plataformas.PlataformaMovil;
import com.patrones.estructurales.bridge.plataformas.PlataformaWeb;

// 5. Clase principal para probar cómo funciona todo
public class BridgePatternExample {
    public static void main(String[] args) {
        // Pago con tarjeta de crédito desde la web
        MetodoPago tarjetaCredito = new PagoTarjetaCredito();
        Plataforma plataformaWeb = new PlataformaWeb(tarjetaCredito);
        plataformaWeb.realizarPago(1500.0);

        System.out.println();

        // Pago con PayPal desde la aplicación móvil
        MetodoPago payPal = new PagoPayPal();
        Plataforma plataformaMovil = new PlataformaMovil(payPal);
        plataformaMovil.realizarPago(750.0);
        System.out.println();

        Plataforma plataformaMovil2 = new PlataformaMovil(tarjetaCredito);
        plataformaMovil2.realizarPago(800.0);

        MetodoPago pagoCrytpo = new PagoCrypto();
        Plataforma plataformaMovil3 = new PlataformaMovil(pagoCrytpo);
        plataformaMovil3.realizarPago(1);
    }
}
