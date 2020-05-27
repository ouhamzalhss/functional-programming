package demo4;


import java.util.Optional;

import static java.util.Optional.*;

/**
 * @author Lhouceine OUHAMZA
 */

public class App {

    public  String getDiscout(Customer customer){
        return  customer.getCardCredit()
                .flatMap(cardCredit -> getDiscoutPourcentage(cardCredit))
                .map(d->"discount % " + d)
                .orElse("kkkk");
    }

    private Optional<Integer> getDiscoutPourcentage(CardCredit cardCredit) {
        if(cardCredit.getFidelityPoint() >= 60 ){
            return of(5);
        }
        if(cardCredit.getFidelityPoint() >=40 ){
            return of(3);
        }
        return empty();
    }

    public static void main(String[] args){
        System.out.println(new App().getDiscout(new Customer(new CardCredit(90))));
        System.out.println(new App().getDiscout(new Customer(new CardCredit(15))));
        System.out.println(new App().getDiscout(new Customer()));
    }
}
