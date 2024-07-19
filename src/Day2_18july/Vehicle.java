package Day2_18july;
// String
//colour predefine we can't use color
// default is default not public
public class Vehicle
{
    private String company , colour , fueltype ;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "company='" + company + '\'' +
                ", colour='" + colour + '\'' +
                ", fueltype='" + fueltype + '\'' +
                '}';
    }



    /* String company , colour , fueltype ;

            public void setData()
            {
                company="Hyundai";
                colour="White";
                fueltype = "Petrol";
            }
            public void display()
            {
                System.out.println(company+" "+ colour+" "+ fueltype);
            }
     */





}
