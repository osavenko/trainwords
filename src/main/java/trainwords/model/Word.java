package trainwords.model;

public class Word {
    private String sourceWord;
    private String translationWord;

    public String getSourceWord() {
        return sourceWord;
    }

    public void setSourceWord(String sourceWord) {
        this.sourceWord = sourceWord;
    }

    public String getTranslationWord() {
        return translationWord;
    }

    public void setTranslationWord(String translationWord) {
        this.translationWord = translationWord;
    }

    public Word() {
    }

    public Word(String sourceWord, String translationWord) {
        this.sourceWord = sourceWord;
        this.translationWord = translationWord;
    }

    public Word(String sourceWord) {
        this.sourceWord = sourceWord;
    }

    @Override
    public String toString() {
        String word = (this.translationWord==null?"\"\"":this.translationWord);
        return this.sourceWord+" -> "+word;
    }
}
