package Solid.SympleResponsabilityPattern;

import java.io.File;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {

    public void saveToFile(Journal journal,
                           String filename,
                           boolean overwrite) throws Exception {
        if (overwrite || new File(filename).exists())
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            }
    }

    public void load(Journal journal, String filename) {
        //Here are the implemetation
    }

    public void load(Journal journal, URL url) {
        //Here are the implemetation
    }

}
