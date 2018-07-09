package unit9;

public class LastNumPrinter {

    public static void main(String[] args) {
        int num = 1024;
        String lastNum = lastNumToWord(num);
        System.out.printf("The last number of %d is %s",num,lastNum);
    }

    public static String lastNumToWord(int num){
        String lastStr = new String();
        int lastNum = 0;

            lastNum = num % 10;
                switch(lastNum){
                    case 0:
                        lastStr = "zero"; break;
                    case 1:
                        lastStr = "one"; break;
                    case 2:
                        lastStr = "two"; break;
                    case 3:
                        lastStr = "three"; break;
                    case 4:
                        lastStr = "four"; break;
                    case 5:
                        lastStr = "five"; break;
                    case 6:
                        lastStr = "six"; break;
                    case 7:
                        lastStr = "seven"; break;
                    case 8:
                        lastStr = "eight"; break;
                    case 9:
                        lastStr = "nine"; break;
            }
        return lastStr;
    }
}
