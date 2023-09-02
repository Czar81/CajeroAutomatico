package Cajero_Automatico.clases;

public class Retiro extends Operaciones {
    @Override
    public void Transacciones() {
        System.out.println("Cuanto deseas retirar");
        Retiro();
        var ubicacion = get_ValidacionUbicacion();
        var saldos = get_Saldos();
        if (retiro <= saldos[Integer.parseInt(ubicacion[1])] && retiro > 0){
            saldos[Integer.parseInt(ubicacion[1])] -= retiro;
            set_Saldos(saldos);

            System.out.println(" -------------------------------------" +
                    "\n Se retiro " + retiro +
                    "\n -------------------------------------");
        } else {
            System.out.println("-------------------" +
                    "\n Saldo insuficiente." +
                    "\n -------------------");
        }
    }
}
