package lab6;


public class SeasonIdentifierCore {



    public SeasonIdentifierCore(){

    }

    public void handler(){

        SeasonPropertyPrinter property = new SeasonPropertyPrinter();
        SeasonSelector selector = new SeasonSelector();
        NumberInput number = new NumberInput();

        property.print(selector.select(number.input()));

    }

}
