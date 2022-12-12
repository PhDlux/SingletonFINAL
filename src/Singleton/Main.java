package Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Toy hermi = null;
        Toy.exist(hermi);

        Scanner cin = new Scanner(System.in);
        System.out.print("Enter toy name: ");
        String name = cin.nextLine();
        System.out.print("Enter toy color: ");
        String color = cin.nextLine();

        hermi = Toy.getToyObj(name, color);
        Toy.exist(hermi);

        Owner person;
        String pName;
        List<Owner> owner = new ArrayList<>();

        while(true) {
            System.out.print("Add owner: ");
            pName = cin.nextLine();
            if(pName.equals("DONE")) break;
            person = new Owner(pName);
            owner.add(person);
        }

        for(Owner o : owner) {
            o.ownToy(hermi);
        }

        hermi.remarks();

        System.out.print("Do you want to add another toy? (1/0): ");
        int ans = cin.nextInt();

        Toy joed;
        if(ans == 1) {
            cin.nextLine();
            System.out.print("Enter toy name: ");
            name = cin.nextLine();
            System.out.print("Enter toy color: ");
            color = cin.nextLine();

            joed = Toy.getToyObj(name, color);
            Toy.exist(joed);

            for(Owner o : owner) {
                o.ownToy(joed);
            }

            joed.remarks();
        } else {
            System.err.println("Program Executed Successfully.\nSir Serato cutie *mwah*" );
        }


    }
}
