import javax.naming.Context;

    public class Android implements Strategy{
        public void render(Phone p, Context c) {
            System.out.println("@Android:"+p.nume);
        }
    }
}
