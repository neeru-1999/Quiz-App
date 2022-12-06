package com.program.quizapplication;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {
	
	Scanner sc = new Scanner(System.in);
	int correctAnsCount = 0;
	int wrongAnsCount = 0;
	
	public void logic() {
		Questions q1 = new Questions("What is Java?", "A. Java is a high-level proramming language", "B. Java is a independent language", "C. Java is a platform-dependent language", "D. Java is a platform-independent language");
		Questions q2 = new Questions("Who developed Java programming?", "A. James Gosling", "B. Dennis Ritchie", "C. Bjarne Stroustrup", "D. Guido van Rossum");
		Questions q3 = new Questions("What is the extension of java code file?", "A. .java", "B. .pdf", "C. .sql", "D. .txt");
		Questions q4 = new Questions("How many java platforms are there?", "A. 2", "B. 1", "C. 5", "D. 4");
		Questions q5 = new Questions("Which one is the latest version of java?", "A. java SE 8", "B. java SE 11", "C. java SE 13", "D. java SE 18");
		
		
		Map<Questions,Character> hmap = new HashMap<Questions, Character>();
		hmap.put(q1, 'D');
		hmap.put(q2, 'A');
		hmap.put(q3, 'A');
		hmap.put(q4, 'D');
		hmap.put(q5, 'D');
		
		for(Map.Entry<Questions,Character> map:hmap.entrySet()) {
			System.out.println(map.getKey().getQuestion());
			System.out.println(map.getKey().getOption1());
			System.out.println(map.getKey().getOption2());
			System.out.println(map.getKey().getOption3());
			System.out.println(map.getKey().getOption4());
			
			System.out.println("Enter your answer: ");
			Character ans = sc.next().charAt(0);
			
			int cans = Character.compare(ans, map.getValue());
			if(cans == 0) {
				System.out.println("Correct Answer");
				correctAnsCount++;
			}
			else {
				System.out.println("Wrong Answer");
				wrongAnsCount++;
			}
		}
		
		System.out.println();
		System.out.println("------------Result----------");
		System.out.println("Total Questions: "+hmap.size());
		System.out.println("Correct Answered Questions: " + correctAnsCount);
		System.out.println("Wrong Answered Questions: " + wrongAnsCount);
		
		int percentage=(100*correctAnsCount)/hmap.size();
		System.out.println("Percentage : " + percentage);
		
		if(percentage > 95) {
			System.out.println("Performance : High");
		}
		else if (percentage < 35) {
			System.out.println("Performance : Low");
		}
		else {
			System.out.println("Performance: Average");
		}
	}

}
