public class ADN {
    public static String devuelveComplementario(String cadena){
        String salida="";
        String cadenaComplementaria="";

        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i)=='T'){
                cadenaComplementaria+='A';
            }
            else if (cadena.charAt(i)=='A'){
                cadenaComplementaria+='T';
            }
            else if (cadena.charAt(i)=='C'){
                cadenaComplementaria+='G';
            }
            else if (cadena.charAt(i)=='G'){
                cadenaComplementaria+='C';
            }
            salida=cadenaComplementaria;
        }
        return salida;
    }
}