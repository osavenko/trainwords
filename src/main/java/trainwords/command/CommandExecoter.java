package trainwords.command;

import trainwords.Operation;
import trainwords.model.Conjugation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandExecoter {

    static Map<Operation,Command> commandMap = new HashMap<Operation, Command>();
    static List<Conjugation> list = new ArrayList<Conjugation>();

    public static List<Conjugation> getList() {
        return list;
    }

    public static void setList(List<Conjugation> list) {
        CommandExecoter.list = list;
    }

    private CommandExecoter() {
    }

    static {
        commandMap.put(Operation.EXIT, new Command() {
            public void execute(List<Conjugation> list) {
                System.out.println("До скорых встреч!");
            }
        });
        commandMap.put(Operation.OPEN_CONJUGATION_STORAGE, new OpenConjugationStorageCommand());
        commandMap.put(Operation.SAVE_CONJUGATION_STORAGE, new SaveConjugationStorageCommand());
        commandMap.put(Operation.ADD_NEW_CONJUGATION, new AddNewConjugationCommand());
    }
    public static void execute(Operation operation, List<Conjugation> list){
        Command com = commandMap.get(operation);
        com.execute(list);
        if (com instanceof FileWorker){
            setList(((FileWorker) com).getList());
        }

    }
}
