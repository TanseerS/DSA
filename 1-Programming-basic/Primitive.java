public class Primitive {
    public static void main(String[] args) {
        //primitive is a datatype that cannot be broken further into any other datatype

        //Integer
        int rollno = 18;

        //Charachter
        char letter = 'k';
        
        //Float
        float marks = 8.69f;
        //we write f at the end bcoz java considers decimals to be double by default, if need less space use float(4 bytes) instead of double(8 bytes)

        //Boolean
        boolean statement = true;

        //long(large int values)
        long population = 78543213456741L;
        //integers are considered int by default(4 bytes) long(8 bytes)

        //Double (large decimal numbers)
        double area = 456789.87654;

        //String (not primitive data type)
        String name = "Tanseer";

        System.out.println(name);
        System.out.println(area);
        System.out.println(population);
        System.out.println(statement);
        System.out.println(marks);
        System.out.println(letter);
        System.out.println(rollno);
    }
}
