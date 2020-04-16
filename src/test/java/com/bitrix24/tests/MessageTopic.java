package com.bitrix24.tests;

import com.bitrix24.base.TestBase;
import org.testng.annotations.Test;

public class MessageTopic extends TestBase {

    @Test
    public void topicIcon(){
   //8. User should be able to click on the Topic icon to see the Message Topic text box displays on top of the message box.
        test = report.createTest("Topic icon tests");

    }
}
