package fact.it.exercisesupplier.model;

public class Supplier {
    private String name;
    private String contactPerson;
    private Residence residence;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public Residence getResidence() {
        return residence;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
    }

    public Supplier(String name, String contactPerson, Residence residence) {
        this.name = name;
        this.contactPerson = contactPerson;
        this.residence = residence;
    }

    public String showSupplier() {
        return "Supplier \"" + this.name + "\", contact person " + this.contactPerson +"\nAddress: " + this.residence.getStreetAndNumber() + ", " + this.residence.getZipCode() + " " + this.residence.getMunicipality();
    }

}