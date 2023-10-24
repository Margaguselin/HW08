import java.util.*;

public class Collections {
    public static void main(String[] args) {
        Set<Integer> x = Set.of(1, 2, 3, 4);
        Set<Integer> y = Set.of(5, 2, 7, 1);

        Set<Integer> result = intersection(x, y);
        System.out.println("intersection(x, y) - " + result);

        Set<Integer> result2 = difference(x, y);
        System.out.println("difference(x, y) - " + result2);

        String input = "Hello this is a string that contains Hello and others words";
        Map<String, Integer> wordCounts = countWords(input);

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }

        List<Book> books = List.of(new Book("abc", "a", 123, Genre.HORROR),
                new Book("abc2", "a", 1777, Genre.HORROR),
                new Book("123", "b", 1230, Genre.COMEDY),
                new Book("321", "b", 1243, Genre.COMEDY),
                new Book("title", "c", 1923, Genre.HORROR),
                new Book("title 2", "d", 2023, Genre.HORROR));


        System.out.println(groupBooksByAuthor(books));
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> intersectionSet = new HashSet<>(set1);

        intersectionSet.retainAll(set2);

        return intersectionSet;

    }

    public static Set<Integer> difference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> differenceSet = new HashSet<>(set1);

        differenceSet.removeAll(set2);

        return differenceSet;
    }

    public static Map<String, Integer> countWords(String input) {

        Map<String, Integer> wordCountMap = new HashMap<>();

        String[] words = input.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase();
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        return wordCountMap;
    }

    public static Map<String, List<Book>> groupBooksByAuthor(List<Book> books) {
        Map<String, List<Book>> booksByAuthor = new HashMap<>();
        for (Book book : books) {
            if (!booksByAuthor.containsKey(book.getAuthor())) {
                List<Book> list = new ArrayList<>();
                list.add(book);
                booksByAuthor.put(book.getAuthor(), list);
            }else{
                booksByAuthor.get(book.getAuthor()).add(book);


            }
        }
        return booksByAuthor;
    }

}
