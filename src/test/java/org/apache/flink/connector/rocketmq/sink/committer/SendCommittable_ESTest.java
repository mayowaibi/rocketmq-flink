/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 26 11:59:36 GMT 2025
 */

package org.apache.flink.connector.rocketmq.sink.committer;

import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.MessageQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(
        mockJVMNonDeterminism = true,
        useVFS = true,
        useVNET = true,
        resetStaticState = true,
        separateClassLoader = true,
        useJEE = true)
public class SendCommittable_ESTest extends SendCommittable_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getMsgId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertNotNull(sendCommittable0);

        sendCommittable0.setTransactionId("F");
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getMsgId());
        assertEquals("F", sendCommittable0.getTransactionId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());

        String string0 = sendCommittable0.getTransactionId();
        assertEquals("F", string0);
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getMsgId());
        assertEquals("F", sendCommittable0.getTransactionId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getTopic());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNotNull(sendCommittable0);

        sendCommittable0.setTransactionId("");
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getQueueId());
        assertEquals("", sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getTopic());
        assertEquals("", sendCommittable0.getOffsetMsgId());

        String string0 = sendCommittable0.getTransactionId();
        assertEquals("", string0);
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getQueueId());
        assertEquals("", sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getTopic());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getTopic());
        assertNotNull(sendCommittable0);

        sendCommittable0.setTopic("~Mwa'oE:B1(r~XNg8t");
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getQueueOffset());
        assertEquals("~Mwa'oE:B1(r~XNg8t", sendCommittable0.getTopic());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getBrokerName());

        String string0 = sendCommittable0.getTopic();
        assertEquals("~Mwa'oE:B1(r~XNg8t", string0);
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getQueueOffset());
        assertEquals("~Mwa'oE:B1(r~XNg8t", sendCommittable0.getTopic());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getBrokerName());
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertNull(sendCommittable0.getQueueOffset());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getMsgId());
        assertNotNull(sendCommittable0);

        sendCommittable0.setTopic("");
        assertNull(sendCommittable0.getQueueOffset());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueId());
        assertEquals("", sendCommittable0.getTopic());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getMsgId());

        String string0 = sendCommittable0.getTopic();
        assertEquals("", string0);
        assertNull(sendCommittable0.getQueueOffset());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueId());
        assertEquals("", sendCommittable0.getTopic());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getMsgId());
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getTransactionId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertNotNull(sendCommittable0);

        Long long0 = new Long(1833L);
        assertEquals(1833L, (long) long0);
        assertNotNull(long0);

        sendCommittable0.setQueueOffset(long0);
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getTransactionId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertEquals(1833L, (long) sendCommittable0.getQueueOffset());

        Long long1 = sendCommittable0.getQueueOffset();
        assertEquals(1833L, (long) long1);
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getTransactionId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertEquals(1833L, (long) sendCommittable0.getQueueOffset());
        assertNotNull(long1);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getTopic());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNotNull(sendCommittable0);

        Long long0 = new Long(0L);
        assertEquals(0L, (long) long0);
        assertNotNull(long0);

        sendCommittable0.setQueueOffset(long0);
        assertNull(sendCommittable0.getMsgId());
        assertEquals(0L, (long) sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getTopic());
        assertEquals("", sendCommittable0.getOffsetMsgId());

        Long long1 = sendCommittable0.getQueueOffset();
        assertEquals(0L, (long) long1);
        assertNull(sendCommittable0.getMsgId());
        assertEquals(0L, (long) sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getTopic());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNotNull(long1);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getQueueOffset());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getMsgId());
        assertNotNull(sendCommittable0);

        Long long0 = new Long((-959L));
        assertEquals((-959L), (long) long0);
        assertNotNull(long0);

        sendCommittable0.setQueueOffset(long0);
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getQueueId());
        assertEquals((-959L), (long) sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getTransactionId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getMsgId());

        Long long1 = sendCommittable0.getQueueOffset();
        assertEquals((-959L), (long) long1);
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getQueueId());
        assertEquals((-959L), (long) sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getTransactionId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getMsgId());
        assertNotNull(long1);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getTopic());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueId());
        assertNotNull(sendCommittable0);

        Long long0 = new Long((-1860L));
        assertEquals((-1860L), (long) long0);
        assertNotNull(long0);

        sendCommittable0.setQueueOffset(long0);
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getTopic());
        assertEquals((-1860L), (long) sendCommittable0.getQueueOffset());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueId());

        Long long1 = sendCommittable0.getQueueOffset();
        assertEquals((-1860L), (long) long1);
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getTopic());
        assertEquals((-1860L), (long) sendCommittable0.getQueueOffset());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueId());
        assertNotNull(long1);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertNull(sendCommittable0.getMsgId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getBrokerName());
        assertNotNull(sendCommittable0);

        Integer integer0 = new Integer(125);
        assertEquals(125, (int) integer0);
        assertNotNull(integer0);

        sendCommittable0.setQueueId(integer0);
        assertNull(sendCommittable0.getMsgId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getBrokerName());
        assertEquals(125, (int) sendCommittable0.getQueueId());

        Integer integer1 = sendCommittable0.getQueueId();
        assertEquals(125, (int) integer1);
        assertNull(sendCommittable0.getMsgId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getBrokerName());
        assertEquals(125, (int) sendCommittable0.getQueueId());
        assertNotNull(integer1);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getTransactionId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getQueueId());
        assertNotNull(sendCommittable0);

        Integer integer0 = new Integer(0);
        assertEquals(0, (int) integer0);
        assertNotNull(integer0);

        sendCommittable0.setQueueId(integer0);
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getTransactionId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getTopic());
        assertEquals(0, (int) sendCommittable0.getQueueId());

        Integer integer1 = sendCommittable0.getQueueId();
        assertEquals(0, (int) integer1);
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getTransactionId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getTopic());
        assertEquals(0, (int) sendCommittable0.getQueueId());
        assertNotNull(integer1);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getMsgId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getTopic());
        assertNotNull(sendCommittable0);

        Integer integer0 = new Integer((-160));
        assertEquals((-160), (int) integer0);
        assertNotNull(integer0);

        sendCommittable0.setQueueId(integer0);
        assertEquals((-160), (int) sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getMsgId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getTopic());

        Integer integer1 = sendCommittable0.getQueueId();
        assertEquals((-160), (int) integer1);
        assertEquals((-160), (int) sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getMsgId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getTopic());
        assertNotNull(integer1);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getMsgId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNotNull(sendCommittable0);

        Integer integer0 = new Integer((-1));
        assertEquals((-1), (int) integer0);
        assertNotNull(integer0);

        sendCommittable0.setQueueId(integer0);
        assertNull(sendCommittable0.getBrokerName());
        assertEquals((-1), (int) sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getMsgId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueOffset());

        Integer integer1 = sendCommittable0.getQueueId();
        assertEquals((-1), (int) integer1);
        assertNull(sendCommittable0.getBrokerName());
        assertEquals((-1), (int) sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getMsgId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNotNull(integer1);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getMsgId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getTopic());
        assertNotNull(sendCommittable0);

        sendCommittable0.setMsgId("*");
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getBrokerName());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getTopic());
        assertEquals("*", sendCommittable0.getMsgId());

        String string0 = sendCommittable0.getMsgId();
        assertEquals("*", string0);
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getBrokerName());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getTopic());
        assertEquals("*", sendCommittable0.getMsgId());
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getTransactionId());
        assertNotNull(sendCommittable0);

        sendCommittable0.setMsgId("");
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueOffset());
        assertEquals("", sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getTransactionId());

        String string0 = sendCommittable0.getMsgId();
        assertEquals("", string0);
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueOffset());
        assertEquals("", sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getTransactionId());
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getQueueId());
        assertNotNull(sendCommittable0);

        Integer integer0 = new Integer(2524);
        assertEquals(2524, (int) integer0);
        assertNotNull(integer0);

        sendCommittable0.setQueueId(integer0);
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getTopic());
        assertEquals(2524, (int) sendCommittable0.getQueueId());

        MessageQueue messageQueue0 = sendCommittable0.getMessageQueue();
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getTopic());
        assertEquals(2524, (int) sendCommittable0.getQueueId());
        assertNull(messageQueue0.getTopic());
        assertNull(messageQueue0.getBrokerName());
        assertEquals(2524, messageQueue0.getQueueId());
        assertNotNull(messageQueue0);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getMsgId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTransactionId());
        assertNotNull(sendCommittable0);

        Integer integer0 = new Integer((-321));
        assertEquals((-321), (int) integer0);
        assertNotNull(integer0);

        sendCommittable0.setQueueId(integer0);
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getMsgId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getBrokerName());
        assertEquals((-321), (int) sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTransactionId());

        MessageQueue messageQueue0 = sendCommittable0.getMessageQueue();
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getMsgId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getBrokerName());
        assertEquals((-321), (int) sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(messageQueue0.getBrokerName());
        assertNull(messageQueue0.getTopic());
        assertEquals((-321), messageQueue0.getQueueId());
        assertNotNull(messageQueue0);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertNotNull(sendCommittable0);

        sendCommittable0.setBrokerName("/faW^j{*R3; &dak");
        assertEquals("/faW^j{*R3; &dak", sendCommittable0.getBrokerName());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());

        String string0 = sendCommittable0.getBrokerName();
        assertEquals("/faW^j{*R3; &dak", string0);
        assertEquals("/faW^j{*R3; &dak", sendCommittable0.getBrokerName());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertNull(sendCommittable0.getQueueOffset());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getTransactionId());
        assertNotNull(sendCommittable0);

        sendCommittable0.setBrokerName("");
        assertNull(sendCommittable0.getQueueOffset());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getMsgId());
        assertEquals("", sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getTransactionId());

        String string0 = sendCommittable0.getBrokerName();
        assertEquals("", string0);
        assertNull(sendCommittable0.getQueueOffset());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getMsgId());
        assertEquals("", sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getTransactionId());
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertNull(sendCommittable0.getTransactionId());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getMsgId());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getQueueOffset());
        assertNotNull(sendCommittable0);

        // Undeclared exception!
        try {
            sendCommittable0.getMessageQueue();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.sink.committer.SendCommittable", e);
        }
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        SendResult sendResult0 = mock(SendResult.class, new ViolatedAssumptionAnswer());
        doReturn((MessageQueue) null).when(sendResult0).getMessageQueue();
        SendCommittable sendCommittable0 = null;
        try {
            sendCommittable0 = new SendCommittable(sendResult0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.sink.committer.SendCommittable", e);
        }
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertEquals("", sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getBrokerName());
        assertNull(sendCommittable0.getMsgId());
        assertNotNull(sendCommittable0);

        sendCommittable0.setOffsetMsgId(
                "See also https://www.slf4j.org/codes.html#substituteLogger");
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getBrokerName());
        assertEquals(
                "See also https://www.slf4j.org/codes.html#substituteLogger",
                sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getMsgId());

        long long0 = sendCommittable0.getMessageOffset();
        assertEquals((-1L), long0);
        assertNull(sendCommittable0.getTransactionId());
        assertNull(sendCommittable0.getQueueId());
        assertNull(sendCommittable0.getTopic());
        assertNull(sendCommittable0.getQueueOffset());
        assertNull(sendCommittable0.getBrokerName());
        assertEquals(
                "See also https://www.slf4j.org/codes.html#substituteLogger",
                sendCommittable0.getOffsetMsgId());
        assertNull(sendCommittable0.getMsgId());
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        long long0 = sendCommittable0.getMessageOffset();
        assertEquals((-1L), long0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        MessageQueue messageQueue0 = new MessageQueue();
        SendResult sendResult0 = mock(SendResult.class, new ViolatedAssumptionAnswer());
        doReturn(messageQueue0, messageQueue0, messageQueue0).when(sendResult0).getMessageQueue();
        doReturn((String) null).when(sendResult0).getMsgId();
        doReturn((String) null).when(sendResult0).getOffsetMsgId();
        doReturn((-2057L)).when(sendResult0).getQueueOffset();
        doReturn((String) null).when(sendResult0).getTransactionId();
        SendCommittable sendCommittable0 = new SendCommittable(sendResult0);
        String string0 = sendCommittable0.getOffsetMsgId();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        MessageQueue messageQueue0 = new MessageQueue();
        SendResult sendResult0 = mock(SendResult.class, new ViolatedAssumptionAnswer());
        doReturn(messageQueue0, messageQueue0, messageQueue0).when(sendResult0).getMessageQueue();
        doReturn((String) null).when(sendResult0).getMsgId();
        doReturn((String) null).when(sendResult0).getOffsetMsgId();
        doReturn((-2057L)).when(sendResult0).getQueueOffset();
        doReturn((String) null).when(sendResult0).getTransactionId();
        SendCommittable sendCommittable0 = new SendCommittable(sendResult0);
        String string0 = sendCommittable0.toString();
        assertEquals(
                "SendCommittable{topic='null', brokerName='null', queueId=0, queueOffset=-2057, msgId='null', offsetMsgId='null', transactionId='null'}",
                string0);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        MessageQueue messageQueue0 = new MessageQueue();
        SendResult sendResult0 = mock(SendResult.class, new ViolatedAssumptionAnswer());
        doReturn(messageQueue0, messageQueue0, messageQueue0).when(sendResult0).getMessageQueue();
        doReturn((String) null).when(sendResult0).getMsgId();
        doReturn((String) null).when(sendResult0).getOffsetMsgId();
        doReturn((-2057L)).when(sendResult0).getQueueOffset();
        doReturn((String) null).when(sendResult0).getTransactionId();
        SendCommittable sendCommittable0 = new SendCommittable(sendResult0);
        MessageQueue messageQueue1 = sendCommittable0.getMessageQueue();
        assertTrue(messageQueue1.equals((Object) messageQueue0));
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        Integer integer0 = sendCommittable0.getQueueId();
        assertNull(integer0);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        MessageQueue messageQueue0 = new MessageQueue();
        SendResult sendResult0 = mock(SendResult.class, new ViolatedAssumptionAnswer());
        doReturn(messageQueue0, messageQueue0, messageQueue0).when(sendResult0).getMessageQueue();
        doReturn((String) null).when(sendResult0).getMsgId();
        doReturn((String) null).when(sendResult0).getOffsetMsgId();
        doReturn((-2057L)).when(sendResult0).getQueueOffset();
        doReturn((String) null).when(sendResult0).getTransactionId();
        SendCommittable sendCommittable0 = new SendCommittable(sendResult0);
        String string0 = sendCommittable0.getTopic();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        sendCommittable0.setOffsetMsgId(
                "See also https://www.slf4j.org/codes.html#substituteLogger");
        String string0 = sendCommittable0.getOffsetMsgId();
        assertEquals("See also https://www.slf4j.org/codes.html#substituteLogger", string0);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        String string0 = sendCommittable0.getMsgId();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        MessageQueue messageQueue0 = new MessageQueue();
        SendResult sendResult0 = mock(SendResult.class, new ViolatedAssumptionAnswer());
        doReturn(messageQueue0, messageQueue0, messageQueue0).when(sendResult0).getMessageQueue();
        doReturn((String) null).when(sendResult0).getMsgId();
        doReturn((String) null).when(sendResult0).getOffsetMsgId();
        doReturn((-2057L)).when(sendResult0).getQueueOffset();
        doReturn((String) null).when(sendResult0).getTransactionId();
        SendCommittable sendCommittable0 = new SendCommittable(sendResult0);
        String string0 = sendCommittable0.getBrokerName();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        String string0 = sendCommittable0.getTransactionId();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        SendCommittable sendCommittable0 = new SendCommittable();
        Long long0 = sendCommittable0.getQueueOffset();
        assertNull(long0);
    }
}
