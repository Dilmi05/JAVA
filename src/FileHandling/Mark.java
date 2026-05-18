package FileHandling;

public class Mark {

    private String RegNo;
    private String q1;
    private String q2;
    private String q3;
    private String mid;
    private String end;


    public  Mark(String RegNo,String q1,String q2,String q3,String mid,String end){
        this.RegNo =RegNo;
        this. q1=q1;
        this. q2=q2;
        this. q3=q3;
        this. mid=mid;
        this. end=end;

    }


    public String getRegNo(){
        return RegNo;
    }

}
