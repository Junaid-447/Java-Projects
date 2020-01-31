class Match {
    private String date;
 private String teamone;
 private String teamtwo;
    private Venue venue;

    public Match(String date,String teamone,String teamtwo, Venue venue) {
        this.date = date;
        this.venue = venue;
 this.teamone = teamone;
 this.teamtwo = teamtwo;
    }


    @Override
    public boolean equals(Object obj) {
        final Match other = (Match) obj;
        return this.date.equals(other.getDate());
    }
    
    

    public Match() {
    }
    
    @Override
    public String toString() {
        return String.format("%-15s%-15s%s",date,teamone,teamtwo);
    }

    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

public String getTeamone() {
        return teamone;
    }

    public void setTeamone(String teamone) {
        this.teamone = teamone;
    }

public String getTeamtwo() {
        return teamtwo;
    }

    public void setTeamtwo(String teamtwo) {
        this.teamtwo = teamtwo;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }
    
}
