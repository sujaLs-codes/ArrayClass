public class sum_all_float_vaL {
    public static void main(String[] args) {

        float[] marks = {45.6f, 55.7f, 44.7f, 99.6f, 23.9f};
        float sum = 0;
        for(float element : marks)
        {
            sum = sum + element;
        }
        System.out.println("The value of sum is : " + sum);
    }
}
