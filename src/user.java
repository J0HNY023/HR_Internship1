/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ideapad 520
 */
class user {
    
  
    
    private int idNumbers, SSS_Number,  Contact_Number;
    private String FirstName, LastName, Gender, Address, Position, Unit, BirthDate, Tax_ID;  
    
    public user(int idNumbers, int SSS_Number, String Tax_ID, int Contact_Number, String FirstName, String LastName, String Gender, String Address, String Position, String Unit, String BirthDate){
        this.idNumbers = idNumbers;
        this.SSS_Number = SSS_Number;
        this.Tax_ID = Tax_ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.Address = Address;
        this.Position = Position;
        this.Unit = Unit;
        this.BirthDate = BirthDate;
        this.Contact_Number = Contact_Number;
        
        
    }
    
    public int getID_Number(){
        return idNumbers;
    }
    public int getSSS_Number(){
        return SSS_Number;
    }
    public String getTax_ID(){
        return Tax_ID;
    }
    public int getContact_Number(){
        return Contact_Number;
    }
    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public String getGender(){
        return Gender;
    }
    public String getAddress(){
        return Address;
    }
    public String getPosition(){
        return Position;
     
    }
    public String getUnit(){
        return Unit;
    }
    public String getBirthDate(){
        return BirthDate;
    }
    
    
    
    
    
    
    
}
