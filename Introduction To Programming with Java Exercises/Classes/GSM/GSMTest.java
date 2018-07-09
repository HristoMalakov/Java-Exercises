package unit14.GSM;

import java.util.ArrayList;
import java.util.Date;

public class GSMTest {

    public static void main(String[] args){
        ArrayList<GSM> mobilePhones = new ArrayList<GSM>();
        addGSMs(mobilePhones);
        printGSMs(mobilePhones);

        ArrayList<Call> callHistory = new ArrayList<Call>();
        addCalls(callHistory);
        printCalls(callHistory);
    }

    public static ArrayList<GSM> addGSMs(ArrayList<GSM> mobilePhones){
        mobilePhones.add(new GSM("Motorola 1270","Motorola",9.95f));
        mobilePhones.add(new GSM("Nokia 1965","Nokia",19.95f));
        mobilePhones.add(new GSM("Blackberry i97","Blackberry",29.95f));

        return mobilePhones;
    }

    public static void printGSMs(ArrayList<GSM> mobilePhones){
        for(GSM phone : mobilePhones){
            System.out.println(phone.toString());
        }
    }

    public static ArrayList<Call> addCalls(ArrayList<Call> callHistory){
        /*DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43*/
        callHistory.add(new Call(new Date(),687));
        callHistory.add(new Call(new Date(),1014));
        callHistory.add(new Call(new Date(),8));

        return callHistory;
    }

    public static void printCalls(ArrayList<Call> callHistory){
        for(Call call : callHistory){
            System.out.println(call.toString());
        }
    }

    public static void deleteCallHistory(ArrayList<Call> callHistory){
        callHistory = null;
    }

}
