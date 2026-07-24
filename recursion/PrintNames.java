public class PrintNames{

    static void printName5(int i){
        if(i>5){
            return;
        }
        System.out.println("shiva");
        printName5(i+1);
    }

    public static void main(String[] args){
        printName5(1);
    }
}