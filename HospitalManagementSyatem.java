abstract class Staff
{
    String sname;
    int id;
    public Staff(String sname,int id)
    {
        this.sname=sname;
        this.id=id;
    }
    abstract void  performDuty();
    public void showInfo()
    {
        System.out.println("ID:"+id+"Name"+sname);
    }
}
class Doctor extends Staff
{
    
    public Doctor(String sname,int id)
    {
        super(sname,id);
        
    }
    public void performDuty()
    {
        System.out.println("Doctor:"+sname+"is diagnosing and treating patients");
    }

}
class Nurse extends Staff
{
    
    public Nurse(String sname,int id)
    {
        super(sname,id);
        
    }
    public void performDuty()
    {
        System.out.println("Nurse:"+sname+"is assisting in patient care and medication");
    }
}
public class HospitalManagementSyatem 
{
    public static void main(String[] args) 
    {
        Staff[] staffMembers=new Staff[3];
        staffMembers[0]=new Doctor("Dr.Smith",101);
        staffMembers[1]=new Nurse("Nurse Rachel",201);
        staffMembers[2]=new Doctor("Dr.Patel",102);
        for(Staff s:staffMembers)
        {
            s.showInfo();
            s.performDuty();
            System.out.println();
        }

        
    }
    
}
