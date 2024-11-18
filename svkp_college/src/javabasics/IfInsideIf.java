package javabasics;

public class IfInsideIf {

	public static void main(String[] args) {
        int score=1;
        if(score>=90)
        {
           System.out.println("you got A grade");
    }
    else if(score>=80)
    {
        System.out.println("you got B grade");
    }
    else if(score>=70)
    {
        System.out.println("you got C grade");
    }
    else
    {
        System.out.println("you are fail");
    }
}

	}


