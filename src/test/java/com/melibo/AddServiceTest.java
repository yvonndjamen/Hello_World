package com.melibo;

import com.melibo.services.AddService;
import org.junit.Assert;
import org.junit.Test;

public class AddServiceTest {
    @Test
    public void print() {
        AddService service = new AddService();

        Integer response = service.add(2, 3);

        Assert.assertEquals(java.util.Optional.of(6), java.util.Optional.of(response));
    }
}
