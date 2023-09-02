package Cajero_Automatico.clases;

public class Transferencia extends Operaciones {
    static boolean existe;

    @Override
    public void Transacciones() {

        do {
            System.out.println("A que cuenta desea transferir?");
            Transferencia();
            CuentaTransferir();
        } while (existe == false);

        System.out.println("Cuanto va transferir");
        DineroTransferir();

        var ubicacion = get_ValidacionUbicacion();
        var saldos = get_Saldos();

        if (dineroTransferir <= saldos[Integer.parseInt(ubicacion[1])] && dineroTransferir > 0) {
            saldos[Integer.parseInt(ubicacion[1])] -= dineroTransferir;
            saldos[Integer.parseInt(CuentaTransferir())] += dineroTransferir;
            set_Saldos(saldos);
            System.out.println(" -------------------------------------" +
                    "\n Se transfirio " + dineroTransferir +
                    "\n -------------------------------------");
        } else {
            System.out.println("-------------------" +
                    "\n Saldo insuficiente." +
                    "\n -------------------");
        }
    }

    public String CuentaTransferir() {
        var temporal2 = get_informacion_Usuario();
        String cuenta = "";

        for (int i = 0; i < 5; i++) {
            String elemento = temporal2[i][0];
            if (elemento.equals(transferencia)) {
                cuenta = Integer.toString(i);
                existe = true;
                break;
            }

        }
        return cuenta;
    }

}
