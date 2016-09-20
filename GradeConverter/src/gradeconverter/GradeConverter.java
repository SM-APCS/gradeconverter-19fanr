/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradeconverter;

/**
 *
 * @author ruomingfan
 */
public class GradeConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int grade = readInt("What is your grade? ");
        if(grade >= 90)
        {
            System.out.println("Your grade is an A.");
        }
        else if(grade >= 80)
        {
            System.out.println("Your grade is a B.");
        }
        else
        {
            System.out.println("You fail.");
        }
        
    }
    
}
