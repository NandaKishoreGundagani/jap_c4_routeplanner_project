import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;

public class RouteProg {
    public int countNoOfFlight(String path) {
        int count = 0;
        try {
            FileReader readFile = new FileReader(path);
            BufferedReader br = new BufferedReader(readFile);
            while (br.readLine() != null) {
                count++;
            }
        } catch (IOException exe) {
            System.err.println(exe.getMessage());
        }
        return count;
    }

    public Route[] readflightrecords(String path) {
        Route[] readflightsrecords = new Route[countNoOfFlight(path)];
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            int i = 0;
            String line;
            while ((line = br.readLine()) != null) {
                String[] str = line.split(",");
                Route routes = new Route(str[0].trim(),str[1].trim(),Integer.parseInt(str[2].trim()),str[3].trim(),str[4].trim());
                readflightsrecords[i] = routes;
                i++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return readflightsrecords;
    }

    public void display(Route[] routes) {
        System.out.println("From\t To \t Distance in km\t Travel Time \t Typical airFare");
        for (int i = 0; i < routes.length; i++) {
            System.out.println(routes[i]);
        }
    }

    public Route[] fetchFlightsFromCity(Route[] routes, String fromCity) {
        int size = 0;
        for (Route i : routes) {
            if (i.getFromCity().equalsIgnoreCase(fromCity)) {
                size++;
            }
        }
        Route[] flightsFromcity = new Route[size];
        int j = 0;
        for (Route i : routes) {
            if (i.getFromCity().equalsIgnoreCase(fromCity)) {
                flightsFromcity[j] = i;
                j++;
            }
        }
        return flightsFromcity;
    }

    Route[] sortFetchedFlights(Route[] fetchedFlight) {
        for (int pass = 1; pass < fetchedFlight.length; pass++) {
            for (int i = 0; i < fetchedFlight.length - pass; i++) {
                if (fetchedFlight[i].getToCity().compareToIgnoreCase(fetchedFlight[i + 1].getToCity()) > 0) {
                    Route temp = fetchedFlight[i];
                    fetchedFlight[i] = fetchedFlight[i + 1];
                    fetchedFlight[i + 1] = temp;
                }
            }
        }
        return fetchedFlight;
    }
    void findAllRoutes(Route[]  routes, String fromCity, String toCity)
    {
        for(Route r:routes)
        {
            if(r.getFromCity().equalsIgnoreCase(fromCity)&&r.getToCity().equalsIgnoreCase(toCity))
            {
                System.out.println(r);
                break;
            }
        }
        for (Route r:routes)
        {
            if(r.getFromCity().equalsIgnoreCase(fromCity)){
                String tempDestination=r.getToCity();
                for(Route r1:routes)
                {
                    if(r1.getFromCity().equalsIgnoreCase(tempDestination)&& r1.getToCity().equalsIgnoreCase(toCity))
                    {
                        findAllRoutes(routes,fromCity,tempDestination);
                        findAllRoutes(routes,tempDestination,toCity);
                    }
                }
            }
        }
    }
    public void  displayFetch(Route[] flightFromCity){
        for(Route FlightFromCity: flightFromCity)
            System.out.println(FlightFromCity);
    }
}










