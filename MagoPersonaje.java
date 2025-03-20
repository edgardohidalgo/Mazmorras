
public class MagoPersonaje  extends Personaje{
    private int mana = 1000; // cantidad de mana en total

    // Este es el Constructor
    public MagoPersonaje(String nombre , int nivel_de_personaje , int puntosdeVida , Inventario inventario , int mana){
        super(nombre,nivel_de_personaje , puntosdeVida , inventario);
        this.mana = mana;
    }
    //Getter y setter para el atributo de mana
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    // Método para mostrar el mana actual
    public void mostrarMana() {
        System.out.println("Mana actual: " + mana);
    }

    //Método para lanzar el hechizo
    public void lanzarHechizo(int CostoMana) {
        if(mana >= CostoMana){
            mana -= CostoMana;
            System.out.println("Hechizo lanzado. Mana restante: " + mana);
        } else{
            System.out.println("No tienes suficiente mana para lanzar el hechizo");
        }
    }
    // Método para recargar mana
    public void recargarMana(int cantidad){
        mana += cantidad;
        System.out.println("Mana recargado. Mana actual: " + mana);
    }

}
