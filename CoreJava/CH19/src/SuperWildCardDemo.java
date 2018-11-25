
public class SuperWildCardDemo {

    public static void main(String[] args) {
        GenericStake<String> stack1 = new GenericStake<>();
        GenericStake<Object> stack2 = new GenericStake<>();
        
        stack2.push("Java");
        stack2.push(2);
        stack1.push("Sun");
        
        AnyWildCardDemo.print(stack2);
    }
    
    public static <T> void add(GenericStake<T> stack1, GenericStake<? super T> stack2) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
}
