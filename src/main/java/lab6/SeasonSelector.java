package lab6;
import lab6.sesons.autumn.November;
import lab6.sesons.autumn.October;
import lab6.sesons.autumn.September;
import lab6.sesons.spring.April;
import lab6.sesons.spring.March;
import lab6.sesons.spring.May;
import lab6.sesons.summer.August;
import lab6.sesons.summer.July;
import lab6.sesons.summer.June;
import lab6.sesons.winter.December;
import lab6.sesons.winter.February;
import lab6.sesons.winter.January;


public class SeasonSelector {

    public SeasonSelector(){

    }

    public String[] select (int indexMonth){
        String monthName = "";
        String season = "";

        switch (indexMonth) {
            case 1:  monthName = January.name;
            season = January.season;
                break;

            case 2:  monthName = February.name;
            season = February.season;
                break;
            case 3:  monthName = March.name;
            season = March.season;
                break;
            case 4:  monthName = April.name;
            season = April.season;
                break;
            case 5:  monthName = May.name;
            season = May.season;
                break;
            case 6:  monthName = June.name;
            season = June.season;
                break;
            case 7:  monthName = July.name;
            season = July.season;
                break;
            case 8:  monthName = August.name;
            season = August.season;
                break;
            case 9:  monthName = September.name;
            season = September.season;
                break;
            case 10: monthName = October.name;
            season = October.season;
                break;
            case 11: monthName = November.name;
            season = November.season;
                break;
            case 12: monthName = December.name;
            season = December.season;
                break;
        }


        return new String[] {monthName, season};


    }


}
