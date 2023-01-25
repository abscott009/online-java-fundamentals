package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */
class ExerciseThree {
    public static void main(String[] args) throws IOException {
        String readByteOne = "src/labs_examples/input_output/files/byte_data_edited";
        String readByteTwo = "src/labs_examples/input_output/files/byte_data";
        String writeByte = "src/labs_examples/input_output/files/byte_write.txt";
        String readCharOne = "src/labs_examples/input_output/files/char_data.txt";
        String readCharTwo = "src/labs_examples/input_output/files/KtoD.txt";
        String writeChar = "src/labs_examples/input_output/files/char_write.txt";

        FileInputStream frByteOne = new FileInputStream(readByteOne);
        FileInputStream frByteTwo = new FileInputStream(readByteTwo);
        FileOutputStream fwByte = new FileOutputStream(writeByte);
        FileReader frCharOne = new FileReader(readCharOne);
        FileReader frCharTwo = new FileReader(readCharTwo);
        FileWriter fwChar = new FileWriter(writeChar);

        int i = 0;

        try {
            BufferedInputStream buffStreamOne = new BufferedInputStream(frByteOne);
            BufferedOutputStream buffStreamOut = new BufferedOutputStream(fwByte);

            while((i = buffStreamOne.read()) != -1) {
                if (i != frByteTwo.read()) {
                    buffStreamOut.write(i);
                }
            }
            buffStreamOut.flush();

        } catch (IOException exc) {
            System.out.println("Error detected");
            System.out.println(exc.getMessage());
        } finally {
            try {
                if (frByteOne.read() != -1 || frByteTwo.read() != -1) {
                    frByteOne.close();
                    frByteTwo.close();
                }
            } catch (IOException exc) {
                System.out.println("Error closing inputStream");
            }

            try {
                String[] words = null;
                BufferedReader buffCharOne = new BufferedReader(frCharOne);
                BufferedReader buffCharTwo = new BufferedReader(frCharTwo);
                BufferedWriter bufferedWriter = new BufferedWriter(fwChar);
                String s;
                String input = "program";
                int count = 0;

                while((s = buffCharOne.readLine()) != null){
                    //while((s = buffCharTwo.readLine()) != null) {
                        words = s.split(" ");
                        for (String word : words) {
                            if (word.equals(input)){
                                count++;
                            }
                        }
                    }
               // }
                System.out.println("The word 'program' appears " + count + " times between the two files.");



            } catch (IOException exc) {
                System.out.println("Error detected");
                System.out.println(exc.getMessage());
            } finally {
                try {
                    if (frCharOne != null && frCharTwo != null) {
                        frCharOne.close();
                        frCharTwo.close();
                    }
                } catch (IOException exc) {
                    System.out.println("Error closing inputStream");
                }

            }
            }
        }

    }

