package Day2_18july;

import java.sql.SQLOutput;

public class DemoVehicle1
{
    public static void main(String[] args)
    {

        Vehicle v;
        v=new Vehicle();

        v.setCompany("TATA");
        v.setFueltype("Petrol");
        v.setColour("BLACK");

        System.out.println(v.getCompany());
        System.out.println(v.getColour());
        System.out.println(v.getFueltype());

        System.out.println(v);


    }
}
