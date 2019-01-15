package pl.Java8_OOP_Helion.OOP_04_03;

public class Main_04_03 {


    public static void main(String[] args) {


        int monthNumber = 1;

        String monthName = "";

        switch (monthNumber) {
            case 1:
                monthName = "styczen";
                System.out.println(monthName);
                break;
            case 2:
                monthName = "luty";
                System.out.println(monthName);
                break;
            case 3:
                monthName = "marzec";
                System.out.println(monthName);
                break;
            case 4:
                monthName = "kwiecien";
                System.out.println(monthName);
                break;
            case 5:
            case 6:
                System.out.println("maj olub czerwiec");

            default:
                System.out.println("nie ma takeigo miesica");
                break;
        }

                switch (monthName){
                    case "Styczeń":
                        System.out.println("pierwszy miesiac");
                    case "Luty":
                }
        }

    }

