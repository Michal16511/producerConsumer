
package producerconsumer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class BananaTest {
    @Mock
    Banana banana;
    
    @Mock
    Raspberry raspberry;
    
    @Mock
    Apple apple;
    
    @InjectMocks
    Factory factory = new Factory();
    
    @Test
    public void shouldBeCalledAndReturnedBanana()
    {
        when(factory.getFood().thenReturn(Banana.class));
        
    }
}
