package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class ExerciseTwo {
    public static void main(String[] args) throws IOException {
        String fileReadPath = "src/labs_examples/input_output/files/char_data.txt";
        String fileWritePath = "src/labs_examples/input_output/files/char_data_encrypt.txt";
        FileReader fr = new FileReader(fileReadPath);
        FileWriter fw = new FileWriter(fileWritePath);


        int i = 0;

        try {
            BufferedReader bufferedReader = new BufferedReader(fr);
            BufferedWriter bufferedWriter = new BufferedWriter(fw);

            while((i = bufferedReader.read()) != -1){
                char c = (char) (i+5);
                System.out.print(c);
                bufferedWriter.write(c);
            }
            bufferedWriter.flush();


        } catch (IOException exc) {
            System.out.println("Error detected");
            System.out.println(exc.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException exc) {
                System.out.println("Error closing inputStream");
            }
            if (fw != null) {
                fw.close();
            }
        }

        }
    }
