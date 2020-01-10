package com.algorithm.datastructure.creditcard;

public class CreditCardProcessor {

    private CreditCard[] creditCards;

    public CreditCardProcessor() {
        CreditCard visa = new CreditCard("VISA", new String[]{"4"}, new Integer[]{15});
        CreditCard amex = new CreditCard("Amex", new String[]{"34", "37"}, new Integer[]{15});
        CreditCard discovery = new CreditCard("Discovery", new String[]{"60", "65"}, new Integer[]{16});
        CreditCard jcb = new CreditCard("JCB", new String[]{"35"}, new Integer[]{16, 17, 18, 19});

        creditCards = new CreditCard[]{visa, amex, discovery, jcb};
    }

    public String getCardType(String cardNumber) {
        for (CreditCard creditCard : creditCards){
            if (creditCard.matches(cardNumber)){
                return creditCard.getName();
            }
        }
        return "Unknown";
    }
}
