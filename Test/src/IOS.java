import javax.naming.Context;

public class IOS implements Strategy{
    public void render(Phone p, Context c) {
        System.out.println("@IOS:"+p.nume);
    }
}