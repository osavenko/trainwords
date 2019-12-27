package trainwords.command;

import trainwords.model.Conjugation;

import java.util.List;

public class SaveConjugationStorageCommand implements Command {
    public void execute(List<Conjugation> list) {
        System.out.println("Сохранены спряжения глаголов.");
    }
}
