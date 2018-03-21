package test.com.swille.domain.services;

import com.swille.domain.services.IService;
import com.swille.domain.services.MyAbstract;
import com.swille.domain.services.XService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
public class MyAbstractTest {

    @Mock
    private XService xService;
    @Mock
    private IService iService;

    @InjectMocks
    public MyAbstract sut;

    @Test
    public void getXData(){
        assertEquals(true, true);
    }



}
