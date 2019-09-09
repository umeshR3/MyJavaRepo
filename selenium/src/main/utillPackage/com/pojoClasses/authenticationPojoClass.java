package utillPackage.com.pojoClasses;

public class authenticationPojoClass {
    private String password;

    private ProjectDetails projectdetails;

    private String username;

    private Customer[] customer;

    public String getPassword ()
    {
        return password;
    }

    public void setPassword (String password)
    {
        this.password = password;
    }

    public ProjectDetails getProjectdetails ()
    {
        return projectdetails;
    }

    public void setProjectdetails (ProjectDetails projectdetails)
    {
        this.projectdetails = projectdetails;
    }

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public Customer[] getCustomer ()
    {
        return customer;
    }

    public void setCustomer (Customer[] customer)
    {
        this.customer = customer;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [password = "+password+", projectdetails = "+projectdetails+", username = "+username+", customer = "+customer+"]";
    }
}
