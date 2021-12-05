public class Animal {
    String sound = "bark";
    int weight = 100;
    String color = "white";

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        System.out.println("Animal super class setColor()");
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void printColor() {
        System.out.println(this.color + " from super class");
    }
}
