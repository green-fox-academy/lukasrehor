public class Card implements Comparable<Card>{

    int color;
    int id;
    Card(int color, int id) {
        this.color = color;
        this.id = id;
    }


    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.id, o.id);
    }
}