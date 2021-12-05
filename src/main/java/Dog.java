public class Dog extends Animal {
    public Dog() {
        super();
//        super.setColor("black");
        this.color = "brown";
    }

//    @Override
    public void setColor(String color) {
        this.color = color;
        super.setColor(color);
        System.out.println("Attempted to set both super and subclass colors?\n");
    }

    public String getColor() {
        return super.getColor();
//        return this.color;
    }

    public void printColor() {
        super.printColor();
    }
}
