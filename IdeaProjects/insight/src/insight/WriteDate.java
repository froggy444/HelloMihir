package insight;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDate {



        private static final String FILENAME = "./src/insight/medianvals_by_date.txt";

        public void WriteFile1(String output) {



            BufferedWriter bw = null;
            FileWriter fw = null;

            try {

                String data = output+"\n";

                File file = new File(FILENAME);

                // if file doesnt exists, then create it
                if (!file.exists()) {
                    file.createNewFile();
                }

                // true = append file
                fw = new FileWriter(file.getAbsoluteFile(), true);
                bw = new BufferedWriter(fw);

                bw.write(data);

                //System.out.println("Done");

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }

        }

    }

