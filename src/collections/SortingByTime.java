package collections;

import java.util.Comparator;

/**
 * Created by Raman_Burlevich on 2/4/2016.
 */
public class SortingByTime implements Comparator<Detail>{

    @Override
    public int compare(Detail d1, Detail d2) {
        int minTimeOfd1, minTimeOfd2, maxTimeOfd1, maxTimeOfd2;
        if(d1.getTimeForFirstMachine()>d1.getTimeForSecondMachine()){
            minTimeOfd1 = d1.getTimeForSecondMachine();
            maxTimeOfd1 = d1.getTimeForFirstMachine();
        } else{
            minTimeOfd1 = d1.getTimeForFirstMachine();
            maxTimeOfd1 = d1.getTimeForSecondMachine();
        }

        if(d2.getTimeForFirstMachine()>d2.getTimeForSecondMachine()){
            minTimeOfd2 = d2.getTimeForSecondMachine();
            maxTimeOfd2 = d2.getTimeForFirstMachine();
        } else{
            minTimeOfd2 = d2.getTimeForFirstMachine();
            maxTimeOfd2 = d2.getTimeForSecondMachine();
        }

        if(minTimeOfd1 == minTimeOfd2){
            return  maxTimeOfd1 - maxTimeOfd2;
        }

        return minTimeOfd1 - minTimeOfd2;
    }
}
