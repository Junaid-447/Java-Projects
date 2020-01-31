class MatchBO {
    public Match createMatch(String data, Venue[] venueList) {		
             Match m=null;
             String b[]=data.split(",");
             for(Venue v:venueList)
             {
            	 if(v.getName().equals(b[3]))
            	 {
            		 m=new Match(b[0],b[1],b[2],v);
            	 }
             }
             return m;
    }
    public void findVenue(String date, Match[] matchList) {
		
              for(int i=0;i<matchList.length;i++)
              {
            	  if(matchList[i].getDate().equals(date))
            	  {
            		 System.out.println("Match was held at "+matchList[i].getVenue().getName()); 
            		 break;
            	  }
              }
	}
	
	
    
    public void findAllMatchesInGivenVenue(String sname, Match[] matchList) {
    	
    	  System.out.println("Matches in venue "+sname+" are");
          System.out.format("%-15s%-15s%s\n","Date","TeamOne","TeamTwo");  
        
          for(Match m:matchList)
          {
                          if(m.getVenue().getName().equals(sname))
                          {
                                          System.out.println(m.toString());
                          }
          }
		
	}
	
	
	
				
}
