package com.FlowerShop_OOP.Specification;

import java.util.Date;

public class TulipSpecification extends Specification {
    TulipSpecification(int price, String name, String smell, int lengthOfStem, Date freshness, String originCountry) {
        super(price,  smell, lengthOfStem, freshness, originCountry);
    }
}
