package trainwords.command;


import trainwords.model.Conjugation;
import trainwords.model.ConjugationStorage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OpenConjugationStorageCommand extends FileWorker implements Command {
    public void execute(List<Conjugation> list) {
        System.out.println("Открыт файл хранилища спряжений глаголов.");
        try {
            askFileName();

            ConjugationStorage conjugationStorage = new ConjugationStorage();
            conjugationStorage.load(this.getFileName());
            this.setList(conjugationStorage.getConjugationStorage());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
