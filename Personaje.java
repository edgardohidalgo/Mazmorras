public class Personaje {

    private String nombre;
    private int nivel_de_personaje;
    private int puntosdeVida;
    private Inventario inventarioPersonaje;

    public Personaje(String nombre, int nivel_de_personaje, int puntosdeVida, Inventario inventario) {
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

    public int getPuntosdeVida() {
        return puntosdeVida;
    }

    public void setPuntosdeVida(int puntosdeVida) {
        this.puntosdeVida = puntosdeVida;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Nivel: " + nivel_de_personaje + ", Puntos de vida: " + puntosdeVida);
    }

    public void bajarVida(int vida) {
        this.puntosdeVida -= vida;
        if (this.puntosdeVida < 0) {
            this.puntosdeVida = 0;
        }
        System.out.println(nombre + " ha recibido " + vida + " de daño. Puntos de vida que le quedan: " + puntosdeVida);
    }

    public Inventario getInventario() {
        return inventarioPersonaje;
    }

    public void agregarEquipamiento(Equipamiento equipamiento) {
        this.inventarioPersonaje.agregarEquipamiento(equipamiento);
        System.out.println(equipamiento.getNombre() + " ha sido añadido al inventario de " + nombre);
    }


}
