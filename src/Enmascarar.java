public class Enmascarar {

    public static String enmascara(String cadena){
        String parteAEnmacarada;
        String parteSinEnmascarar;
        String salida;

        if (cadena.length()<=4) {
            salida = cadena;
        } else {
            parteAEnmacarada= cadena.substring(0,cadena.length()-4);
            parteSinEnmascarar= cadena.substring(cadena.length()-4,cadena.length());

            String remplazo = parteAEnmacarada;

            for (int i = 0; i < parteAEnmacarada.length(); i++) {
                remplazo = remplazo.replace(remplazo.charAt(i), '#');
            }
            salida = remplazo + parteSinEnmascarar;
        }
        return salida;
    }
}
