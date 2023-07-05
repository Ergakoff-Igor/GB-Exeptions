import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveContact {

        public void write(Contact contact) {
        try {
            FileWriter writer = new FileWriter(new File(contact.getLastName() + ".txt"), true);
                writer.write(contact.toString());
                writer.write("\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
