package pkg2_stream;

import java.io.*;

public class FileInputStreamDemo {
    
//    public static void main(String args[]) {
//        if (args.length != 1) {
//            System.err.println("Syntax - FileInputStreamDemo file");
//        return;
//        }
//        try {
//            InputStream fileInput = new FileInputStream(args[0]
//            );
//            int data = fileInput.read();
//            while (data != -1)
//            {
//                System.out.write(data); 
//                data = fileInput.read();
//            }
//            fileInput.close(); 
//        } catch (IOException ioe) {
//            System.err.println("I/O error - " + ioe);
//        }
//    }


    public static void main(String args[]) throws IOException {
        //
    }
    
    public void inputStream(String dir){
        try {
            FileInputStream fileInput = new FileInputStream(dir);
            int data = fileInput.read();
            while (data != -1)
            {
                data = fileInput.read();
            }
            fileInput.close(); 
        } catch (IOException ioe) {
            System.err.println("I/O error - " + ioe);
        }
    }
}
