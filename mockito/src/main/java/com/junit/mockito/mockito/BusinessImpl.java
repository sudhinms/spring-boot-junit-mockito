package com.junit.mockito.mockito;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class BusinessImpl {

    @Autowired
    private ConfigClass configClass;
    private DataService dataService;

    public BusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findGreatest(){
        int[] data=dataService.retrieveAllData();
        return Arrays.stream(data).max().getAsInt();
    }
}
interface DataService{
    int[] retrieveAllData();
}