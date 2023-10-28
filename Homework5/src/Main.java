import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String addedNumbers = "1 8 4 7 2 9 2 4 7 4 5 2";
        int sumNumbers = sumNumber(addedNumbers);
        System.out.println(sumNumbers);

        int count = oddNumbers(addedNumbers);
        System.out.println(count);

        int nrAles = 2;
        List<Integer> result = returnNumbers(addedNumbers, nrAles);
        System.out.println(result);

        int donationTarget = 10000000;
        int maxDonations = 10;
        donationProblem(donationTarget, maxDonations);

        String sentence = "Ana are mere. Merele sunt bune. Eu merg la mare. Tu stai acasa.";
        System.out.println(sentenceSeparator(sentence));
    }

    public static int sumNumber(String addedNumbers) {
        String[] intStrings = addedNumbers.split(" ");
        int sumNumbers = 0;

        for (String intString : intStrings) {
            int sum = Integer.parseInt(intString);
            sumNumbers += sum;
        }
        return sumNumbers;
    }

    public static int oddNumbers(String addedNumbers) {
        String[] intStrings = addedNumbers.split(" ");
        int count = 0;
        for (String numStr : intStrings) {
            int num = Integer.parseInt(numStr);
            if (num % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> returnNumbers(String addedNumbers, int nrAles) {
        List<Integer> result = new ArrayList<>();
        String[] intStrings = addedNumbers.split(" ");
        for (String numStr : intStrings) {
            int nr = Integer.parseInt(numStr);
            if (nrAles < nr) {
                result.add(nr);
            }
        }
        return result;
    }

    public static int donationProblem(int donationTarget, int maxDonations) {
        Random random = new Random();
        int sum = 0;
        int donationCount = 0;
        while (sum < donationTarget && donationCount < maxDonations) {
            int donationAmount = random.nextInt(1000000) + 1;
            sum += donationAmount;
            donationCount++;
            System.out.println("Donation #" + donationCount + ": $" + donationAmount + " (Total: $" + sum + ")");
        }
        if (sum >= donationTarget) {
            System.out.println("Donation target of $" + donationTarget + " reached");
        } else {
            System.out.println("Maximum number of donations reached. Campaign ended.");
        }
        return sum;

    }

    public static String sentenceSeparator(String sentence){
        String[] sentences = sentence.split("\\.");
        for (String trimmer: sentences){
            sentence = sentence.trim();
            System.out.println(trimmer + ".");
        }
        return sentence;
    }
}
