package unit8;

public class HexadecToBinAndDec {

    public static void main(String[] args) {

        String N = "2A3E";
        int decNum = hexadecToDec(N);
        StringBuilder binNum = hexadecToBin(N);

        System.out.printf("The number %s in hexadecimal is equal to %d in decimal and %s in binary",N,decNum,binNum);
    }

    public static int hexadecToDec(String N){
        int sum=0;

        for(int i=0; i<N.length(); i++){
            //int a = Integer.parseInt(Character.toString(N.charAt(i)));
            String current = (Character.toString(N.charAt(i)));

                switch(current){
                    case "0":
                        sum+=0; break;
                    case "1":
                        sum+=1*Math.pow(16,N.length()-i-1); break;
                    case "2":
                        sum+=2*Math.pow(16,N.length()-i-1); break;
                    case "3":
                        sum+=3*Math.pow(16,N.length()-i-1); break;
                    case "4":
                        sum+=4*Math.pow(16,N.length()-i-1); break;
                    case "5":
                        sum+=5*Math.pow(16,N.length()-i-1); break;
                    case "6":
                        sum+=6*Math.pow(16,N.length()-i-1); break;
                    case "7":
                        sum+=7*Math.pow(16,N.length()-i-1); break;
                    case "8":
                        sum+=8*Math.pow(16,N.length()-i-1); break;
                    case "9":
                        sum+=9*Math.pow(16,N.length()-i-1); break;
                    case "A":
                        sum+=10*Math.pow(16,N.length()-i-1); break;
                    case "B":
                        sum+=11*Math.pow(16,N.length()-i-1); break;
                    case "C":
                        sum+=12*Math.pow(16,N.length()-i-1); break;
                    case "D":
                        sum+=13*Math.pow(16,N.length()-i-1); break;
                    case "E":
                        sum+=14*Math.pow(16,N.length()-i-1); break;
                    case "F":
                        sum+=15*Math.pow(16,N.length()-i-1); break;
                }
            }


        return sum;
    }

    public static StringBuilder hexadecToBin(String N){
        StringBuilder binNum = new StringBuilder();
        for(int i = 0; i<N.length(); i++){
            char c = N.charAt(i);
            switch(c){
                case '0':
                    binNum.append("0000"); break;
                case '1':
                    binNum.append("0001"); break;
                case '2':
                    binNum.append("0010"); break;
                case '3':
                    binNum.append("0011"); break;
                case '4':
                    binNum.append("0100"); break;
                case '5':
                    binNum.append("0101"); break;
                case '6':
                    binNum.append("0110"); break;
                case '7':
                    binNum.append("0111"); break;
                case '8':
                    binNum.append("1000"); break;
                case '9':
                    binNum.append("1001"); break;
                case 'A':
                    binNum.append("1010"); break;
                case 'B':
                    binNum.append("1011"); break;
                case 'C':
                    binNum.append("1100"); break;
                case 'D':
                    binNum.append("1101"); break;
                case 'E':
                    binNum.append("1110"); break;
                case 'F':
                    binNum.append("1111"); break;
            }
        }

        return binNum;
    }
}


