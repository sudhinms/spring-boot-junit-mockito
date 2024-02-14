package com.junit.mockito.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BusinessImplStubTest {

    // stub object
    private DataService dataService=()->new int[]{10,2,40,62};
    @Test
    void test(){
        BusinessImpl business=new BusinessImpl(dataService);
        assertEquals(62,business.findGreatest());
    }
}
