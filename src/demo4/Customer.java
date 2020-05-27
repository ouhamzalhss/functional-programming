package demo4;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Optional;

/**
 * @author Lhouceine OUHAMZA
 */
//@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    private CardCredit cardCredit;

    public Optional<CardCredit> getCardCredit() {
        return Optional.ofNullable(cardCredit);
    }

    public void setCardCredit(CardCredit cardCredit) {

        this.cardCredit = cardCredit;
    }
}
