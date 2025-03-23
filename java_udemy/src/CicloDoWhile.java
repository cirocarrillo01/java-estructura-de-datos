public class CicloDoWhile {
    public static void main(String[] args) {
        System.out.println("--- ciclo do while ---");
        var contador = 1;
        do{
            System.out.println(contador++);
        }while(contador<=5);
    }
}