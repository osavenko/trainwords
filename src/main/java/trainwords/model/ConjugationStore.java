package trainwords.model;

import java.util.ArrayList;
import java.util.List;

public class ConjugationStore {
    private List<Conjugation> lists = new ArrayList<Conjugation>();

    public ConjugationStore() {
    }

    public ConjugationStore(List<Conjugation> lists) {
        this.lists = lists;
    }
    public void addConjugation(Conjugation conjugation){
        lists.add(conjugation);
    }
    public void setConjugationStore(List<Conjugation> lists){
        this.lists = lists;
    }
    public List<Conjugation> getConjugationStore(){
        return this.lists;
    }
    public Conjugation getConjugationByIndex(int id){
        if(id>lists.size()-1&&id<0){
            throw new IndexOutOfBoundsException();
        }
        return lists.get(id);
    }
    public int size(){
        return lists.size();
    }
}
