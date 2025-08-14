package service;

import repository.TeamRepository;
import entity.Team;
import java.util.*;

public class TeamService {
	
	public static void selectOptions()
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Welcome to IPL Portal :");
		System.out.println("please select following options :");
		System.out.println("1. Get all team Details");
		System.out.println("2.Get Team Details by ShortName: ");
		System.out.println("3.Get Team Details by Id: ");
		
		int input = Sc.nextInt();
		System.err.println("You have selected option :"+input);
		
		switch (input) 
		{
		// get all teams details
		case 1: 
		{
			
			Team team = TeamRepository.getMITeamDetails();
			System.out.println(team);
			 team = TeamRepository.getCSKTeamDetails();
				System.out.println(team);
			
			 team = TeamRepository.getRRTeamDetails();
				System.out.println(team);
			
			 team = TeamRepository.getGTTeamDetails();
				System.out.println(team);
			
			 team = TeamRepository.getSRHTeamDetails();
				System.out.println(team);
		
			team = TeamRepository.getRCBTeamDetails();
			System.out.println(team);
			
			 team = TeamRepository.getLSGTeamDetails();
				System.out.println(team);
			
			 team = TeamRepository.getDCTeamDetails();
				System.out.println(team);
			
		    team = TeamRepository.getKKRTeamDetails();
			System.out.println(team);
			
			 team = TeamRepository.getPBKSTeamDetails();
				System.out.println(team);
				
				break;
		}
		// get team details by short name
		case 2:
		{
			System.err.println("In case 2");
			System.out.println("Please enter short name of your fvrt team:");
			String teamShortName = Sc.next();
			getTeamByShortName(teamShortName);
			break;
		}
		case 3:
		{
			System.err.println("In case 3");
			System.out.println("Please enter TeamId of your fvrt team:");
			int teamId = Sc.nextInt();
			getTeamById(teamId);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
	}
	
	private static void getTeamByShortName(String shortName)
	{
		switch (shortName) {
		case "MI": 
		{
			Team team = TeamRepository.getMITeamDetails();
			System.out.println(team);
			break;
		}
		case "CSK": 
		{
			Team team = TeamRepository.getCSKTeamDetails();
			System.out.println(team);
			break;
		}
		case "RR": 
		{
			Team team = TeamRepository.getRRTeamDetails();
			System.out.println(team);
			break;
		}
		case "GT": 
		{
			Team team = TeamRepository.getGTTeamDetails();
			System.out.println(team);
			break;
		}
		case "SRH": 
		{
			Team team = TeamRepository.getSRHTeamDetails();
			System.out.println(team);
			break;
		}
		case "RCB": 
		{
			Team team = TeamRepository.getRCBTeamDetails();
			System.out.println(team);
			break;
		}
		case "LSG": 
		{
			Team team = TeamRepository.getLSGTeamDetails();
			System.out.println(team);
			break;
		}
		case "DC": 
		{
			Team team = TeamRepository.getDCTeamDetails();
			System.out.println(team);
			break;
		}
		case "KKR": 
		{
			Team team = TeamRepository.getKKRTeamDetails();
			System.out.println(team);
			break;
		}
		case "PBKS": 
		{
			Team team = TeamRepository.getPBKSTeamDetails();
			System.out.println(team);
			break;
		}
		
		
		
		default:
			throw new IllegalArgumentException("Unexpected value: " +shortName);
		}
		
		
		
		
	}
	private static void getTeamById(int Id)
	{
		if(Id<1 && Id>10)
		{
			System.err.println("Enter Valid TeamId between 1 to 10:");
		}
		else if (Id==1)
		{
			Team team = TeamRepository.getMITeamDetails();
			System.out.println(team);
		}
		else if (Id==2)
		{
			Team team = TeamRepository.getCSKTeamDetails();
			System.out.println(team);
		}
		else if (Id==3)
		{
			Team team = TeamRepository.getRRTeamDetails();
			System.out.println(team);
		}
		else if (Id==4)
		{
			Team team = TeamRepository.getGTTeamDetails();
			System.out.println(team);
		}
		else if (Id==5)
		{
			Team team = TeamRepository.getSRHTeamDetails();
			System.out.println(team);
		}
		else if (Id==6)
		{
			Team team = TeamRepository.getRCBTeamDetails();
			System.out.println(team);
		}
		else if (Id==7)
		{
			Team team = TeamRepository.getLSGTeamDetails();
			System.out.println(team);
		}
		else if (Id==8)
		{
			Team team = TeamRepository.getDCTeamDetails();
			System.out.println(team);
		}
		else if (Id==9)
		{
			Team team = TeamRepository.getKKRTeamDetails();
			System.out.println(team);
		}
		else if (Id==10)
		{
			Team team = TeamRepository.getPBKSTeamDetails();
			System.out.println(team);
		}
		
	}
	
	
	


	}


