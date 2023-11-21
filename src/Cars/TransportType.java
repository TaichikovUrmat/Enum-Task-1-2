package Cars;

import java.util.Scanner;

public enum TransportType {
    MERS{
        @Override
        public double calculateTravelCost(double distance) {
           distance = 1000;
           return 2.4*distance/66;       /// 100000mt- 100km  ///   10km-10000mtm


        }
    },
    BMW{
        @Override
        public double calculateTravelCost(double distance) {
            return 4.6*1000/66;
        }
    },
    AUDI{
        @Override
        public double calculateTravelCost(double distance) {
            distance = 1000;
            return  4.4*distance/6;
        }
    },
    CAMRY{
        @Override
        public double calculateTravelCost(double distance) {
            distance = 1000;
            return 3.4*distance/66 ;
        }
    },
    FIT{
        @Override
        public double calculateTravelCost(double distance) {
            distance= 1000;
            return 1.6*distance/66;
        }
    },
    NISSAN{
        @Override
        public double calculateTravelCost(double distance) {
            distance = 1000;
            return 2.6*distance/66;
        }
    },
    ACCORD{
        @Override
        public double calculateTravelCost(double distance) {
            distance = 1000;
            return 3.6*distance/66;
        }
    };


    public abstract double calculateTravelCost(double distance);



}
