import com.CaircularlyLinkList.App;

public class CaircularlyLinkList {
    public static void main(String[] args) {
        App a = new App();

        a.addFirst(1);
        a.addFirst(2);
        a.addLast(3);
        // a.show();
        a.removeFirst();
        // a.show();
        a.addFirst(12);
        a.addFirst(45);
        a.addFirst(19);

        a.show();
        a = a.reverse(a);
        a.reverse(a);
        a.show();
        // a.rotate();
        // a.show();

        // System.out.println(a.size());
    }
}