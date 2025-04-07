package com.example.vinay;

import org.springframework.stereotype.Service;

@Service
public class VinayService {
    public VinayModel getVinayDetails() {
        return new VinayModel("Vinay", "Spring Boot Developer Extraordinaire");
    }
}
