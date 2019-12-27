package trainwords.command;

import trainwords.model.Conjugation;

import java.util.List;

interface Command {
    void execute(List<Conjugation> list);
}
