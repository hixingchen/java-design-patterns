package iterator;

public class Main {
    public static void main(String[] args) {
        ConcreteCollection<String> collection = new ConcreteCollection<String>();
        collection.addItem("one");
        collection.addItem("two");
        collection.addItem("three");
        Iterator<String> iterator = collection.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
