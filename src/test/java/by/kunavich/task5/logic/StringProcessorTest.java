package by.kunavich.task5.logic;

import org.junit.Assert;
import org.junit.Test;

public class StringProcessorTest {
    @Test
    public void processWithStringTest() throws Exception {


        //given
        String str = "ghh345}ef}|44ffhfd}}3fdsa";
        StringProcessor stringProcessor= new StringProcessor();

        //whenn
        String actual =stringProcessor.processWithString(str);
        //then
        Assert.assertEquals("ghh ef ffhfd fdsa",actual);

    }

    @Test
    public void processWithRgxTest() throws Exception {


        //given
        String str = "ghh345}ef}|44ffhfd}}3fdsa";
        StringProcessor stringProcessor= new StringProcessor();

        //whenn
        String actual =stringProcessor.processWithRgx(str);
        //then
        Assert.assertEquals("ghh ef ffhfd fdsa",actual);

    }


}
