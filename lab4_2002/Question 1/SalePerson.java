public class SalePerson implements Comparable{

    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales){
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;

    }

    public String toString(){
        return lastName + ", "+ firstName+  " : "+ totalSales;//
    }
    public boolean equals(Object o){ //useless method
        if(o instanceof SalePerson anotherPerson){
            if(anotherPerson.firstName == this.firstName && anotherPerson.lastName == this.lastName)
                return true;
            return false;
        }
        return false;
    }



    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getTotalSales(){
        return totalSales;
    }


    public int compareTo(Object o) {
        if(o instanceof SalePerson anotherPerson){ //if o is a SalePerson class
            if(this.totalSales > anotherPerson.totalSales)
            {
                return 1;
            }
            else if(this.totalSales < anotherPerson.totalSales) return -1;
            if(this.totalSales == anotherPerson.totalSales){
                System.out.println(this.lastName + anotherPerson.lastName);
                return this.lastName.compareTo(anotherPerson.lastName);
            }
        }
        return -1;
    }
}
