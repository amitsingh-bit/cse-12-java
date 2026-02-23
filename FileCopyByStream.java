import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyByStream {
    public static void main(String[] args) {
        FileInputStream fin;
        FileOutputStream fout;
        int i;
        try {
            fin=new FileInputStream("test.png");
            fout=new FileOutputStream("test_cpy.png");
            System.out.println("size of file: "+fin.available());
            while((i=fin.read())!=-1)
            {
                fout.write(i);
            }
            fin.close();
            fout.close();
            System.out.println("file copied successfully");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}