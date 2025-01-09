import java.util.Random;

public class randomstr {
    public static void main(String[] args) {
        Random random = new Random();
        String word = random.toString();

        String []words = {"Rock","Paper","Scissor"};

        int index = random.nextInt(words.length);

        System.out.println("Random Words: " + words[index]);

    }
}
