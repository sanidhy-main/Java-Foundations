import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;

class ReadWriteFileSyntax {
    public static void write() {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("This file was written using Java. \n");
            writer.write("This should be on the next line.");
            writer.close();

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static void read() {
        try {
            FileReader reader = new FileReader("example.txt");
            int ch;

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();


        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

    public static void bufferedWrite() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt", true));
            writer.write("This line was written using Buffered Writer.");
            writer.close();

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static void bufferedRead() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}

class ReadWriteFileDemo {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"));
            bw.write("This line was written using a Java program.");
            bw.newLine();
            bw.write("This is on the next line.");
            bw.newLine();
            bw.write("This is on the 3rd line.");
            bw.close();

            BufferedWriter aw = new BufferedWriter(new FileWriter("example.txt", true));
            aw.write("This line is appended at the end.");
            aw.newLine();
            aw.close();

            BufferedReader br = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error handling file.");
        }
    }
}