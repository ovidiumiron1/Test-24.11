import javax.naming.Context;

public interface Strategy {
    public void render(Phone p, Context c);
}