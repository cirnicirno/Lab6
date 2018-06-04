package lab6;

public class NumberInput {


    public NumberInput(){

    }
    public int input(){

        int seasonNumber;

        NumberScanner scanner = new NumberScanner();

        while (true){
            System.out.println("Пожалуйста введите номер месяца(1-12): ");
            if (scanner.isInt()){
                seasonNumber = scanner.getNumber();
                return  seasonNumber;
            }
            System.out.println("Попробуте еще раз.");
        }


    }

}
