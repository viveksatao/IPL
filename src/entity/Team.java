package entity;
public class Team {

	private int id;
	private String teamName;
	private String captainName;
	private String coachName;
	private float nRR;
	private boolean Qualified;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	public void setnRR(float nRR) {
		this.nRR = nRR;
	}
	public void setQualified(boolean isQualified) {
		this.Qualified = isQualified;
	}
	
	// getter
	public int getId() {
		return id;
	}
	public String getTeamName() {
		return teamName;
	}
	
	public String getCaptainName() {
		return captainName;
	}
	
	public String getCoachName() {
		return coachName;
	}
	
	public float getnRR() {
		return nRR;
	}
	
	public boolean getQualified()
	{
		return Qualified;
	}
	
}
