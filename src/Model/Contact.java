package Model;

public class Contact <T,U> {
    
    private T name;
    private U phone;
    
    public Contact(T name, U phone) {
        this.name = name;
        this.phone = phone;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public U getPhone() {
        return phone;
    }

    public void setPhone(U phone) {
        this.phone = phone;
    }

   
     
    @Override
    public String toString() {
        return "Contacto [nombre=" + name + ", telefono=" + phone + "]";
    }

    @Override

    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    
    Contact<?,?> c = (Contact) obj;
    
    return name != null && name.equals(c.getName());
}
    
    
}
