package com.vinay;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class vinayservice {
    private List<Vinay> vinayList = new ArrayList<>();

    public void addVinay(Vinay vinay) {
        vinayList.add(vinay);
    }

    public List<Vinay> getAllVinay() {
        return vinayList;
    }
}