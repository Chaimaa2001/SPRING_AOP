package com.ad.metier;

import com.ad.aspects.Log;
import com.ad.aspects.SecuredByAspect;
import com.ad.metier.IMetier;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {
    @Log
    @SecuredByAspect(roles={"ADMIN"})
    @Override
    public void process() {
        System.out.println("Business Process");
    }
    @Override
    @Log
    @SecuredByAspect(roles={"ADMIN"})
    public double compute() {

        double data=80;
        System.out.println("Business computing and returning");
        return data;
    }
}
