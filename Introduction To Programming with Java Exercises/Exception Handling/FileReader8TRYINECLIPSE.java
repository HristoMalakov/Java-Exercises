package uni12;

import java.io.*;

public class FileReader8TRYINECLIPSE {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = null;
        BufferedReader br = null;
        String fileName = "C:\\Workspace_Hristo\\Nakov_Java\\src\\uni12\\FileToRead8.txt";

        try {
            fis = new FileInputStream(fileName);
            br = new BufferedReader(new InputStreamReader(fis));
            String temp = null;
            while((temp = br.readLine()) != null){
                System.out.println(temp);
            }
        }catch(FileNotFoundException fnfe){
            System.out.println("The file \\"+fileName+"\\ does not exist. Unable to read it.");
        }finally{
            if(br != null){
                br.close();
            }
            if(fis!=null){
                fis.close();
            }
        }

    }

}
