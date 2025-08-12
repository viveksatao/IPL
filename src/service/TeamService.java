package service;

import repository.TeamRepository;
import entity.Team;

public class TeamService {

	public static void printTeamDetails(int n)
	{
		switch(n) {
			case 1:
		Team team1 = TeamRepository.getMITeamDetails();
		System.out.println(" Ranking :"+team1.getId());
		System.out.println("Team Full Name :"+team1.getTeamName());
		System.out.println("Team Captain Name :"+team1.getCaptainName());
		System.out.println("Team Coach Name :"+team1.getCoachName());
		System.out.println("Team Net run rate :"+team1.getnRR());
		System.out.println("is Won IPL Trophy: "+team1.getQualified());
		break;
		
			case 2:
		Team team2 = TeamRepository.getCSKTeamDetails();
		System.out.println(" Ranking :"+team2.getId());
		System.out.println("Team Full Name :"+team2.getTeamName());
		System.out.println("Team Captain Name :"+team2.getCaptainName());
		System.out.println("Team Coach Name :"+team2.getCoachName());
		System.out.println("Team Net run rate :"+team2.getnRR());
		System.out.println("is Won IPL Trophy: "+team2.getQualified());
		break;
		
			case 3:
		Team team3 = TeamRepository.getRRTeamDetails();
		System.out.println(" Ranking :"+team3.getId());
		System.out.println("Team Full Name :"+team3.getTeamName());
		System.out.println("Team Captain Name :"+team3.getCaptainName());
		System.out.println("Team Coach Name :"+team3.getCoachName());
		System.out.println("Team Net run rate :"+team3.getnRR());
		System.out.println("is Won IPL Trophy: "+team3.getQualified());
		break;
		
			case 4:
		Team team4 = TeamRepository.getGTTeamDetails();
		System.out.println(" Ranking :"+team4.getId());
		System.out.println("Team Full Name :"+team4.getTeamName());
		System.out.println("Team Captain Name :"+team4.getCaptainName());
		System.out.println("Team Coach Name :"+team4.getCoachName());
		System.out.println("Team Net run rate :"+team4.getnRR());
		System.out.println("is Won IPL Trophy: "+team4.getQualified());
		break;
		
			case 5:
		Team team5 = TeamRepository.getSRHTeamDetails();
		System.out.println(" Ranking :"+team5.getId());
		System.out.println("Team Full Name :"+team5.getTeamName());
		System.out.println("Team Captain Name :"+team5.getCaptainName());
		System.out.println("Team Coach Name :"+team5.getCoachName());
		System.out.println("Team Net run rate :"+team5.getnRR());
		System.out.println("is Won IPL Trophy: "+team5.getQualified());
		break;
		
			case 6:
		Team team6 = TeamRepository.getRCBTeamDetails();
		System.out.println(" Ranking :"+team6.getId());
		System.out.println("Team Full Name :"+team6.getTeamName());
		System.out.println("Team Captain Name :"+team6.getCaptainName());
		System.out.println("Team Coach Name :"+team6.getCoachName());
		System.out.println("Team Net run rate :"+team6.getnRR());
		System.out.println("is Won IPL Trophy: "+team6.getQualified());
		break;
		
			case 7:
		Team team7 = TeamRepository.getLSGTeamDetails();
		System.out.println(" Ranking :"+team7.getId());
		System.out.println("Team Full Name :"+team7.getTeamName());
		System.out.println("Team Captain Name :"+team7.getCaptainName());
		System.out.println("Team Coach Name :"+team7.getCoachName());
		System.out.println("Team Net run rate :"+team7.getnRR());
		System.out.println("is Won IPL Trophy: "+team7.getQualified());
		break;
		
			case 8:
		Team team8 = TeamRepository.getDCTeamDetails();
		System.out.println(" Ranking :"+team8.getId());
		System.out.println("Team Full Name :"+team8.getTeamName());
		System.out.println("Team Captain Name :"+team8.getCaptainName());
		System.out.println("Team Coach Name :"+team8.getCoachName());
		System.out.println("Team Net run rate :"+team8.getnRR());
		System.out.println("is Won IPL Trophy: "+team8.getQualified());
		break;
		
			case 9:
		Team team9 = TeamRepository.getKKRTeamDetails();
		System.out.println(" Ranking :"+team9.getId());
		System.out.println("Team Full Name :"+team9.getTeamName());
		System.out.println("Team Captain Name :"+team9.getCaptainName());
		System.out.println("Team Coach Name :"+team9.getCoachName());
		System.out.println("Team Net run rate :"+team9.getnRR());
		System.out.println("is Won IPL Trophy: "+team9.getQualified());
		break;
		
			case 10:
		Team team10 = TeamRepository.getPBKSTeamDetails();
		System.out.println(" Ranking :"+team10.getId());
		System.out.println("Team Full Name :"+team10.getTeamName());
		System.out.println("Team Captain Name :"+team10.getCaptainName());
		System.out.println("Team Coach Name :"+team10.getCoachName());
		System.out.println("Team Net run rate :"+team10.getnRR());
		System.out.println("is Won IPL Trophy: "+team10.getQualified());
		break;
		
		default:
			System.out.println("Invalid Input please enter number between 1 to 10 only...");
		}
	}

}
