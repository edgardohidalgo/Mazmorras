public class Guerreropersonaje extends Personaje {
    private boolean protegiendo;
    private Personaje compañeroProtegido;

    public Guerreropersonaje(String nombre , int nivel_de_personaje , int puntosdeVida , Inventario inventario , boolean protegieno , Personaje compañeroProtegido){
        super(nombre,nivel_de_personaje , puntosdeVida , inventario);
        this.protegiendo = protegiendo;
        this.compañeroProtegido = compañeroProtegido;
    }

    public boolean isProtegiendo() {
        return protegiendo;
    }
    public void setProtegiendo(Personaje compañeroProtegido) {
        this.compañeroProtegido = compañeroProtegido ;
    }

    public Personaje getCompañeroProtegido() {
        return compañeroProtegido;
    }

    public void setCompañeroProtegido(Personaje compañeroProtegido) {
        this.compañeroProtegido = compañeroProtegido;
    }
    public void proteger(Personaje compañero) {
        if (protegiendo) {
            System.out.println(getNombre() + " ya está protegiendo a " + compañeroProtegido.getNombre() + " y no puede proteger a otro personaje.");
            return;
        }
        this.protegiendo = true;
        this.compañeroProtegido = compañero;
        System.out.println(getNombre() + " ahora está protegiendo a " + compañero.getNombre() + ", reduciendo el daño que recibe a la mitad.");
    }

    public void dejarDeProteger() {
        if (!protegiendo) {
            System.out.println(getNombre() + " no está protegiendo a ningun compañero");
            return;
        }
        System.out.println(getNombre() + " deja de proteger  a " + compañeroProtegido.getNombre() + ".");
        this.protegiendo = false;
        this.compañeroProtegido = null;
    }

    @Override
    public void bajarVida(int vida) {
        if (protegiendo && compañeroProtegido != null) {
            int vidaReducida = vida / 2;
            System.out.println(getNombre() + " está protegiendo a " + compañeroProtegido.getNombre() + " y recibe solo " + vidaReducida + " de daño en vez de " + vida + ".");
            super.bajarVida(vidaReducida);
        } else {
            super.bajarVida(vida);
        }
    }

    public Personaje estaProtegiendo() {
        return compañeroProtegido;
    }






}
