package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartphoneTest {

    @Test
    void IfStartRadioReturnTrue() {

        //Given

        Smartphone smartphone = new Smartphone();


        //When

        boolean actual = smartphone.startRadio();


        //Then

        assertEquals(true, actual);

    }


    @Test
    void IfStartRadioReturnFalse() {

        Smartphone smartphone = new Smartphone();


        //When

        boolean actual = smartphone.stopRadio();


        //Then

        assertEquals(false, actual);

    }


}
