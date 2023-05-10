package milosbogdanovic;

import java.util.*;

public class PrimerStack {
    public static void main(String[] args) {
        Stack<String> stek = new Stack<>();

        // Dodavanje elemenata na stek
        stek.push("Ana");
        stek.push("Milica");
        stek.push("Marko");
        stek.push("Pera");
        
        // Uklanjamo jedan element
        stek.pop();

        // ISpitujemo da li je stek prazan
        if (stek.empty()) {
            System.out.println("Stek je prazan.");
        } else {
            System.out.println("Stek nije prazan.");
        }

        // Provera koji je element na vrhu steka
        String topElement = stek.peek();
        System.out.println("Element na vrhu steka je: " + topElement);

        // Isisivanje elemenata steka - - - Element "Pera" je uklonjen
        while (!stek.empty()) {
            String element = stek.pop();
            System.out.println(element);
        }
    }
}
