import com.SinglyLinkList.App;

public class SinglyLinkList {
    public static void main(String[] args) {
        App app = new App();
        
        app.addFirst(2);
        app.addFirst(1);
        app.addLast(3);
        app.addLast(4);
        app.addLast(5);
        app.showList();
        App a = app.reverse(app);
        a.showList();
    }
}