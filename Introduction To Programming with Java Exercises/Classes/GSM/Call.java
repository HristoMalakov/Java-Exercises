package unit14.GSM;

import java.util.ArrayList;
import java.util.Date;

public class Call {
    private Date date;
    private int durationSec;
    private int callNum;

    public Call(Date date, int durationSec, int callNum){
        this.date = date;
        this.durationSec = durationSec;
        this.callNum = callNum;
    }

    public String toString(){
        return "The date of the "+this.callNum+" call is "+this.date+" and it lasted "++" minutes and "++ " seconds.";
    }

}
