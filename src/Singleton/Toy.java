package Singleton;

public class Toy {
    private static volatile Toy toyObj;
    private String name;
    private String color;
    private static int ctr;
    private Toy(String name, String color) {
        this.name = name;
        this.color = color;
        ctr = 0;
    }

    public static Toy getToyObj(String name, String color) {
        if(toyObj == null) {
            synchronized (Toy.class) {
                if (toyObj == null) {
                    toyObj = new Toy(name, color);
                }
            }
        }
        ctr++;
        return toyObj;
    }

    public static void exist(Toy e) {
        if(ctr == 0) {
            System.out.println("Toy does not exist. Please create a new one.");
        } else if(ctr == 1) {
            System.out.println("New toy creation successful. It shall be named " + e.name + " and have the color " + e.color + ".");
        } else {
            ctr--;
            System.out.println("Toy already exists. Cannot create another toy.");
        }
    }

    public void remarks() {
        System.out.print("REMARKS: ");
        if(Owner.ctr == 0) {
            System.out.println("Way uyab checkkkk");
        } else if(Owner.ctr == 1) {
            System.out.println("Loyal checkkkk");
        } else {
            System.out.println("Cheater checkkkk");
        }
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
