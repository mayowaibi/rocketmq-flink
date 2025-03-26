/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 26 12:02:27 GMT 2025
 */

package org.apache.flink.connector.rocketmq.legacy.common.serialization;

import org.apache.flink.api.common.typeinfo.TypeInformation;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(
        mockJVMNonDeterminism = true,
        useVFS = true,
        useVNET = true,
        resetStaticState = true,
        separateClassLoader = true,
        useJEE = true)
public class SimpleStringDeserializationSchema_ESTest
        extends SimpleStringDeserializationSchema_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        SimpleStringDeserializationSchema simpleStringDeserializationSchema0 =
                new SimpleStringDeserializationSchema();
        byte[] byteArray0 = new byte[0];
        String string0 =
                simpleStringDeserializationSchema0.deserializeKeyAndValue(byteArray0, byteArray0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        SimpleStringDeserializationSchema simpleStringDeserializationSchema0 =
                new SimpleStringDeserializationSchema();
        byte[] byteArray0 = new byte[8];
        String string0 =
                simpleStringDeserializationSchema0.deserializeKeyAndValue(
                        (byte[]) null, byteArray0);
        assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        SimpleStringDeserializationSchema simpleStringDeserializationSchema0 =
                new SimpleStringDeserializationSchema();
        byte[] byteArray0 = new byte[8];
        String string0 =
                simpleStringDeserializationSchema0.deserializeKeyAndValue(
                        byteArray0, (byte[]) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        SimpleStringDeserializationSchema simpleStringDeserializationSchema0 =
                new SimpleStringDeserializationSchema();
        TypeInformation<String> typeInformation0 =
                simpleStringDeserializationSchema0.getProducedType();
        assertNotNull(typeInformation0);
    }
}
