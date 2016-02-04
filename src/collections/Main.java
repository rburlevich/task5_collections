package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Raman_Burlevich on 2/4/2016.
 */
public class Main {
    public static void main(String[] args){
        List<Detail> containerOfDetails = new LinkedList<Detail>();
        containerOfDetails.add(new Detail(18, 5));
        containerOfDetails.add(new Detail(11, 35));
        containerOfDetails.add(new Detail(28, 7));
        containerOfDetails.add(new Detail(16, 13));
        containerOfDetails.add(new Detail(17, 13));
        containerOfDetails.add(new Detail(3, 28));
        containerOfDetails.add(new Detail(13, 14));
        containerOfDetails.add(new Detail(13, 15));
        containerOfDetails.add(new Detail(8, 14));

        System.out.println("==========List of details==========");

        for(Detail d : containerOfDetails){
            System.out.println(d);
        }

        System.out.println("\n==========Sorted List of details==========");

        Collections.sort(containerOfDetails, new SortingByTime());
        for(Detail d : containerOfDetails){
            System.out.println(d);
        }
    }
}
