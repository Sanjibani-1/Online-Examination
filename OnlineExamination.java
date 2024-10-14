import java.util.Scanner;

class OnlineExam {

    // Array of questions
    private final String[] questions = {
        "1. What is the capital of France?\n a) Berlin\n b) Madrid\n c) Paris\n d) Rome",
        "2. Which is the largest planet in our solar system?\n a) Earth\n b) Jupiter\n c) Mars\n d) Saturn",
        "3. Who is known as the father of computers?\n a) Charles Babbage\n b) Alan Turing\n c) Bill Gates\n d) Steve Jobs",
        "4. Which element is needed for photosynthesis?\n a) Oxygen\n b) Carbon Dioxide\n c) Nitrogen\n d) Hydrogen",
        "5. Which is the longest river in the world?\n a) Nile\n b) Amazon\n c) Yangtze\n d) Mississippi"
    };

    // Array of correct answers
    private final char[] answers = {'c', 'b', 'a', 'b', 'a'};
    private final char[] userAnswers = new char[questions.length];
    
    // Method to conduct the exam
    public void conductExam() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Online Examination\n");
            
            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                System.out.print("Enter your answer (a/b/c/d): ");
                userAnswers[i] = scanner.next().charAt(0);
            }
        }
    }

    // Method to calculate the score
    public int calculateScore() {
        int score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == userAnswers[i]) {
                score++;
            }
        }
        return score;
    }

    // Method to show the result
    public void showResult() {
        int score = calculateScore();
        System.out.println("\nYour score is: " + score + "/" + questions.length);

        if (score >= 3) {
            System.out.println("Congratulations! You passed the exam.");
        } else {
            System.out.println("Sorry! You failed the exam.");
        }
    }
}

public class OnlineExamination {
    public static void main(String[] args) {
        OnlineExam exam = new OnlineExam();
        exam.conductExam();
        exam.showResult();
    }
}

