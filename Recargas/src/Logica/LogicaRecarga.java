package Logica;

import Modelo.Celular;
import Modelo.Recarga;

public class LogicaRecarga {

    // Se indica saldo y megas manualmente
    public Recarga recargarManual(Celular c, int valor, int saldo, int megas) {
        if (c.getEstado() != 1) {
            System.out.println("Celular inactivo. No se puede recargar.");
            return null;
        }

        c.setSaldo(c.getSaldo() + saldo);
        c.setMegas(c.getMegas() + megas);

        return new Recarga(0, valor, saldo, megas, c.getIdCel());
    }

    // Automático: 2/3 saldo, 1/3 megas (5GB por dólar)
    public Recarga recargarAuto(Celular c, int valor) {
        if (c.getEstado() != 1) {
            System.out.println("Celular inactivo. No se puede recargar.");
            return null;
        }

        int saldo = (valor * 2) / 3;
        int megas = ((valor / 3) * 5);

        c.setSaldo(c.getSaldo() + saldo);
        c.setMegas(c.getMegas() + megas);

        return new Recarga(0, valor, saldo, megas, c.getIdCel());
    }
}
