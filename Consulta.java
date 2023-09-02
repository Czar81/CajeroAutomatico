package Cajero_Automatico.clases;

public class Consulta extends Operaciones {

    @Override
    public void Transacciones() {
        var ubicacion = get_ValidacionUbicacion();
        var saldos = get_Saldos();
        System.out.println(" -----------------------------------" +
                "\n Tu saldo actual es: " + saldos[Integer.parseInt(ubicacion[1])] +
                "\n -----------------------------------");
    }
}
