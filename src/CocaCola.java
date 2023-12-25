import java.util.Scanner;
public class CocaCola {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        String name = "";
        int key = 0;
        int antiguedad = 0;

        System.out.println("Welcome to The Coca-Cola Company holidays progam");
        System.out.println("Insert the worker name: ");
        name = in.nextLine();
        System.out.println("Write the worker key number: ");
        key = in.nextInt();
        System.out.println("How much time the worker is in the company? ");
        antiguedad = in.nextInt();

        if ( key == 1){
            if (antiguedad == 1){
             System.out.println("Il tempo de vacanze concesse sono di 6 giorni");
            }else if (antiguedad>=2 && antiguedad <= 6){
                System.out.println("Il tempo de vacanze concesse sono di 14 giorni");
            } else if( antiguedad >= 7){
                System.out.println("Il tempo de vacanze concesse sono di 22 giorni");
            } 
            
        }else if (key == 2){ 
          if (antiguedad == 1){
             System.out.println("Il tempo de vacanze concesse sono di 7 giorni");
            }else if (antiguedad>=2 && antiguedad <= 6){
                System.out.println("Il tempo de vacanze concesse sono di 15 giorni");
            } else if( antiguedad >= 7){
                System.out.println("Il tempo de vacanze concesse sono di 22 giorni");
            } 
        }else if (key == 3){
           if (antiguedad == 1){
             System.out.println("Il tempo de vacanze concesse sono di 10 giorni");
            }else if (antiguedad>=2 && antiguedad <= 6){
                System.out.println("Il tempo de vacanze concesse sono di 20 giorni");
            }else if( antiguedad >= 7){
                System.out.println("Il tempo de vacanze concesse sono di 30 giorni");
            } else {
                System.out.println("Uno dei valori inseriti non corrisponde a un codice del nostro sistema");
            }
         }   
    }   
}
