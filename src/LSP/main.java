package LSP;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Member> myList = new ArrayList<Member>();

        myList.add(new LifetimeMember("Gaurav",new Date()));
        myList.add(new AnnualMember("Sharma",new Date()));
        myList.add(new EnquiryUser("Knoldus"));

        for (Member c: myList){
            c.addToDatabase();
        }
    }


}
