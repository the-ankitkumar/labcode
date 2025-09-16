package java_program;

public class encap {
    private int contact;
    protected String name;
    public int getContact() {
        return contact;
    }
    public void setContact(int contact) {
        this.contact = contact;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] Args){
        encap s = new encap();
        s.setName("Ankit");
        s.setContact(2456);
        System.out.println("Name:" + s.getName());
        System.out.println("Contact:" + s.getContact());
    }
}

