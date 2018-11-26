public class Primitiva {
    public static int AÑADIDO = 10;

    public static void main(String[] args) {

        int filas=9;
        int columnas=4;
        int aumento = 0;

        String cadena="";
        String cadenaModificada;

        for (int i = 1; i <= filas+1; i++) {
            for (int j = 0; j <= columnas; j++) {
                cadena=cadena+aumento+" ";
                aumento=aumento+AÑADIDO;
            }
            cadena=cadena+"\n";
            aumento=i;
        }
        cadenaModificada="  "+cadena.substring(2,cadena.length());
        System.out.println(cadenaModificada);
        JOptionPane.showMessageDialog(null,cadenaModificada);
    }
}