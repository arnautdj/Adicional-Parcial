package Main;

import Modelo.Cliente;
import Modelo.Celular;
import Modelo.Recarga;
import Logica.LogicaRecarga;

public class Recargas {
    
    public static void main(String[] args) {
        
        // Crear cliente
        Cliente cli = new Cliente(1, "110487336", "Santiago", "Rosales");

        // Crear celular
        Celular cel = new Celular(1, "0983625374", 1, 0, 0, cli.getIdClie());

        // Instancia lógica
        LogicaRecarga logica = new LogicaRecarga();

        // Recarga automática de 6 dólares
        Recarga r1 = logica.recargarAuto(cel, 6);
        System.out.println("Recarga automática:");
        System.out.println("Saldo actual: $" + cel.getSaldo());
        System.out.println("Megas actuales: " + cel.getMegas() + " GB");

        // Recarga manual de 5 dólares (3 para saldo, 2 para megas = 10GB)
        Recarga r2 = logica.recargarManual(cel, 5, 3, 10);
        System.out.println("\nRecarga manual:");
        System.out.println("Saldo actual: $" + cel.getSaldo());
        System.out.println("Megas actuales: " + cel.getMegas() + " GB");
        
    }
}
