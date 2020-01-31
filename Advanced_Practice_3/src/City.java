class City {
    private String name;
    
   
   public City(String name) {
        this.name = name;
        
    }
    
    

    public City() {
    }
    
    public boolean equals(City obj) {
        return this.name.equals(obj.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

   @Override
    public String toString() {
        return "City{" + "name=" + name + '}';
    }

}
