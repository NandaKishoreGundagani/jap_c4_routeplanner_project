import java.util.Scanner;
public  class RouteMain {
    public static void main(String[] args) {
        try {
            String path ="src/main/resources/routes.csv" ;

            RouteProg routeProg = new RouteProg();
            int count = routeProg.countNoOfFlight(path);
            Route[] routes = routeProg.readflightrecords(path);
            routeProg.displayFetch(routes);
            System.out.println("--------------------------------------------------------------------------------------------");
            Scanner scan = new Scanner(System.in);
            System.out.println("Source :");
            String cityName = scan.nextLine();

            Route[] flightFromCity = routeProg.fetchFlightsFromCity(routes, cityName);
            routeProg.displayFetch(flightFromCity);
            System.out.println("-------------------------------------SORTED ORDER-------------------------------------------------------");

            Route[] sortedFlight= routeProg.sortFetchedFlights(flightFromCity);
            routeProg.displayFetch(sortedFlight);
            System.out.println("Destination :");
            String destination = scan.nextLine();
            System.out.println("-------------------------------------Final Result-------------------------------------------------------");
            routeProg.findAllRoutes(routes,cityName,destination);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        //  routeProg.displayDetails(routes);
    }
}