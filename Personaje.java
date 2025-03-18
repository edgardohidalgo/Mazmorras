public class Personaje {

    private String nombre;

    private int  nivel_de_personaje;

    private int puntosdeVida;
    private String inventario ;

    public Personaje(String nombre , int nivel_de_personaje , int puntosdeVida , String inventario){
        this.nombre = nombre;
        this.nivel_de_personaje = nivel_de_personaje;
        this.puntosdeVida = puntosdeVida;
        this.inventario = inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel_de_personaje() {
        return nivel_de_personaje;
    }

    public void setNivel_de_personaje(int nivel_de_personaje) {
        this.nivel_de_personaje = nivel_de_personaje;
    }

    public String getInventario() {
        return inventario;
    }

    public void setInventario(String inventario) {
        this.inventario = inventario;
    }
    public  int getPuntosdeVida(){
        return puntosdeVida;
    }




}
