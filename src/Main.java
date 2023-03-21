public class Main {
    public static void main(String[] args) {

        float coat = 70;
        byte coat_Discount = 77;
        float hat = 25;
        byte hat_Discount = 37;
        float businessSuit = 53;
        byte businessSuit_Discount = 44;
        float shirt = 19;
        byte shirt_Discount = 0;
        float shoes = 41;
        byte shoes_Discount = 32;

        float myCount = 312;

        float count = ((coat - ((coat_Discount / 100) * coat)) + (hat - ((hat_Discount / 100) * hat))
                + (businessSuit - ((businessSuit_Discount / 100) * businessSuit))
                + (shirt - ((shirt_Discount / 100) * shirt)) + (shoes - ((shoes_Discount / 100) * shoes)) );

        System.out.println("Хватит ли денег на новый комплект деловой одежды?");

        if (count > myCount) System.out.println("Не хватает, будем копить еще :(");
        else System.out.println("Ура, хватает, вечером идем гулять :)");

    }
}