package one.digitalinovation.tipos.primitivos;

public class DefaultValue {
    public static void main(String[] args) {
    final Default d = new Default();
    System.out.println("Valores default: " + d.getI());
    System.out.println(d.isActive());
    }
}

class Default{
    int i;
    boolean active;

    public int getI(){return i;}
    public boolean isActive(){return active;}
}