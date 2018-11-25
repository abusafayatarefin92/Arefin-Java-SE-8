package example;


public class Ex2 {
    public static int gatDivision(int x, int y){
        int rs = x / y;
        
        return rs;
    }
    
    public static void main(String[] args) {
        try{
        System.out.println(gatDivision(10, 0));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
