package oops_practice.encapsulation;

public class NewBank {


    private String name;
    private String branch;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    public NewBank(String name, String branch) {
        this.name = name;
        this.branch= branch;
    }
}
