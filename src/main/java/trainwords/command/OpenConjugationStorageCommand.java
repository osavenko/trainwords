package trainwords.command;


import trainwords.model.Conjugation;

import java.util.List;

public class OpenConjugationStorageCommand implements Command {
    public void execute(List<Conjugation> list) {
        System.out.println("Открыт файл хранилища спряжений глаголов.");
    }
}
