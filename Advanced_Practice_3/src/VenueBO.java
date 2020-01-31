class VenueBO  {
    public Venue createVenue(String data, City[] cityList) {
    	Venue v=null;
    	String a[]=data.split(",");
    	
    	for(City c:cityList)
    	{
    		if(c.getName().equals(a[1]))
    		{
    			v=new Venue(a[0],c);
    		}
    	}
    	return v;
      
    }
}
