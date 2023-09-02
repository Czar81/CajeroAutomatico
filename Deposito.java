package Cajero_Automatico.clases;

public class Deposito extends Operaciones {
    @Override
    public void Transacciones() {
        System.out.println("Cuanto deseas depositar?");
        Deposito();
        var saldos = get_Saldos();
        var ubicacion = get_ValidacionUbicacion();

        saldos[Integer.parseInt(ubicacion[1])] += deposito;
        set_Saldos(saldos);
        System.out.println(" -------------------------------------" +
                "\n Se deposito " + deposito +
                "\n -------------------------------------");
    }
}
