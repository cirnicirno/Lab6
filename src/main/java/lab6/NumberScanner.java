package lab6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberScanner {


    //public Scanner in = new Scanner(System.in);

    private int number;
    private Scanner in;
    private String line;


    public NumberScanner() {

        in = new Scanner(System.in);
    }

    public boolean isInt () {
        line = in.nextLine();
        if(Validator.isInt(line)){
            number = Integer.parseInt(line);
            if ( 0 < number && number < 13) {
                return true;
            }
        }
        return false;
    }
        public int getNumber(){
        return number;
    }
}