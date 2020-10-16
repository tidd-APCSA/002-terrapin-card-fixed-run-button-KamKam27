public class TerrapinCard {
private double balance;

public TerrapinCard(double balanceAtStart) {
  this.balance = balanceAtStart;
}
public void payEconomical() {
 if(balance - 2.50 < 1){
   balance = balance;
} else {
  balance -= 2.50;
}
}

public void payGourmet() {
 if(balance - 4.00 < 1){
   balance = balance;
} else {
  balance -= 4.00;
}
}

public void loadMoney(double amount) {
if(balance + amount > 150){
  balance = 150;
}else if(balance + amount < 0){
  balance = balance;
}else {
  balance += amount;
}
}

public double getBalance() {
return balance;
}

public String toString() {
  return "The card has " + balance + " dollars";
}
}

