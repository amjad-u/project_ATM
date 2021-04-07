package project_atm;


public class user  {
private  double balance= 800.0;

private double amount;
private String nameaccount;
private  long accountnumber;
private String newaccount;
String history = "THE HISORY ACCOUNT IS : ";



    user(double d) {

    }


double getbalance(double D){
    return balance;
}


  double getwithdraw( double D) {
      history = history+"\nwithdraw"+D;
       balance-=D;
     return balance;

    }

    //--------------------------------
   double getdeposit(double D) {
             history = history+"\ndeposit"+D;

              balance+=D;
     return balance;
    }
      //-------------------------------
        double gettransfer(double D) {
                  history = history+"\ntransfer"+D;
                    balance-=D;
     return balance;

    }
        //-----------------------------
     String getquit( String cancel ) {
     return cancel;
    }
     //-------------------------------

    String getnewaccount() {
          history = history+" new account "+ accountnumber + nameaccount;

            return newaccount;


    }

}
