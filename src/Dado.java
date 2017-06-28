/**
 * Created by ever on 6/27/17.
 */
public class Dado {
    private String color;

    public Dado(String color) {
        this.color = color;
    }

    public int girar(){
        return (int)(Math.random()*6+1);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
