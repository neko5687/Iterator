import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));


        //erstellen eines Iterators
        Iterator<Integer> iter = numbers.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        //Könnte ich doch auch mit For-each-Loop machen -->

        System.out.println("Mit For-each");
        for (Integer number : numbers) {
            System.out.println(number);
            //numbers.remove(number); --> geht nicht
        }


        //Wichtig falls ich nochmal über die Liste iterieren will --> iterator neu machen, weil:
        System.out.println("\nHat Iterator noch Elemente?: " + iter.hasNext());

        iter = numbers.iterator();


        // Was kann ein Iterator denn noch?
        System.out.println("\nElemente während des Loops entfernen");
        while (iter.hasNext()) {
            if (iter.next() > 10) {
                iter.remove();
            }
        }
        System.out.println(numbers);

        // Und was noch?

        System.out.println("\nÜber mehrere Collections gleichzeitig iterieren");

        iter = numbers.iterator();
        List<String> strings = new ArrayList<>(List.of("Eins", "Zwei", "Drei"));
        Iterator<String> stringIter = strings.iterator();

        while (iter.hasNext() && stringIter.hasNext()) {
            System.out.println(iter.next() + ":" + stringIter.next());
        }

    }
}