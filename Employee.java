

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;



 enum GENDER{
    MALE,
    FEMALE,
}

public class Employee {
    private String id;
    private String name;
    private LocalDate birth;  
    public Double Luong;
    public GENDER gender;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    


    

    public Employee(  String id, String name, String birth , Double Luong, GENDER gender  ) {
        this.id = id;
        this.name = name;
        this.birth = LocalDate.parse(birth,this.formatter);
        this.Luong = Luong; 
        this.gender = gender;
        
        
        
    }

    //check id

    public boolean checkId(String id) {
        boolean result = this.id.equals(id);
        return result;
        
    }

    

    

    //tim ten

    public boolean hasName(String keyword){
        boolean result= this.name.contains(keyword);
        return result;
    }


    public void inforEmployee(){
        System.out.print(this.id+ "\t");
        System.out.print(this.name+ "\t");
        System.out.print(this.birth+ "\t");
        System.out.print(this.gender+ "\t");
        System.out.print(this.Luong+ "d\n");
    }



  //check gender
    public boolean checkGender(GENDER XY ) {
        boolean result = gender.equals(XY);
        return result;

        
    }

    // check employee tren 30 tuoi

    public boolean over30yearsold() {
        LocalDate now = LocalDate.now();
        int age = now.getYear() - birth.getYear();
        boolean result = (age > 30);
        return result;
        
    }
// check birthday


    public boolean checkBirth(int month) {
        boolean result = this.birth.getMonthValue() == month ;
        return result;
        
    }





    


    

        
    
}
