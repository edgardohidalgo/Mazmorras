import java.util.ArrayList;

public class Inventario {

    private ArrayList<Equipamiento> equipamiento;

    public Inventario() {
        equipamiento = new ArrayList<>();
    }


    public void agregarEquipamiento(Equipamiento equipamiento) {
        this.equipamiento.add(equipamiento);
    }


    public void mostrarInventario() {
        if (equipamiento.isEmpty()) {
            System.out.println("Tu inventario esta vacio farmea más");
        } else {
            System.out.println("Te mostrare tu inventario ");
            for (Equipamiento equipo1 : equipamiento) {
                System.out.println(equipo1);
            }
        }
    }
}
