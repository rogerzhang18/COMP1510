/**
 * 
 */
package p2;

/**
 * @author ROGER
 *
 */
public class StudentGrades {

    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        int LabScore1=100;
        int LabScore2=60;
        int LabScore3=40;
        int LabScore4=60;
        int LabScore5=80;
        
        int Bonus1=20;
        int Bonus2=10;
        int Bonus3=0;
        int Bonus4=0;
        int Bonus5=2;
        
        int t1=LabScore1+Bonus1;
        int t2=LabScore2+Bonus2;
        int t3=LabScore3+Bonus3;
        int t4=LabScore4+Bonus4;
        int t5=LabScore5+Bonus5;
        
        
        System.out.println ("///////////////////"
                + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println ("==         Student Points          ==");
        System.out.println ("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                + "//////////////////");
        System.out.println ("Name \t\tLab\t Bonus \t Total \t");
        System.out.println ("---- \t\t---\t ----- \t ----- \t");
        System.out.println ("Roger\t\t" + LabScore1 + "\t" + " " + Bonus1 + "\t" + " " + t1);
        System.out.println ("Luke\t\t" + LabScore2 + "\t" + " " + Bonus2 + "\t" + " " + t2);
        System.out.println ("Peter\t\t" + LabScore3 + "\t" + " " + Bonus3 + "\t" + " " + t3);
        System.out.println ("Jane\t\t" + LabScore4 + "\t" + " " + Bonus4 + "\t" + " " + t4);
        System.out.println ("Queenie\t\t" + LabScore5 + "\t" + " " + Bonus5 + "\t" + " " + t5);

    }

}
