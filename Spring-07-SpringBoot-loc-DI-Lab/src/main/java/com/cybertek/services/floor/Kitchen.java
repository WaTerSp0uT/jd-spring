package com.cybertek.services.floor;

import com.cybertek.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Kitchen implements Floor {

    @Value("${radius}")
    BigDecimal radius;
    @Override
    public BigDecimal getArea() {
        //BigDecimal pi = new BigDecimal(Math.PI);
        BigDecimal pi = new BigDecimal("3.14");
        return radius.pow(2).multiply(pi);
    }
}
