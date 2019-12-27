package trainwords.model;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConjugationStorage {
    private List<Conjugation> lists;

    public ConjugationStorage() {
        lists = new ArrayList<Conjugation>();
    }

    public ConjugationStorage(List<Conjugation> lists) {
        this.lists = lists;
    }
    public void addConjugation(Conjugation conjugation){
        lists.add(conjugation);
    }
    public void setConjugationStorage(List<Conjugation> lists){
        this.lists = lists;
    }
    public List<Conjugation> getConjugationStorage(){
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
    public void save(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        writer.writeValue(new File(fileName), lists);
    }
    public void load(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Conjugation> rlist = new ArrayList<Conjugation>(Arrays.asList(mapper.readValue(new File(fileName),Conjugation[].class)));
        this.lists = rlist;
    }
}
