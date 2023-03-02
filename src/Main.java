import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]){
        try {
            BufferedWriter br=new BufferedWriter(new FileWriter("C:\\Users\\Baby Beast\\Desktop\\finalisima\\trial.txt"));
        br.write("Password");
            br.write("Bughatti");
            br.write("Hennesy");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
