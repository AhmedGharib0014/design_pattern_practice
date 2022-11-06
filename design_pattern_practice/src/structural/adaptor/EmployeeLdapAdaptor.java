package structural.adaptor;

public class EmployeeLdapAdaptor implements Employee {

    private EmployeeLdap instance;

    public EmployeeLdapAdaptor(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getSurname();
    }

    @Override
    public String getLastName() {
        return instance.getGivenName();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }
}
