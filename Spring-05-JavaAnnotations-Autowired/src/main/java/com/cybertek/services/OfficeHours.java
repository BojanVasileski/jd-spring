package com.cybertek.services;

import com.cybertek.com.cybertek.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {
    @Override
    public int getHours() {
       return 4;
    }
}
