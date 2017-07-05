/**
 * Created by ever on 6/27/17.
 */
public class Run {
    private static String JUGADORA = "Sheyla";
    private static String JUGADORB = "Bazan";

    public static void main(String[] args){
        Jugador jugadorA = new Jugador(JUGADORA, 23, "Masculino");
        Jugador jugadorB = new Jugador(JUGADORB, 20, "Femenino");

        int resultadoA = jugadorA.tirarDado("Rojo");
        int resultadoB = jugadorB.tirarDado("Azul");

        if(resultadoA > resultadoB){
            System.out.println(
                    String.format("El ganador es el %s", jugadorA.getNombre())
            );
        }else{
            System.out.println(
                    String.format("El ganador es el %s", jugadorB.getNombre())
            );
        }
    }
}
