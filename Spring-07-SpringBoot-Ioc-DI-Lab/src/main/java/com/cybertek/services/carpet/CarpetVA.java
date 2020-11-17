package com.cybertek.services.carpet;

import com.cybertek.Enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CarpetVA implements Carpet {

    private static final Map<City,BigDecimal> sqPriceforCity = new HashMap<>();

    static {
        sqPriceforCity.put(City.MCLEAN,new BigDecimal("4.32"));
        sqPriceforCity.put(City.ARLINGTON,new BigDecimal("2.92"));
        sqPriceforCity.put(City.FAIRFAX,new BigDecimal("4.64"));
    }

    @Override
    public BigDecimal getSqFtPrice(City city) {

        sqPriceforCity.entrySet().stream().filter(x -> x.getKey() == city).findFirst(); //converts map to set

        return null;
    }
}
