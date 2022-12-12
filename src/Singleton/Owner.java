package Singleton;

public class Owner {
    String name;
    public static int ctr = 0;
    public Owner(String name) {
        this.name = name;
        ctr++;
    }

    public void ownToy(Toy e) {
        System.out.println(name + " owns the toy " + e.getName());
    }

}
