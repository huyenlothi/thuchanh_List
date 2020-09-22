public class MyListTest {
    public static void main(String[] args) {
        MyList listInterger = new MyList();
        listInterger.add(3);
        listInterger.add(9);
        listInterger.add(8);
        listInterger.add(4);
        listInterger.add(1);
        System.out.println("element 1: "+ listInterger.get(0));
        System.out.println("element 4: "+ listInterger.get(3));
        System.out.println("element 3: "+ listInterger.get(2));
        listInterger.get(-1);
        System.out.println("element -1: "+ listInterger.get(-1));
    }
}
