package Manager;

import Objects.Candidate;
import Objects.ExperienceCandidate;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
    	
    	
    	
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 0:
                    Manager.createExperienceCandidate();
                    
                  break;
                case 1:
                    Manager.createFresherCandidate();
                    break;
                case 2:
                    Manager.createInternCandidate();
                    break;
                case 3:
                    return;
            }
        }
    }
}