package com.cybertek.services.carpet;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetVA implements Carpet {

    private static final Map<City,BigDecimal> sqPriceForCity = new HashMap<>();

    //Will run and once before all, once to pump the data
    static {
        sqPriceForCity.put(City.MCLEAN, new BigDecimal("4.32"));
        sqPriceForCity.put(City.ARLINGTON, new BigDecimal("2.92"));
        sqPriceForCity.put(City.FAIRFAX, new BigDecimal("4.65"));
    }




    @Override
    public BigDecimal getSqFtPrice(City city) {

        BigDecimal defaultValue = BigDecimal.ZERO;
        //Stream takes only list and arr, but we have map... so we have to use EntrySet()
        Optional<Map.Entry<City,BigDecimal>> collect = sqPriceForCity.entrySet().stream().filter(x -> x.getKey() == city ).findFirst();


        return collect.isPresent() ? collect.get().getValue() : defaultValue;
    }
}
