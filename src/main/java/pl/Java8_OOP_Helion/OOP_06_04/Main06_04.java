package pl.Java8_OOP_Helion.OOP_06_04;

public class Main06_04 {


    public static void main(String[] args) {

        int[] numbers = {1,3,5,7,9,2,4,6,8,10};
        int n=0;


        // BREAK
//        for (int i=0; i<numbers.length; i++){
//                System.out.println("value = "+ numbers[i]);
//                if(numbers[i]% 2 == 0){
//                    System.out.println("napotkano parzysta");
//                    break; // ten break przerywa najwyzszego fora
//                }
//                System.out.println("nie było jeszcze parzystej");
//            }

        // CONTINUE
//        for (int i=0; i<numbers.length; i++){
//            System.out.println("value = "+ numbers[i]);
//            if(numbers[i]% 2 == 0) continue; // konczy ta iteracje i przechodzi do nastepnej
//
//            System.out.println("tylko nieparzytse"); // ten napis nie jest drukowany przy parzystych
//            // bo petla zostaje przerwana i wznowiona od poczatku
//        }




        // przerywanie petli zewntrznej z poziomu petli wewnetrznej
        zewnetrzna:  // etykieta pętli
        for (int j=0; j<10; j++){
            for (int i=0; i<numbers.length; i++) {
                System.out.println("value = " + numbers[i]);
                numbers[i]++;
                if (numbers[i] > 7) break zewnetrzna; //przerywamy petle wskazujac jej etykiete
            }
            System.out.println("petla zewnetrzna");
        }

    }
}
