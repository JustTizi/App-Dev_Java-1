package fact.it.supermarket.model;

import java.util.ArrayList;

public class Supermarket {
    private ArrayList<Department> departmentList = new ArrayList<Department> ();
    private String name;
    private int numberCustomers;

    public Supermarket(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberCustomers() {
        return numberCustomers;
    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    public int getNumberOfDepartments() {
        return this.departmentList.size();
    }

    public void addDepartment(Department department) {
        this.departmentList.add(department);
    }

    public Department searchDepartmentByName(String name) {
        return this.departmentList.stream().filter(department -> department.getName().equals(name)).findFirst().orElse(null);
    }

    public void registerCustomer(Customer customer) {
        this.numberCustomers++;
        customer.setCardNumber(this.numberCustomers);
    }
}
// Tiziano Van der Waals r0889630