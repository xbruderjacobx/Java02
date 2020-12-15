package de.js.java02;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FitzQuarkTest
{
    @Test
    public void should_give_Fitz_when_divisble_by_5()
    {
        // Given
        FitzQuark fitzquark = new FitzQuark();
        // When
        String result = fitzquark.play(10);
        // Then
        assertEquals(expected);
    }
}
