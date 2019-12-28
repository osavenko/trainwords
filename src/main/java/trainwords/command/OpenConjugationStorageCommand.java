package trainwords.command;


import trainwords.model.ConjugationStorage;

import java.io.IOException;

public class OpenConjugationStorageCommand extends FileWorker implements Command {
    public void execute() {
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
