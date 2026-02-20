import java.io.FileInputStream;

public class fileputstreamtester {
    public static void main(String[] args) {
        int i;
        try{
            FileInputStream fin=new FileInputStream("test.txt");
            
            System.out.println("size of file: "+fin.available() +" bytes");
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }
        catch(Exception e){
            //to handle the exception
        }

    }
}
