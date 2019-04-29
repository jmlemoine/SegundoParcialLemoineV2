package Servicios;

import org.h2.tools.*;
import java.sql.SQLException;

public class BootStrapServicio {
    private static BootStrapServicio instancia;

    public static BootStrapServicio getInstancia() {
        if (instancia == null) {
            instancia = new BootStrapServicio();
        }
        return instancia;
    }

    public static void iniciarBaseDatos() throws SQLException {
        Server.createTcpServer("-tcpPort", "9092", "-tcpAllowOthers").start();
    }

    public static void detenerBaseDatos() throws SQLException {
        Server.shutdownTcpServer("tcp://localhost:9092", "", true, true);
    }
}