package com.junit.mockito.mockito.list;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ListTest {
    @Test
    public void test(){
        List listMock=mock(List.class);
        when(listMock.size()).thenReturn(3);
        assertEquals(3,listMock.size());
        when(listMock.get(2)).thenReturn("hai");
        assertEquals("hai",listMock.get(2));
    }
    @Test
    public void test2(){
        List listMock=mock(List.class);
        when(listMock.size()).thenReturn(3)
                .thenReturn(4).thenReturn(5);
        assertEquals(3,listMock.size());
        assertEquals(4,listMock.size());
        assertEquals(5,listMock.size());
    }

    @Test
    public void test3(){
        List listMock=mock(List.class);
        when(listMock.get(Mockito.anyInt()))
                .thenReturn("default String");
        assertEquals("default String",listMock.get(1));
        assertEquals("default String",listMock.get(4));
        assertEquals("another default value",listMock.get(2));

    }
}
