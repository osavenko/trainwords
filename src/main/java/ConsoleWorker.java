import trainwords.Operation;
import trainwords.ex.IllegalOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleWorker {
    public static Operation askOperation() throws IOException, IllegalOperationException {
        String userInput = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            userInput = reader.readLine();
            if (userInput.matches("[0-4]")){
                break;
            }
        }
        return Operation.getOperation(Integer.parseInt(userInput));
    }
    public static void printMenu(){
        System.out.println("Меню");
        System.out.println("0. Выход");
        System.out.println("1. Открыть файл со спряжениями глаголов");
        System.out.println("2. Сохранить фыйл спряжений глаголов");
        System.out.println("3. Добавить новый глагол");
    }
}
