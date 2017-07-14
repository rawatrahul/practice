import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int N = Integer.parseInt(br.readLine());
        String [] values = br.readLine().split(" ");
        int size = values.length;
        ArrayNumber[] array= new ArrayNumber[size];
        for(int i=0; i<size;i++){
            array[i] = new ArrayNumber(values[i]);
        }
        Arrays.sort(array);
        for(int i=0;i<size;i++){
            System.out.print(array[i].str);
        }
    }
}
class ArrayNumber implements Comparable<ArrayNumber>{
    String  str;
    ArrayNumber(String str){
        this.str = str;
    }
    @Override
    public int compareTo(ArrayNumber obj) {
        Integer num1 = Integer.parseInt(this.str + (String) obj.str);
        Integer num2 = Integer.parseInt((String )obj.str + this.str);
        return num2 - num1;
    }
}
