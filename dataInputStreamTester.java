import java.io.DataInputStream;
import java.io.FileInputStream;
public class dataInputStreamTester {
    public static void main(String[] args) {
        DataInputStream dis;
        try{
            dis=new DataInputStream(new FileInputStream("data.dat"));
            int roll=dis.readInt();
            boolean isActive=dis.readBoolean();
            float fee=dis.readFloat();
            String name=dis.readUTF();
            dis.close();
            System.out.println("ID: "+roll);
            System.out.println("Active: "+isActive);
            System.out.println("Fee: "+fee);
            System.out.println("Name: "+name);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
