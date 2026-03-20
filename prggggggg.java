/*limit the child to inherit only
child  class of sealed must be sealded, non sealed or final

*/

sealed class Vehicle permits Car, Bike{
    public void speed(){
        System.out.println("Minimum speed 20km");
    }
}

non-sealed class Bike extends Vehicle{
    @Override
    public void speed(){
        System.out.println("Minimum speed 40km");
    }
}


sealed class Car extends Vehicle permits EvCar{
    @Override
    public void speed(){
        System.out.println("Minimum speed 40km");
    }
}


final class EvCar extends Car{
    @Override
    public void speed(){
        System.out.println("Minimum speed 60km");
    }
}