package Objects;

public class ExperienceCandidate extends Candidate {

    private int expInYear;
    private String proSkill;
      
	public ExperienceCandidate(String firstName, String lastName, int birthDate, String address, String phone,
			String email, int candidateType, int expInYear, String proSkill) {
		super(firstName, lastName, birthDate, address, phone, email, candidateType);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	public String getProSkill() {
		return proSkill;
	}

	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}

	@Override
	public String toString() {
		return "ExperienceCandidate [expInYear=" + expInYear + ", proSkill=" + proSkill + "]";
	}

	
	
	

   

}