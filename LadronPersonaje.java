public class LadronPersonaje extends Personaje {
    private boolean invisible; // indicamos que el ladron esta en fase invisible

    // Constructor
    public LadronPersonaje(String nombre, int nivel, int puntosdeVida, Inventario inventario , boolean invisible) {
        super(nombre, nivel, puntosdeVida, inventario);
        this.invisible = false;
    }
    // Método para robar
    public void robar() {
        if (invisible) {
            System.out.println("El ladrón ha robado sin que nadie lo viera");
        } else {
            System.out.println("El ladrón a intentado robar, pero el fue descubierto.");
        }
    }
    // Método para hacerse invisible
    public void hacerseInvisible() {
        invisible = !invisible; // Cambiar el estado de la invisibilidad
        if (invisible) {
            System.out.println("El ladrón es invisible");
        } else {
            System.out.println("El ladrón ya no es invisible");
        }
    }
    // Método para verificar si es el ladrón esta invisible
    public boolean estaInvisible() {
        return invisible;
    }
}
