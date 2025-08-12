package main;
import entity.Team;

import repository.TeamRepository;
import service.TeamService;
import java.util.*;

public class Test {

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("---------------------IPL Team Details-------------------------");
		         System.out.println("Enter 1 to Access Mumbai Indians Details");
		         System.out.println("---------------------------------------------------------------");
                 System.out.println("Enter 2 to Access Chennai Super Kings Details");
                 System.out.println("---------------------------------------------------------------");
                 System.out.println("Enter 3 to Access Rajasthan Royals Details");
                 System.out.println("---------------------------------------------------------------");
                 System.out.println("Enter 4 to Access Gujarat Titans Details");
                 System.out.println("---------------------------------------------------------------");
                 System.out.println("Enter 5 to Access Sunrisers Hyderabad Details");
                 System.out.println("---------------------------------------------------------------");
                 System.out.println("Enter 6 to Access Royal Challengers Bengaluru Details");
                 System.out.println("---------------------------------------------------------------");
                 System.out.println("Enter 7 to Access Lucknow Super Giants");
                 System.out.println("---------------------------------------------------------------");
		         System.out.println("Enter 8 to Access Delhi Capitals Details");
		         System.out.println("---------------------------------------------------------------");
		         System.out.println("Enter 9 to Access Kolkata Knight Riders Details");
		         System.out.println("---------------------------------------------------------------");
		         System.out.println("Enter 10 to Access Punjab Kings Details");
		         System.out.println("---------------------------------------------------------------");
		         int n = Sc.nextInt();
		TeamService.printTeamDetails(n);
		System.out.println();
		System.out.println("---***---THANK YOU FOR USING IPL DETAILS APP---***---");
	}
}
