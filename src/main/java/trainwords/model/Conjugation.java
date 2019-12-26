package trainwords.model;

public class Conjugation {
    private Word infinitive;
    private Word ja;
    private Word ty;
    private Word on_ona_ono;
    private Word my;
    private Word wy;
    private Word oni_one;

    public Word getInfinitive() {
        return infinitive;
    }

    public void setInfinitive(Word infinitive) {
        this.infinitive = infinitive;
    }

    public Word getJa() {
        return ja;
    }

    public void setJa(Word ja) {
        this.ja = ja;
    }

    public Word getTy() {
        return ty;
    }

    public void setTy(Word ty) {
        this.ty = ty;
    }

    public Word getOn_ona_ono() {
        return on_ona_ono;
    }

    public void setOn_ona_ono(Word on_ona_ono) {
        this.on_ona_ono = on_ona_ono;
    }

    public Word getMy() {
        return my;
    }

    public void setMy(Word my) {
        this.my = my;
    }

    public Word getWy() {
        return wy;
    }

    public void setWy(Word wy) {
        this.wy = wy;
    }

    public Word getOni_one() {
        return oni_one;
    }

    public void setOni_one(Word oni_one) {
        this.oni_one = oni_one;
    }

    public Conjugation(Word infinitive) {
        this.infinitive = infinitive;
    }

    public Conjugation(Word infinitive, Word ja, Word ty, Word on_ona_ono, Word my, Word wy, Word oni_one) {
        this.infinitive = infinitive;
        this.ja = ja;
        this.ty = ty;
        this.on_ona_ono = on_ona_ono;
        this.my = my;
        this.wy = wy;
        this.oni_one = oni_one;
    }

    public Conjugation() {
    }

    @Override
    public String toString() {
        return "Conjugation{" +
                "infinitive=" + infinitive +
                ", ja=" + ja +
                ", ty=" + ty +
                ", on_ona_ono=" + on_ona_ono +
                ", my=" + my +
                ", wy=" + wy +
                ", oni_one=" + oni_one +
                '}';
    }
}
