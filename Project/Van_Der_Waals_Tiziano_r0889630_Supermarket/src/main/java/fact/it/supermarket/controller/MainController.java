package fact.it.supermarket.controller;


import fact.it.supermarket.model.Customer;
import fact.it.supermarket.model.Department;
import fact.it.supermarket.model.Staff;
import fact.it.supermarket.model.Supermarket;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@Controller
public class MainController {

    private ArrayList<Staff> staffArrayList;
    private ArrayList<Customer> customerArrayList;
    private ArrayList<Supermarket> supermarketArrayList;


//    Write your code here

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/1_customer")
    public String customer(Model model) {

        return "1_customer";
    }

    @RequestMapping("/submitcustomer")
    public String submitcustomer(HttpServletRequest request, Model model) {

        String firstName = request.getParameter("firstName");
        String surname = request.getParameter("surname");
        Integer yearOfBirth = Integer.parseInt(request.getParameter("birthyear"));

        Customer customer = new Customer(firstName, surname);
        customer.setYearOfBirth(yearOfBirth);

        model.addAttribute("customer", customer);

        return "2_customerwelcome";
    }

    @RequestMapping("/3_staff")
    public String staff(Model model) {

        return "3_staff";
    }

    @RequestMapping("/submitstaff")
    public String submitstaff(HttpServletRequest request, Model model) {

        String firstName = request.getParameter("firstName");
        String surname = request.getParameter("surname");
        LocalDate employedSince = LocalDate.parse(request.getParameter("employed"), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        boolean isStudent = (request.getParameter("student") != null);


        Staff staff = new Staff(firstName, surname);

        staff.setStartDate(employedSince);
        staff.setStudent(isStudent);

        model.addAttribute("staff", staff);

        return "4_staffwelcome";
    }

    @RequestMapping("/5_allstaff")
    public String allstaff(Model model) {

        model.addAttribute("staffList", staffArrayList);

        return "5_allstaff";
    }

    @RequestMapping("/6_allcustomers")
    public String allcustomers(Model model) {

        model.addAttribute("customerList", customerArrayList);

        return "6_allcustomers";
    }

    private ArrayList<Staff> fillStaffMembers() {
        ArrayList<Staff> staffMembers = new ArrayList<>();

        Staff staff1 = new Staff("Johan", "Bertels");
        staff1.setStartDate(LocalDate.of(2002, 5, 1));
        Staff staff2 = new Staff("An", "Van Herck");
        staff2.setStartDate(LocalDate.of(2019, 3, 15));
        staff2.setStudent(true);
        Staff staff3 = new Staff("Bruno", "Coenen");
        staff3.setStartDate(LocalDate.of(1995,1,1));
        Staff staff4 = new Staff("Wout", "Dayaert");
        staff4.setStartDate(LocalDate.of(2002, 12, 15));
        Staff staff5 = new Staff("Louis", "Petit");
        staff5.setStartDate(LocalDate.of(2020, 8, 1));
        staff5.setStudent(true);
        Staff staff6 = new Staff("Jean", "Pinot");
        staff6.setStartDate(LocalDate.of(1999,4,1));
        Staff staff7 = new Staff("Ahmad", "Bezeri");
        staff7.setStartDate(LocalDate.of(2009, 5, 1));
        Staff staff8 = new Staff("Hans", "Volzky");
        staff8.setStartDate(LocalDate.of(2015, 6, 10));
        staff8.setStudent(true);
        Staff staff9 = new Staff("Joachim", "Henau");
        staff9.setStartDate(LocalDate.of(2007,9,18));
        staffMembers.add(staff1);
        staffMembers.add(staff2);
        staffMembers.add(staff3);
        staffMembers.add(staff4);
        staffMembers.add(staff5);
        staffMembers.add(staff6);
        staffMembers.add(staff7);
        staffMembers.add(staff8);
        staffMembers.add(staff9);
        return staffMembers;
    }

    private ArrayList<Customer> fillCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer("Dominik", "Mioens");
        customer1.setYearOfBirth(2001);
        Customer customer2 = new Customer("Zion", "Noops");
        customer2.setYearOfBirth(1996);
        Customer customer3 = new Customer("Maria", "Bonetta");
        customer3.setYearOfBirth(1998);
        Customer customer4 = new Customer("Tiziano", "Van der Waals");
        customer4.setYearOfBirth(2003);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.get(0).addToShoppingList("Butter");
        customers.get(0).addToShoppingList("Bread");
        customers.get(1).addToShoppingList("Apple");
        customers.get(1).addToShoppingList("Banana");
        customers.get(1).addToShoppingList("Grapes");
        customers.get(1).addToShoppingList("Oranges");
        customers.get(2).addToShoppingList("Fish");
        return customers;
    }

    private ArrayList<Supermarket> fillSupermarkets() {
        ArrayList<Supermarket> supermarkets = new ArrayList<>();
        Supermarket supermarket1 = new Supermarket("Delhaize");
        Supermarket supermarket2 = new Supermarket("Colruyt");
        Supermarket supermarket3 = new Supermarket("Albert Heyn");
        Department department1 = new Department("Fruit");
        Department department2 = new Department("Bread");
        Department department3 = new Department("Vegetables");
        department1.setPhoto("/img/fruit.jpg");
        department2.setPhoto("/img/bread.jpg");
        department3.setPhoto("/img/vegetables.jpg");
        department1.setResponsible(staffArrayList.get(0));
        department2.setResponsible(staffArrayList.get(1));
        department3.setResponsible(staffArrayList.get(2));
        supermarket1.addDepartment(department1);
        supermarket1.addDepartment(department2);
        supermarket1.addDepartment(department3);
        supermarket2.addDepartment(department1);
        supermarket2.addDepartment(department2);
        supermarket3.addDepartment(department1);
        supermarket3.addDepartment(department3);
        supermarkets.add(supermarket1);
        supermarkets.add(supermarket2);
        supermarkets.add(supermarket3);
        return supermarkets;
    }

    @PostConstruct
    private void fillData() {
        staffArrayList = fillStaffMembers();
        customerArrayList = fillCustomers();
        supermarketArrayList = fillSupermarkets();
    }
}
