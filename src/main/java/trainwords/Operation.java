package trainwords;

import trainwords.ex.IllegalOperationException;

public enum Operation {
    EXIT,
    OPEN_CONJUGATION_STORAGE,
    SAVE_CONJUGATION_STORAGE,
    ADD_NEW_CONJUGATION;
    public static Operation getOperation(int i) throws IllegalOperationException {
        switch(i){
            case 0:
                return Operation.EXIT;
            case 1:
                return Operation.OPEN_CONJUGATION_STORAGE;
            case 2:
                return Operation.SAVE_CONJUGATION_STORAGE;
            case 3:
                return Operation.ADD_NEW_CONJUGATION;
        }
        throw new IllegalOperationException();
    }
}
