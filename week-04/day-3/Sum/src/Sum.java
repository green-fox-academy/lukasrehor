import java.util.ArrayList;

class Sum {

    int sumElemets(ArrayList<Integer> myList) {
        int x = 0;
        for (int i = 0; i < myList.size(); i++) {
            x += myList.get(i);
        }
        return x;
    }
}