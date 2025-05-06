package Main;

import BaseDatos.BDPropietario;
import BaseDatos.BDVehiculo;
import BaseDatos.Conexiones;
import Modelo.Propietario;
import Modelo.Turno;
import Modelo.Vehiculo;
import Logica.LogicaTurno;
import java.sql.Connection;

public class Vehículos {

    public static void main(String[] args) {
    
        Conexiones conexion = new Conexiones();
        BDPropietario bdProp = new BDPropietario();
        BDVehiculo bdVehi = new BDVehiculo();
        LogicaTurno logica = new LogicaTurno();

        try (Connection con = conexion.getConnection()) {
            
            Propietario p = new Propietario();
            p.setCedula("1105739222");
            p.setApellido("Rosales");
            p.setNombre("Santiago");
            bdProp.insertarPropietario(con, p);
            System.out.println("Propietario insertado");

            Vehiculo v = new Vehiculo();
            v.setPlaca("PBQ876");
            v.setMarca("Toyota");
            v.setEstado(1);
            v.setIdProp(1);
            bdVehi.insertarVehiculo(con, v);
            System.out.println("Vehículo insertado");

            Turno t = new Turno(0, 2, "2025-05-06", "08:05:40", 1);

            if (logica.puedeReservarTurno(con, t)) {
                logica.reservarTurno(con, t);
                System.out.println("Turno reservado");
            } else {
                System.out.println("No se puede reservar el turno");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
