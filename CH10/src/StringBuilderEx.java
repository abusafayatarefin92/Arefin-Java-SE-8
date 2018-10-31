
public class StringBuilderEx {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Welcome");
        stringBuilder.append(' ');
        stringBuilder.append("to");
        stringBuilder.append(' ');
        stringBuilder.append("Java");

        
        System.out.println(stringBuilder.insert(11, "HTML and "));
        System.out.println(stringBuilder.delete(8, 11));
        System.out.println(stringBuilder.deleteCharAt(8));
        //System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.replace(11, 15, "HTML"));
        stringBuilder.setCharAt(0, 'w');
        System.out.println(stringBuilder);

    }

}
