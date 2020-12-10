import java.util.Scanner;

class Email {

  static int s;

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Email m=new Email();
    String a="";
    String cus="";
    boolean o,z;
    int pas,cpas=0;
    do {
      System.out.println("Press 1 for Registration");
      System.out.println("Press any Integer for Login");
      Email.s=sc.nextInt();

      if (Email.s==1) {

        do {
          System.out.println("");
          System.out.print("Enter The UserName :");
          a=sc.next();

          if (a.contains("@gmail.com")) {
            int flag=0;

            do {
              System.out.println();
              System.out.print("Enter the Password :");
              pas =sc.nextInt();
              System.out.print("Confirm Password :");
              cpas =sc.nextInt();

              if (pas==cpas) {
                System.out.println();
                System.out.println("***Registration Successful***");
                System.out.println();
                flag=1;
              }else {
                System.out.println("Password Mismatch");
              }
            } while (flag==0);
          }else{
            System.out.println("Username Should be like example@gmail.com");
          }

        } while (!a.contains("@gmail.com"));
      }else {
        do{
        System.out.print("Enter the Username :");
        cus=sc.next();
        o=m.Username(a,cus);
      } while (o==false);
      m.Password(cpas,cus);
      }
    } while (s==1);
  }


  public boolean Username(String a,String cus) {

    Scanner sc=new Scanner(System.in);

    if (a.equals(cus)) {
      return true;
    }else {
      System.out.println("There's No Username exists as "+cus+" is it "+a);
      System.out.println();
      return false;
    }

  }

  public void Password(int pas,String cus) {

    int cpas,se;
    Scanner sc=new Scanner(System.in);
    boolean flag=true;

    do {
      System.out.println();
      System.out.print("Enter the Password :");
      cpas=sc.nextInt();

      if (pas==cpas) {

        Login(cus);
        se=sc.nextInt();
        flag=true;

      }else {
        System.out.println();
        System.out.println("Wrong Password");
        flag=false;
      }
    } while (flag==false);

  }

  public void Login(String cus) {

    Scanner sc=new Scanner(System.in);
    int se,bo=0,co=0,dr=0;
    String to="",sub="";
    String comp="";
    String dto="",dsub="";
    String dcomp="";
    int dec,log=0;

    do {
      System.out.println("");
      System.out.println("Press 1 to Compose Mail");
      System.out.println("Press 2 to View Mail");
      System.out.println("Press 3 to View Draft");
      System.out.println("Press 4 to Delete all Mail");
      se=sc.nextInt();

      switch (se) {

        case 1:
        System.out.println();
        System.out.println("From : "+cus);
        System.out.print("To : ");
        to=sc.next();
        System.out.print("Subject : ");
        sub=sc.next();
        comp=Compose();
        System.out.println();
        System.out.println("Press 1 to send Mail");
        System.out.println("Press any Integer to Save it as Draft");
        dec=sc.nextInt();

        if (dec==1) {
          System.out.println();
          System.out.println("***Mail Sent Successfully***");
          co=1;
          System.out.println();
          System.out.println("Want To Continue Press 1");
          System.out.println("Press any Integer to Logout");
          log=sc.nextInt();
          if (log==1) {
            System.out.println();
          }else {
            bo=1;
          }
        }else {
          System.out.println();
          System.out.println("Mail Stored in Drafts");
          dto=to;
          dsub=sub;
          dcomp=comp;
          to="";
          sub="";
          comp="";
          dr=1;
          System.out.println();
          System.out.println("Want To Continue Press 1");
          System.out.println("Press any Integer to Logout");
          log=sc.nextInt();
          if (log==1) {
            System.out.println();
          }else {
            bo=1;
          }
        }
        break;

        case 2:
        if (co==1) {

          System.out.println();
          System.out.println("From : "+cus);
          System.out.println("To : "+to);
          System.out.println("Subject : "+sub);
          System.out.println("Compose Mail : "+comp);
          System.out.println();
          System.out.println("Want To Continue Press 1");
          System.out.println("Press any Integer to Logout");
          log=sc.nextInt();
          if (log==1) {
            System.out.println();
          }else {
            bo=1;
          }
        }else {
          System.out.println();
          System.out.println("No Mail Exits");
        }
        break;

        case 3:
        if (dr==1) {

          System.out.println();
          System.out.println("From : "+cus);
          System.out.println("To : "+dto);
          System.out.println("Subject : "+dsub);
          System.out.println("Compose Mail : "+dcomp);
          System.out.println();
          System.out.println("Want To Continue Press 1");
          System.out.println("Press any Integer to Logout");
          log=sc.nextInt();
          if (log==1) {
            System.out.println();
          }else {
            bo=1;
          }
        }else {
          System.out.println();
          System.out.println("There's No Draft Mails");
          System.out.println();
        }
        break;

        case 4:
        to="";
        sub="";
        comp="";
        co=0;
        System.out.println();
        System.out.println("Want To Continue Press 1");
        System.out.println("Press any Integer to Logout");
        log=sc.nextInt();
        if (log==1) {
          System.out.println();
        }else {
          bo=1;
        }

        break;

        default:
          System.out.println("Invalid input");
          break;

      }

    } while (bo==0);

    System.out.println();
    System.out.println("***Thank You***");

  }

  public String Compose() {

    Scanner sc=new Scanner(System.in);
    String comp;
    System.out.println("Compose Mail :");
    comp=sc.nextLine();
    return comp;

  }


}
