import trainwords.model.Conjugation;
import trainwords.model.ConjugationStore;
import trainwords.model.Word;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Word word = new Word("byc","бути");

        Word ja = new Word("jestem");
        Word ty = new Word("jestes");
        Word on = new Word("jest");
        Word my = new Word("jestesmy");
        Word wy = new Word("jestescie");
        Word oni = new Word("sa");
        Conjugation conByc = new Conjugation(word);
        conByc.setJa(ja);
        conByc.setTy(ty);
        conByc.setOn_ona_ono(on);
        conByc.setMy(my);
        conByc.setWy(wy);
        conByc.setOni_one(oni);

        ConjugationStore conjugationStore = new ConjugationStore();
        conjugationStore.addConjugation(conByc);

        conjugationStore.save("d:\\pol.json");


        ConjugationStore conjugationStore2 = new ConjugationStore();
        conjugationStore2.load("d:\\pol.json");
        System.out.println(conjugationStore2.size());
        for (Conjugation conjugation:conjugationStore2.getConjugationStore()){
            System.out.println(conjugation);
        }
    }
}
