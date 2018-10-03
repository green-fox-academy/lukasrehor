public class Main {
    public static void main(String[] args) {
        PostIt first = new PostIt("Orange", "Idea1", "Blue");
        PostIt second = new PostIt("Pink", "Awesome", "Black");
        PostIt third = new PostIt("Yellow", "Superb!", "Green");
        System.out.println(third.backgroundColor);
        System.out.println(second.text);
    }
}
/*NEBO, pokud se nespecifikuje public PostIt:
PostIt first = new PostIt();
    first.backgoroundColor = "orange";
    first.text = "Idea 1";
    first.textColor = "blue";
atd.second...
 */