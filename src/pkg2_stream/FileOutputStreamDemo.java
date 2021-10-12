package pkg2_stream;

import java.io.*;

public class FileOutputStreamDemo {
    
//    public static void main(String args[]) {
//        if (args.length != 2)
//        {
//            System.err.println("Syntax - FileOutputStreamDemo src dest");
//        return;
//        }
//        String source = args[0];
//        String destination = args[1];
//        try {
//
//            FileInputStream input = new FileInputStream(
//                    source);
//            System.out.println("Opened " + source + "for reading. { }");
//            OutputStream output = new FileOutputStream(destination); 
//            System.out.println("Opened " + destination + " for writing.");
//            int data = input.read();
//            while (data != -1) {
//                output.write(data);
//                data = input.read();
//            }
//            input.close();
//            output.close();
//            System.out.println("I/O streams closed");
//        } catch (IOException ioe) {
//            System.err.println("I/O error - " + ioe);
//        }
//    }


    public static void main(String args[]) {
        //
    }

    public void outputStream(String source, String destination) {
        try {
            FileInputStream input = new FileInputStream(source);
            System.out.println("Opened " + source + "for reading. { }");
            OutputStream output = new FileOutputStream(destination);
            System.out.println("Opened " + destination + " for writing.");
            int data = input.read();
            while (data != -1) {
                output.write(data);
                data = input.read();
            }
            input.close();
            output.close();
            System.out.println("I/O streams closed");
        } catch (IOException ioe) {
            System.err.println("I/O error - " + ioe);
        }
    }
}
