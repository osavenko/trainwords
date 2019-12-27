package trainwords.command;

import trainwords.model.Conjugation;

import java.util.List;

public class AddNewConjugationCommand implements Command {
    public void execute(List<Conjugation> list) {
        System.out.println("Добавлено новое слово!");
    }
}
