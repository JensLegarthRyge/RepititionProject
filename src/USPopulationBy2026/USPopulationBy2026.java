package USPopulationBy2026;

public class USPopulationBy2026 {
    public static void main(String[] args) {
        getUSPopulationCountByYear(2026);
    }

    static void getUSPopulationCountByYear(int year){
        int currentPopulation = 331002651;
        int growth =0;
        //int fiveYears = 157680000;//5*365*24*60*60
        int customYears = (year%2021)*365*24*60*60;
        //currentPopulation+=fiveYears/7;
        //currentPopulation-=fiveYears/13;
        growth+=customYears/7;
        growth-=customYears/13;

        System.out.println("The Population of the USA by "+year+" will be around "+(currentPopulation+growth)+
                " growing by approximately "+growth+" people.");
    }
}
