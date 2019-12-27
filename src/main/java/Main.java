import trainwords.model.Conjugation;
import trainwords.model.Word;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

/*        Word word = new Word("byc","бути");

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

        ConjugationStoreage conjugationStorage = new ConjugationStorage();
        conjugationStore.addConjugation(conByc);

        conjugationStore.save("d:\\pol.json");*/

/*
        ConjugationStorage conjugationStore2 = new ConjugationStorage();
        conjugationStore2.load("d:\\pol.json");
        System.out.println(conjugationStore2.size());*/
/*
        for (Conjugation conjugation:conjugationStore2.getConjugationStorage()){
            System.out.println(conjugation);
        }
*/

/*        Word word = new Word("znac","бути");

        Word ja = new Word("znam");
        Word ty = new Word("znasz");
        Word on = new Word("zna");
        Word my = new Word("znamy");
        Word wy = new Word("znacie");
        Word oni = new Word("znaja");
        Conjugation conZnac = new Conjugation(word);
        conZnac.setJa(ja);
        conZnac.setTy(ty);
        conZnac.setOn_ona_ono(on);
        conZnac.setMy(my);
        conZnac.setWy(wy);
        conZnac.setOni_one(oni);

        List<Conjugation> lists = conjugationStore2.getConjugationStorage();
        lists.add(conZnac);
        conjugationStore2.setConjugationStorage(lists);

        for (Conjugation conjugation:conjugationStore2.getConjugationStorage()){
            System.out.println(conjugation);
        }
        conjugationStore2.save("d:\\pol.json");*/
    }
}
