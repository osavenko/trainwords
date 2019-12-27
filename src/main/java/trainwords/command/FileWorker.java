package trainwords.command;

import trainwords.model.Conjugation;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class FileWorker {
    private String fileName;
    private List<Conjugation> list = new ArrayList<Conjugation>();

    public List<Conjugation> getList() {
        return list;
    }

    public void setList(List<Conjugation> list) {
        this.list = list;
    }

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public String getFileName() {
        return fileName;
    }

    public void askFileName() throws IOException {
        System.out.print("Введите имя файла: ");
        File f = null;
        do {
            fileName = bufferedReader.readLine();
            if (fileName.toUpperCase().equals("exit")){
                break;
            }
            f = new File(fileName);
            if(!f.exists()){

                System.out.println("Нет такого файла!");
                System.out.println("Повторите ввод файла или введите \"exit\" для выхода.");
            }
        }while(!f.exists());
    }
}
