package labs_examples.input_output.labs;

import java.io.*;
import java.util.ArrayList;

public class Lego_Parse {

    public static void main(String[] args) throws IOException {

        ArrayList<Lego> bWing = new ArrayList();

        String filePath = "src/labs_examples/input_output/examples/csv_parser/bWing_lego.csv";
        String fileWritePath = "src/labs_examples/input_output/files/bWing_copy.csv";
        FileReader fr = new FileReader(filePath);
        FileWriter fw = new FileWriter(fileWritePath);


        try (BufferedReader br = new BufferedReader(fr)) {
            BufferedWriter bufferedWriter = new BufferedWriter(fw);

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                bWing.add(mapValuesToLegoObject(values));
                bufferedWriter.write(line);
            }
            bufferedWriter.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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

            for (Lego lego : bWing) {
                System.out.println(lego.toString());
            }
        }
    }

    private static Lego mapValuesToLegoObject(String[] values) {

        Lego lego = new Lego();

        lego.setCategory(values[0]);
        lego.setUniqueParts(Integer.parseInt(values[1]));
        lego.setTotal(Integer.parseInt(values[2]));

        return lego;
    }
}
