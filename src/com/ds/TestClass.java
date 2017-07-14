package com.ds;

/**
 * Created by rahul.rawat on 6/26/2017.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.text.DecimalFormat;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        double max=0;
        double x;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        line = br.readLine();
        String speed[] = line.split(" ");
        line = br.readLine();
        String fuel[] = line.split(" ");
        double F = Double.parseDouble(br.readLine());
        double[] d = new double[N];
        for(int i=0;i<N;i++){
            d[i]=(F/(Double.parseDouble(fuel[i]))*Double.parseDouble(speed[i]));
            if(max<d[i])
                max=d[i];
        }
        x = max*1000;
        max = x/1000.0;
        DecimalFormat df = new DecimalFormat("#.####");
        String tmp = String.valueOf(df.format(max));
        System.out.println(tmp.substring(0,tmp.length()-1));
    }
}