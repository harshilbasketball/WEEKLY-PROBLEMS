public class Volume_of_earth {
    public static void main(String[] args) {
        int radiusofearthinkm = 6378;
        double volumeofsphere  =  ((4/3)*3.14 * radiusofearthinkm * radiusofearthinkm * radiusofearthinkm);
        double volumeofsphereincubicmiles  =  (((4/3)*3.14)*radiusofearthinkm*radiusofearthinkm*radiusofearthinkm*1.6);
        System.err.println("The Volume of earth in cubicc kilometres is " + volumeofsphere + "and cubic miles is " + volumeofsphereincubicmiles);
        



    }
    
}
