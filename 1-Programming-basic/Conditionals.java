public class Conditionals {
    public static void main(String[] args) {
        // checking a condition before implementing 
        // if-else
        int salary = 25_000;
        if(salary>20_000){
            salary += 2_000;
        }else{
            salary += 1_000;
        };
        System.out.println(salary);

        // multiple if-else
        int sal = 20_000;
        if(sal>10_000){
            sal += 5_000;
        }else if(sal>20_000){
            sal += 2_000;
        }else{
            sal += 1_000;
        }
        System.out.println(sal);
    }
}
