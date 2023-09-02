package Cajero_Automatico.clases;

import java.util.Scanner;

public abstract class Operaciones {
    protected double retiro, deposito, dineroTransferir;
    protected static String pin, transferencia;
    final private static String[][] informacion_Usuario = {
            { "151", "Felipe" },
            { "214", "Juan" },
            { "363", "Naomy" },
            { "416", "Bryan" },
            { "513", "Marina" }
    };
    private static String[] validacionUbicacion = { "false", "0" };
    private static double[] saldos = { 50000, 60000, 40000, 30000 };
    Scanner in = new Scanner(System.in);

    public void Menu() {
        int salida = 0;
        int seleccion = 0;
        do {
            do {
                if (validacionUbicacion[0].equals("false")) {
                    do {
                        Operaciones mensajero = new Verificar();
                        mensajero.Transacciones();
                        if (!validacionUbicacion[0].equals("true")) {
                            System.out.println("Pin no valido intentelo de nuevo");
                        }
                    } while (!validacionUbicacion[0].equals("true"));
                }
                System.out.println(" Bienvendio " + informacion_Usuario[Integer.parseInt(validacionUbicacion[1])][1] +
                        "\n ---------------------------------------" +
                        "\n Que desea realizar?" +
                        "\n     1. Consulta Cuenta." +
                        "\n     2. Retiro Dinero." +
                        "\n     3. Deposito Dinero." +
                        "\n     4. Transferir Dinero." +
                        "\n     5. Salir." +
                        "\n ---------------------------------------");
                seleccion = in.nextInt();

                if (seleccion >= 1 && seleccion <= 5) {
                    salida = 1;
                } else {
                    System.out.println(" ----------------------------------------" +
                            "\n Opcion no valida, vuelva a intentarlo" +
                            "\n -------------------------------------");
                }
            } while (salida == 0);

            switch (seleccion) {
                case 1:
                    Operaciones mensajero1 = new Consulta();
                    mensajero1.Transacciones();
                    break;
                case 2:
                    Operaciones mensajero2 = new Retiro();
                    mensajero2.Transacciones();
                    break;
                case 3:
                    Operaciones mensajero3 = new Deposito();
                    mensajero3.Transacciones();
                    break;
                case 4:
                    Operaciones mensajero4 = new Transferencia();
                    mensajero4.Transacciones();
                    break;
                case 5:
                    System.out.println(" -----------------" +
                            "\n Gracias por usar." +
                            "\n -----------------");
                    salida = 2;
                    break;

                default:
                    System.out.println(" -------------------------------------" +
                            "\n Opcion no valida, vuelva a intentarlo" +
                            "\n -------------------------------------");
                    break;
            }
        } while (salida != 2);

    }

    public void Retiro() {
        retiro = in.nextDouble();
    }

    public void Deposito() {
        deposito = in.nextDouble();
    }

    public void Transferencia() {
        transferencia = in.next();
    }

    public void DineroTransferir() {
        dineroTransferir = in.nextDouble();
    }

    public void PedirPin() {
        pin = in.next();
    }

    public void set_ValidacionUbicacion(String[] validacionUbicacion) {
        Operaciones.validacionUbicacion = validacionUbicacion;
    }

    public String[] get_ValidacionUbicacion() {
        return validacionUbicacion;
    }

    public String[][] get_informacion_Usuario() {
        return informacion_Usuario;
    }

    public void set_Saldos(double[] saldos) {
        Operaciones.saldos = saldos;
    }

    public double[] get_Saldos() {
        return saldos;
    }

    // Abstract
    public abstract void Transacciones();

}
