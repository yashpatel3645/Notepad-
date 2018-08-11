import java.util.*;
public class Bank 
{
    static String name,accountnum,id,password;
    static int amount,FD,choice;
    static boolean loop = true;
    String nextline()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    int nextInt()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static void main(String[] args) 
    {
        Bank bank = new Bank();
        System.out.println("Welcome to Bank\n");
        do
        {
        System.out.println("Select 1 for Open Account");
        System.out.println("Select 2 for Login");
        System.out.println("Select 3 for Account Detail");
        System.out.println("Select 4 for Fund Transfer");
        System.out.println("Select 5 for Open FD");
        System.out.println("Select 6 for Logout");
        System.out.println("Select 7 for Exit");
        choice = bank.nextInt();
        switch(choice)
                {
            case 1:
                System.out.println("Enter your Name : ");
                name = bank.nextline();
                System.out.println("Enter your User Name : ");
                id = bank.nextline();
                System.out.println("Enter your Password : ");
                password = bank.nextline();
                System.out.println("Enter your Amount : ");
                amount = bank.nextInt();
                accountnum="156357897564";
                System.out.println("Your Acoount Created Successfully.");
                System.out.println("Your Account Number is "+accountnum);
                break;
            case 2:
                System.out.println("Enter User Name : ");
                String a = bank.nextline();
                System.out.println("Enter Your Password : ");
                String b = bank.nextline();
                if(a.equals(id)&&b.equals(password))
                    System.out.println("Login Successful.");
                else
                    System.out.println("User Name or Password not match.");
                break;
            case 3:
                if(name==null)
                    System.out.println("Please Login First.");
                else
                {
                    System.out.println("Account Holder Name = "+name);
                    System.out.println("Account Number = "+accountnum);
                    System.out.println("User Name = "+id);
                    System.out.println("Amount = "+amount);
                }
                break;
            case 4:
                System.out.println("Enter Paypee Name : ");
                String pname = bank.nextline();
                System.out.println("Enter Paypee Account No : ");
                String paccountno = bank.nextline();
                System.out.println("Enter Amount to Transfer : ");
                int pamount = bank.nextInt();
                if(pamount<=amount)
                {
                    amount = amount-pamount;
                    System.out.println("Your Transaction Successfully");
                    System.out.println("Transaction Detail : ");
                    System.out.println("        Paypee Name       : "+pname);
                    System.out.println("        Paypee Account No : "+paccountno);
                    System.out.println("        Transferd Amount  : "+pamount);
                }
                else
                    System.out.println("Transaction fail because your balance is low.");
                break;
            case 5:
                System.out.println("Enter amount for FD : ");
                FD = bank.nextInt();
                if(FD<=amount)
                {
                    amount = amount-FD;
                System.out.println("FD Done Successfully.");
                System.out.println("FD price is "+FD);
                }
                else
                    System.out.println("Fail!!!!\nFD price is greater then your account balance.");
                break;
            case 6:
                amount=0;
                name="";
                accountnum="";
                id="";
                password="";
                System.out.println("Logout successfully.");
                System.out.println("Do you want to Exit?(y/n)");
                String c = bank.nextline();
                if(c.equals("n")||c.equals("n"))
                    break;
                else
                {
                    loop=false;
                    System.exit(0);
                }
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Please Select Number Between 1 to 7.");
                loop=false;
                }
        }while(loop);
    }
}