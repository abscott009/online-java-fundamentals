package labs_examples.input_output.labs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Input/Output Exercise 1: File input/output
 * <p>
 * Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 * Make sure you close the connections to both files.
 */

class ExceriseOne {
    public static void main(String[] args) throws IOException {
        String fileReadPath = "src/labs_examples/input_output/files/byte_data";
        String fileWritePath = "src/labs_examples/input_output/files/byte_data_copy.txt";
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try {
            inputStream = new FileInputStream(fileReadPath);
            bufferedInputStream = new BufferedInputStream(inputStream);
            outputStream = new FileOutputStream(fileWritePath);

            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while((bytesRead = bufferedInputStream.read(buffer)) != -1){
                System.out.print(new String(buffer,0,bytesRead));
                outputStream.write(buffer, 0, bytesRead);
            }

            {
            }
        } catch (IOException exc) {
            System.out.println("Error detected");
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException exc) {
                System.out.println("Error closing inputStream");
            }
            if (outputStream != null) {
                outputStream.close();
            }

        }
    }

}
