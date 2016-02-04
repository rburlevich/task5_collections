package collections;

/**
 * Created by Raman_Burlevich on 2/4/2016.
 */
public class Detail {

    private int timeForFirstMachine, timeForSecondMachine;

    Detail(int timeForFirstMachine, int timeForSecondMachine){
        this.timeForFirstMachine = timeForFirstMachine;
        this.timeForSecondMachine = timeForSecondMachine;
    }

    public int getTimeForFirstMachine() {
        return timeForFirstMachine;
    }

    public int getTimeForSecondMachine() {
        return timeForSecondMachine;
    }

    @Override
    public String toString(){
        return "Detail ["+timeForFirstMachine+", "+timeForSecondMachine+"]";
    }
}
