/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 26 12:13:46 GMT 2025
 */

package org.apache.flink.connector.rocketmq.source.reader.deserializer;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Map;

import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.*;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(
        mockJVMNonDeterminism = true,
        useVFS = true,
        useVNET = true,
        resetStaticState = true,
        separateClassLoader = true,
        useJEE = true)
public class BytesMessage_ESTest extends BytesMessage_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        BytesMessage bytesMessage0 = new BytesMessage();
        bytesMessage0.setProperty(
                "_4AVAw4M9",
                "org.apache.flink.connector.rocketmq.source.reader.deserializer.BytesMessage");
        Object object0 = bytesMessage0.getProperty("_4AVAw4M9");
        assertEquals(
                "org.apache.flink.connector.rocketmq.source.reader.deserializer.BytesMessage",
                object0);
        assertNotNull(object0);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        BytesMessage bytesMessage0 = new BytesMessage();
        bytesMessage0.setProperties((Map<String, String>) null);
        Map<String, String> map0 = bytesMessage0.getProperties();
        assertNull(map0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        BytesMessage bytesMessage0 = new BytesMessage();
        bytesMessage0.setProperty(
                "_4AVAw4M9",
                "org.apache.flink.connector.rocketmq.source.reader.deserializer.BytesMessage");
        Map<String, String> map0 = bytesMessage0.getProperties();
        assertFalse(map0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        BytesMessage bytesMessage0 = new BytesMessage();
        byte[] byteArray0 = new byte[1];
        bytesMessage0.setData(byteArray0);
        byte[] byteArray1 = bytesMessage0.getData();
        assertArrayEquals(new byte[] {(byte) 0}, byteArray1);
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        BytesMessage bytesMessage0 = new BytesMessage();
        byte[] byteArray0 = new byte[0];
        bytesMessage0.setData(byteArray0);
        byte[] byteArray1 = bytesMessage0.getData();
        assertSame(byteArray1, byteArray0);
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        BytesMessage bytesMessage0 = new BytesMessage();
        bytesMessage0.setProperties((Map<String, String>) null);
        // Undeclared exception!
        try {
            bytesMessage0.setProperty("", "");
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.source.reader.deserializer.BytesMessage",
                    e);
        }
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        BytesMessage bytesMessage0 = new BytesMessage();
        bytesMessage0.setProperties((Map<String, String>) null);
        // Undeclared exception!
        try {
            bytesMessage0.getProperty(
                    "org.apache.flink.connector.rocketmq.source.reader.deserializer.BytesMessage");
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.source.reader.deserializer.BytesMessage",
                    e);
        }
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        BytesMessage bytesMessage0 = new BytesMessage();
        Map<String, String> map0 = bytesMessage0.getProperties();
        bytesMessage0.setProperties(map0);
        assertEquals(0, map0.size());
    }

    @Test(timeout = 4000)
    public void test8() throws Throwable {
        BytesMessage bytesMessage0 = new BytesMessage();
        byte[] byteArray0 = bytesMessage0.getData();
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test9() throws Throwable {
        BytesMessage bytesMessage0 = new BytesMessage();
        Object object0 =
                bytesMessage0.getProperty(
                        "org.apache.flink.connector.rocketmq.source.reader.deserializer.BytesMessage");
        assertNull(object0);
    }
}
