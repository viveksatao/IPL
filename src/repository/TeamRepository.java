package repository;

import entity.Team;

public class TeamRepository {

	public static Team getMITeamDetails()
	{
		Team team = new Team();
		team.setId(1);
		team.setTeamName("Mumbai Indians");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("Mehela Jayvardhne");
		team.setQualified(true);
		team.setnRR(1.232f);
		
		return team;
	}
	// add Similar Methods for remaining 9 teams
	public static Team getCSKTeamDetails()
	{
		Team team = new Team();
		team.setId(2);
		team.setTeamName("Chennai Super Kings");
		team.setCaptainName("Ruturaj Gaikwad");
		team.setCoachName("Stephen Fleming");
		team.setQualified(true);
		team.setnRR(1.12f);
		
		return team;
	}
	public static Team getRRTeamDetails()
	{
		Team team = new Team();
		team.setId(3);
		team.setTeamName("Rajasthan Royals");
		team.setCaptainName("Sanju Samson");
		team.setCoachName("Rahul Dravid");
		team.setQualified(true);
		team.setnRR(1.12f);
		
		return team;
		
		
	}
	
	public static Team getGTTeamDetails()
	{
		Team team = new Team();
		team.setId(4);
		team.setTeamName("Gujarat Titans");
		team.setCaptainName("Shubman Gill");
		team.setCoachName("Ashish Nehra");
		team.setQualified(true);
		team.setnRR(1.10f);
		
		return team;
	}
	public static Team getSRHTeamDetails()
	{
		Team team = new Team();
		team.setId(5);
		team.setTeamName("Sunrisers Hyderabad");
		team.setCaptainName("Pat Cummins");
		team.setCoachName("Daniel Vettori");
		team.setQualified(true);
		team.setnRR(1.08f);
		
		return team;
	}
	public static Team getRCBTeamDetails()
	{
		Team team = new Team();
		team.setId(6);
		team.setTeamName("Royal Challengers Bengaluru");
		team.setCaptainName("Rajat Patidar");
		team.setCoachName("Andy Flower");
		team.setQualified(true);
		team.setnRR(1.04f);
		
		return team;
	}
	public static Team getLSGTeamDetails()
	{
		Team team = new Team();
		team.setId(7);
		team.setTeamName("Lucknow Super Giants");
		team.setCaptainName("Rishabh Pant");
		team.setCoachName("Justin Langer");
		team.setQualified(false);
		team.setnRR(1.01f);
		
		return team;
	}
	public static Team getDCTeamDetails()
	{
		Team team = new Team();
		team.setId(8);
		team.setTeamName("Delhi Capitals");
		team.setCaptainName("Axar Patel");
		team.setCoachName("Hemang Badani");
		team.setQualified(false);
		team.setnRR(1.00f);
		
		return team;
	}
	public static Team getKKRTeamDetails()
	{
		Team team = new Team();
		team.setId(9);
		team.setTeamName("Kolkata Knight Riders");
		team.setCaptainName("Ajinkya Rahane");
		team.setCoachName("Chandrakant Pandit");
		team.setQualified(true);
		team.setnRR(-0.99f);
		
		return team;
	}
	public static Team getPBKSTeamDetails()
	{
		Team team = new Team();
		team.setId(10);
		team.setTeamName("Punjab Kings");
		team.setCaptainName("Shreyas Iyer");
		team.setCoachName("Ricky Ponting");
		team.setQualified(false);
		team.setnRR(-1.1f);
		
		return team;
	}	
	
	

	
	

}
