public class PaisEuropeo {
    private final String nombre;
    private int poblacion;
    private final String dominio;
    public static int fondoComun;
    private int saldo;
    private int aportacion;
    private int retirada;
    private String categoria;


    public PaisEuropeo(String nombre, int poblacion) {
        this(nombre, poblacion, nombre.substring(1, 2));
    }

    public PaisEuropeo(String nombre, int poblacion, String dominio) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.dominio = dominio;
        this.saldo = saldo;
    }

    public void aportar(int aportacion) {
        String salida = "";

        salida += saldo + aportacion;
        salida += fondoComun + aportacion;
    }

    public void retirar(int retirada) {
        String salida = "";

        salida += saldo - retirada;
        salida += fondoComun - retirada;
    }


    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public static int getFondoComun() {
        return fondoComun;
    }

    public void setFondoComun(int fondoComun) {
        this.fondoComun = fondoComun;
    }

    public String getCategoria() {
        String salida = "Categoría ";
        if (saldo > 100000) {
            salida += "A";
        }
        if (saldo <= 100000 && saldo >= 0) {
            salida += "B";
        }
        if (saldo < 0) {
            salida += "C";
        }
        return salida;
    }
}
