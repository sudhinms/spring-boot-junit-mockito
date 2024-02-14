package com.junit.mockito.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class) // extension used for initialise mocks
public class BusinessImplMockTest {

    @Mock // creating mock (DataService mock1 = mock(DataService.class);)
    private DataService dataService;

    @InjectMocks // Injecting mock object into BusinessImpl Constructor(BusinessImpl business=new BusinessImpl(mock1);)
    private BusinessImpl business;

    @Test
    void test(){
        // mock object
        DataService mock1 = mock(DataService.class);
        when(mock1.retrieveAllData()).thenReturn(new int[]{10,2,40,62});
        BusinessImpl business=new BusinessImpl(mock1);
        assertEquals(62,business.findGreatest());
    }

    // using annotation for creating mock and injecting it to BusinessImpl
    @Test
    void test1(){
        // mock object
        when(dataService.retrieveAllData()).thenReturn(new int[]{100,25,4,62});
        assertEquals(100,business.findGreatest());
    }
}
