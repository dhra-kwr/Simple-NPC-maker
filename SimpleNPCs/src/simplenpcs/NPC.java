package simplenpcs;

public class NPC {
    
    private String name;
    private String race;
    private String physicalTrait;
    private String personalityTrait;
    private String occupation;
    private String motivation;
    
    public NPC() {
    
    }
    
    public void createNPC() {
        
        this.name = name;
        this.setRace(race);
        this.setPhysicalTrait(physicalTrait);
        this.setPersonalityTrait(personalityTrait);
        this.setOccupation(occupation);
        this.setMotivation(motivation);
        
    }
    
    public void printNPC() {
        
        System.out.println("name: " + this.getName());
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the race
     */
    public String getRace() {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * @return the physicalTrait
     */
    public String getPhysicalTrait() {
        return physicalTrait;
    }

    /**
     * @param physicalTrait the physicalTrait to set
     */
    public void setPhysicalTrait(String physicalTrait) {
        this.physicalTrait = physicalTrait;
    }

    /**
     * @return the personalityTrait
     */
    public String getPersonalityTrait() {
        return personalityTrait;
    }

    /**
     * @param personalityTrait the personalityTrait to set
     */
    public void setPersonalityTrait(String personalityTrait) {
        this.personalityTrait = personalityTrait;
    }

    /**
     * @return the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * @return the motivation
     */
    public String getMotivation() {
        return motivation;
    }

    /**
     * @param motivation the motivation to set
     */
    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }
    
}
