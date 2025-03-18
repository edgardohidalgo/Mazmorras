public class Personaje {

    private String nombre;

    private int  nivel_de_personaje;

    private int puntosdeVida;
    private  Inventario inventarioPersonaje ;

    public Personaje(String nombre , int nivel_de_personaje , int puntosdeVida , Inventario inventario){
        this.nombre = nombre;
        this.nivel_de_personaje = nivel_de_personaje;
        this.puntosdeVida = puntosdeVida;
        this.inventarioPersonaje = inventario;
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

    public Inventario getInventarioPersonaje() {
        return inventarioPersonaje;
    }

    public void setInventario(Inventario inventario) {
        this.inventarioPersonaje = inventario;
    }
    public  int getPuntosdeVida(){
        return puntosdeVida;
    }
    public void setPuntosdeVida(int puntosdeVida){
        this.puntosdeVida = puntosdeVida;

    }

    public String toString() {
        return "Nombre: " + nombre + ", Nivel : " + nivel_de_personaje+ ", Puntos de vida: " + puntosdeVida + ", Inventario: " + inventarioPersonaje;
    }


}
