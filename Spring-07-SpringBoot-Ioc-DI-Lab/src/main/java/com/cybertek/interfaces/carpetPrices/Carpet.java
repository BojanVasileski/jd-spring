package com.cybertek.interfaces.carpetPrices;

import com.cybertek.Enums.City;

import java.math.BigDecimal;

public interface Carpet {
    BigDecimal getSqFtPrice(City city);
}
