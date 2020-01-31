    import java.util.*;
public class Main {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the city count");
			Integer ccount = sc.nextInt();
			sc.nextLine();
			City cityObj = new City();
			Venue venueObj = new Venue();
            Match matchObj = new Match();
			City [] cityList = new City[ccount];
			CityBO cityBO = new CityBO();
			Integer i;
			String data;
			String name;
			for(i=0;i<ccount;i++) {
				System.out.println("Enter city "+(i+1)+" details");
				data = sc.nextLine();
				cityList[i] = cityBO.createCity(data);
			}
			
			System.out.println("Enter the venue count");
			Integer scount = sc.nextInt();
			sc.nextLine();
			Venue [] venueList = new Venue[scount];
			VenueBO venueBO = new VenueBO();
			for(i=0;i<scount;i++) {
				System.out.println("Enter venue "+(i+1)+" details");
				data = sc.nextLine();
				venueList[i] = venueBO.createVenue(data, cityList);
			}
			
			System.out.println("Enter the match count");
			Integer matchCount = sc.nextInt();
			sc.nextLine();
			Match [] matchList = new Match[matchCount];
			MatchBO matchBO = new MatchBO();
			for(i=0;i<matchCount;i++) {
				System.out.println("Enter match "+(i+1)+" details");
				data = sc.nextLine();
				matchList[i] = matchBO.createMatch(data, venueList);
			}
			
			System.out.println("Menu :");
			System.out.print("1)Find Venue\n2)Find All Matches In A Specific Venue\n");
			System.out.println("Type 1 or 2");
			do
			{
			System.out.println("Enter your choice");
			Integer choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1:
				System.out.println("Enter Match Date");
				name = sc.nextLine();
				matchBO.findVenue(name, matchList);
				
				
				break;
				
				case 2:
				System.out.println("Enter Venue Name");
				name = sc.nextLine();
				matchBO.findAllMatchesInGivenVenue(name, matchList);
				break;
				
				case 3:
				break;
			}
			System.out.println("Do you want to continue? Type Yes or No");
		}while(sc.nextLine().equalsIgnoreCase("Yes"));
				
				
		}
	}
	
	
			
	


