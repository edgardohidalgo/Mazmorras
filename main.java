public class main {
    public static void main(String[] args) {
        Inventario inventarioMago = new Inventario();
        Inventario inventarioGuerrero = new Inventario();
        Inventario inventarioLadron = new Inventario();

        MagoPersonaje mago = new MagoPersonaje("Sergi el Tonto", 10, 100, inventarioMago, 90);
        Guerreropersonaje guerrero = new Guerreropersonaje("SUNG", 15, 150, inventarioGuerrero, false, null);
        LadronPersonaje ladron = new LadronPersonaje("Edgardo SSJ3  ", 20, 80, inventarioLadron, false);

        Equipamiento espada = new Equipamiento("Espada Del Infierno", "arma");
        Equipamiento escudo = new Equipamiento("Escudo Encantado", "armaduraProtección");
        Equipamiento varitaMagica = new Equipamiento("Varita del Tiempo", "arma");

        mago.agregarEquipamiento(varitaMagica);
        guerrero.agregarEquipamiento(escudo);
        guerrero.agregarEquipamiento(espada);
        ladron.agregarEquipamiento(espada);

        mago.mostrarInfo();
        guerrero.mostrarInfo();
        ladron.mostrarInfo();

        mago.lanzarHechizo(50);
        mago.mostrarMana();

        guerrero.proteger(mago);
        guerrero.bajarVida(35);
        guerrero.dejarDeProteger();

        ladron.hacerseInvisible();
        ladron.robar();
        ladron.hacerseInvisible();

        System.out.println("Inventario del Mago Loco:");
        mago.getInventario().mostrarInventario();

        System.out.println("Inventario del Guerrero Magnifico:");
        guerrero.getInventario().mostrarInventario();

        System.out.println("Inventario del Puerco del Ladrón:");
        ladron.getInventario().mostrarInventario();
    }
}
