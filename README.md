# Online-Examination
#JAVA project
#This Java program implements a simple Online Examination System. Here's a detailed explanation of the code:

1. OnlineExam Class
This class contains all the logic for conducting the exam, storing questions and answers, and calculating results.

Attributes:
questions: An array of strings containing 5 multiple-choice questions.
answers: An array of characters representing the correct answers to the questions.
userAnswers: An array to store the user's answers during the exam.
Methods:
conductExam():

This method runs the exam by displaying each question to the user, one by one, and prompting for an answer.
The user's answer (either a, b, c, or d) is stored in the userAnswers array.
The method uses a Scanner object to read the user's input.
calculateScore():

This method compares the user's answers with the correct answers.
It iterates through both the answers and userAnswers arrays, increasing the score whenever the user's answer matches the correct one.
The final score is returned.
showResult():

This method displays the user's score out of 5.
If the user scores 3 or more, they pass the exam and receive a congratulatory message. Otherwise, a failure message is displayed.
2. OnlineExamination Class (Main Class)
This is the main class where the program execution begins.
In the main() method, an instance of OnlineExam is created.
The program then conducts the exam using exam.conductExam() and displays the results using exam.showResult().
How the Program Works:
The user is welcomed to the exam.
The program presents 5 multiple-choice questions, and the user inputs their answers.
The program calculates the user's score based on their answers.
The result (pass or fail) is displayed along with the score.
This program simulates a basic online exam system where users can answer questions, and their performance is evaluated based on predefined correct answers. 
