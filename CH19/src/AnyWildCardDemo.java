
public class AnyWildCardDemo {

    public static void main(String[] args) {
        GenericStake<Integer> intStack = new GenericStake<>();
        
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);
        
        print(intStack);
    }
    
    public static void print(GenericStake<?> stack) {
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
