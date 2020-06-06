public class NotImmutable {

    private StringBuilder builder;
    public NotImmutable(StringBuilder b) {
        builder = new StringBuilder(b);
    }
    public StringBuilder getBuilder() {
        return new StringBuilder(builder);
    }



        public static void main(String[] args) {

            StringBuilder sb = new StringBuilder("initial");
            NotImmutable problem = new NotImmutable(sb);
            sb.append(" added");
            StringBuilder gotBuilder = problem.getBuilder();
            gotBuilder.append(" more");
            System.out.println(problem.getBuilder());


        }}
