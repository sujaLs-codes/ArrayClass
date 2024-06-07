public class Arr_For_Ech_loop {
    public static void main(String[] args) {

        float[] marks = {45.6f, 55.7f, 44.7f, 99.6f, 23.9f};
        float sum = 0;
        for(float element : marks)
        {
            sum = sum + element;
        }
        System.out.println("Average of marks :- " + sum/marks.length);
    }
}
