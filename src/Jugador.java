/**
 * Created by ever on 6/27/17.
 */
public class Jugador extends Persona{

    public Jugador(String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
    }

    public int tirarDado(String color){
        Dado dado = new Dado(color);
        int result = dado.girar();
        System.out.println(
            String.format("%s - Dado %s : %d",
                    this.getNombre(),
                    dado.getColor(), result)
        );
        return result;
    }
}

