package org.sveta.test.factorial;

/**
 * Created by sbotnar on 2/9/16.
 */
public class Main {
    public static void main(String... args) {
        log("Starting factorial probe");
        if (args==null||args.length<=0){
            log("No argument");
           throw new IllegalArgumentException("No argument");
        }

        String s = args[0]; // reference to first element in array
        log("Input = " + s);

        int a = Integer.parseInt(s);

        long res = 1;
        for (int i=1; i<=a; i++){
            res = res * i;
            log("Step = " + i + ",  res = " + res);
        }

        log("Result = " + res);

    }


    private static void log(String message) {
        System.out.println(message);
    }
}
