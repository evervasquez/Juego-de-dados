/**
 * Created by ever on 6/27/17.
 */
public class Jugador {
    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public int tirarDado(String color){
        Dado dado = new Dado(color);
        int result = dado.girar();
        System.out.println(
            String.format("%s - Dado %s : %d", this.getNombre(),
                    dado.getColor(), result)
        );
        return result;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
