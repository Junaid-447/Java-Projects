class Venue {
    private String name;   
    private City city;

    public Venue(String name, City city) {
        this.name = name;
        this.city = city;
    }
    
    public Venue() {
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Venue{" + "name=" + name + ", city=" + city + '}';
    }
    
}
