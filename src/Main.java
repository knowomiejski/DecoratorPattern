import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Reader reader1 = new FileReader("file.txt");
        Reader reader2 = new BufferedReader(reader1);
        Reader reader3 = new PushbackReader(reader2);

        Reader reader4 = new PushbackReader(new BufferedReader(new LineNumberReader(new BufferedReader(new PipedReader()))));
    }
}
