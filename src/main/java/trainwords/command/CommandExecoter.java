package trainwords.command;

import trainwords.Operation;

import java.util.HashMap;
import java.util.Map;

public class CommandExecoter {

    static Map<Operation,Command> commandMap = new HashMap<Operation, Command>();

    private CommandExecoter() {
    }

    static {
        commandMap.put(Operation.EXIT, new Command() {
            public void execute() {
                System.out.println("До скорых встреч!");
            }
        });
        commandMap.put(Operation.OPEN_CONJUGATION_STORAGE, new OpenConjugationStorageCommand());
        commandMap.put(Operation.SAVE_CONJUGATION_STORAGE, new SaveConjugationStorageCommand());
        commandMap.put(Operation.ADD_NEW_CONJUGATION, new AddNewConjugationCommand());
    }
    public static void execute(Operation operation){
        commandMap.get(operation).execute();
    }
}
