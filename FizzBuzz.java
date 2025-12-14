package com.Amin.Deplacement;

public class FizzBuzz {
    static String de(int nb){
        String resultat = "";
        if (nb < 0) {
            System.out.println("Le nombre doit etre un entier positive");
            System.exit(0);
        }
        for (int i = 0; i <= nb; i++) {
            if (i % 3 == 0 && i % 5 ==0 && i != 0){
                resultat += "FizzBuzz ";
            } else if (i % 3 == 0 && i!= 0) {
                resultat += "Fizz ";
            } else if (i % 5 ==0 && i!= 0) {
                resultat += "Buzz ";
            } else resultat += Integer.toString(i) + " ";
        }
        return resultat;
    }
}
