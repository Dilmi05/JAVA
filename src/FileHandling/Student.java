package FileHandling;

public class Student {

    private String RegNo;
    private String Name;
    private String DOB;
    private String Email;
    private String Contact;


    public Student(String RegNo,String name,String DOB,String Email,String Contact){

        this.RegNo=RegNo;
        this.Name=Name;
        this.DOB=DOB;
        this.Email=Email;
        this.Contact=Contact;

    }

    public String getRegNo(){
        return RegNo;
    }

    public String getName(){
        return Name;
    }
    public String getDOB(){
        return DOB;
    }
    public String getEmail(){
        return Email;

    }
    public String getContact(){
        return Contact;

    }

    public void setName(String Name){
        this.Name= Name;
    }

    public void setEmail(String Email){
        this.Email= Email;
    }

    public void setContact(String Contact){
        this.Contact= Contact;
    }



}
