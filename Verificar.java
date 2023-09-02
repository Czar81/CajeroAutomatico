package Cajero_Automatico.clases;

public class Verificar extends Operaciones {

    @Override
    public void Transacciones() {
        System.out.println(" -----------------------------------------" +
                "\n Bienvenido Al Cajero Automatico de ATH." +
                "\n Ingrese su pin" +
                "\n -----------------------------------------");
        var validacionUbicacion = get_ValidacionUbicacion();
        var temporal2 = get_informacion_Usuario();
        PedirPin();

        for (int i = 0; i < 5; i++) {
            String elemento = temporal2[i][0];
            if (elemento.equals(pin)) {
                validacionUbicacion[0] = "true";
                validacionUbicacion[1] = Integer.toString(i);
                set_ValidacionUbicacion(validacionUbicacion);
            }

        }
    }

}
