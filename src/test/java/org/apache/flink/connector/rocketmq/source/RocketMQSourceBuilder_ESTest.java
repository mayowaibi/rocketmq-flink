/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 26 12:19:11 GMT 2025
 */

package org.apache.flink.connector.rocketmq.source;

import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.connector.source.Boundedness;
import org.apache.flink.configuration.ConfigOption;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.configuration.FallbackKey;
import org.apache.flink.connector.rocketmq.source.enumerator.offset.OffsetsSelector;
import org.apache.flink.connector.rocketmq.source.reader.deserializer.RocketMQDeserializationSchema;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.Map;
import java.util.Properties;

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
public class RocketMQSourceBuilder_ESTest extends RocketMQSourceBuilder_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        RocketMQSourceBuilder<RocketMQSourceBuilder<Object>> rocketMQSourceBuilder0 =
                new RocketMQSourceBuilder<RocketMQSourceBuilder<Object>>();
        String[] stringArray0 = new String[4];
        stringArray0[0] = "8)4]'JD!";
        stringArray0[1] = "org.apache.flink.configuration.ConfigOptions$OptionBuilder";
        stringArray0[2] = "rocketmq.source.offset.commit.interval";
        String string0 = "org.apache.flink.configuration.ConfigOptions";
        rocketMQSourceBuilder0.setTopics(stringArray0);
        stringArray0[3] = "org.apache.flink.configuration.ConfigOptions";
        // Undeclared exception!
        try {
            rocketMQSourceBuilder0.setTopics(stringArray0);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // This option rocketmq.source.topic has been set to value
            // 8)4]'JD!;org.apache.flink.configuration.ConfigOptions$OptionBuilder;rocketmq.source.offset.commit.interval;.
            //
            verifyException("org.apache.flink.util.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        RocketMQSourceBuilder<RocketMQSourceBuilder<Object>> rocketMQSourceBuilder0 =
                new RocketMQSourceBuilder<RocketMQSourceBuilder<Object>>();
        ConfigOption<Integer> configOption0 =
                (ConfigOption<Integer>) mock(ConfigOption.class, new ViolatedAssumptionAnswer());
        Integer integer0 = new Integer(182);
        OffsetsSelector offsetsSelector0 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        OffsetsSelector offsetsSelector1 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder1 = new RocketMQSourceBuilder<Object>();
        RocketMQSource<Object> rocketMQSource0 = rocketMQSourceBuilder1.build();
        assertEquals(Boundedness.CONTINUOUS_UNBOUNDED, rocketMQSource0.getBoundedness());

        RocketMQSourceBuilder<String> rocketMQSourceBuilder2 = new RocketMQSourceBuilder<String>();
        // Undeclared exception!
        try {
            rocketMQSourceBuilder2.setProperties((Properties) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.common.config.RocketMQConfigBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder0 = new RocketMQSourceBuilder<Object>();
        ConfigOption<String> configOption0 =
                (ConfigOption<String>) mock(ConfigOption.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(configOption0).hasFallbackKeys();
        doReturn(";", ";").when(configOption0).key();
        String string0 = "NcPT|6";
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder1 =
                rocketMQSourceBuilder0.setConfig(configOption0, "NcPT|6");
        OffsetsSelector offsetsSelector0 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder2 =
                rocketMQSourceBuilder1.setBounded(offsetsSelector0);
        // Undeclared exception!
        try {
            rocketMQSourceBuilder2.setProperties((Properties) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.common.config.RocketMQConfigBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder0 = new RocketMQSourceBuilder<Object>();
        OffsetsSelector offsetsSelector0 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder1 =
                rocketMQSourceBuilder0.setBounded(offsetsSelector0);
        DeserializationSchema<Object> deserializationSchema0 =
                (DeserializationSchema<Object>)
                        mock(DeserializationSchema.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder2 =
                rocketMQSourceBuilder1.setBodyOnlyDeserializer(deserializationSchema0);
        RocketMQDeserializationSchema<Object> rocketMQDeserializationSchema0 =
                (RocketMQDeserializationSchema<Object>)
                        mock(RocketMQDeserializationSchema.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder3 =
                rocketMQSourceBuilder2.setDeserializer(rocketMQDeserializationSchema0);
        String[] stringArray0 = new String[1];
        stringArray0[0] = "configOption must not be null";
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder4 =
                rocketMQSourceBuilder3.setTopics(stringArray0);
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder5 =
                rocketMQSourceBuilder4.setEndpoints("jpNTf'ax\"^W&.A^=y");
        // Undeclared exception!
        try {
            rocketMQSourceBuilder5.setEndpoints("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // This option rocketmq.client.endpoints has been set to value jpNTf'ax\"^W&.A^=y.
            //
            verifyException("org.apache.flink.util.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        RocketMQSourceBuilder<String> rocketMQSourceBuilder0 = new RocketMQSourceBuilder<String>();
        RocketMQDeserializationSchema<String> rocketMQDeserializationSchema0 =
                (RocketMQDeserializationSchema<String>)
                        mock(RocketMQDeserializationSchema.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<String> rocketMQSourceBuilder1 =
                rocketMQSourceBuilder0.setDeserializer(rocketMQDeserializationSchema0);
        String string0 = null;
        // Undeclared exception!
        try {
            rocketMQSourceBuilder1.setEndpoints((String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.flink.util.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        RocketMQSourceBuilder<RocketMQSourceBuilder<Object>> rocketMQSourceBuilder0 =
                new RocketMQSourceBuilder<RocketMQSourceBuilder<Object>>();
        rocketMQSourceBuilder0.setDeserializer(
                (RocketMQDeserializationSchema<RocketMQSourceBuilder<Object>>) null);
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder1 = new RocketMQSourceBuilder<Object>();
        RocketMQSourceBuilder<String> rocketMQSourceBuilder2 = new RocketMQSourceBuilder<String>();
        String string0 = null;
        // Undeclared exception!
        try {
            rocketMQSourceBuilder2.setGroupId((String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.flink.util.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        RocketMQSourceBuilder<String> rocketMQSourceBuilder0 = new RocketMQSourceBuilder<String>();
        OffsetsSelector offsetsSelector0 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        rocketMQSourceBuilder0.setUnbounded(offsetsSelector0);
        RocketMQSourceBuilder<String> rocketMQSourceBuilder1 =
                rocketMQSourceBuilder0.setEndpoints(
                        "org.apache.flink.connector.rocketmq.source.RocketMQSourceBuilder");
        // Undeclared exception!
        try {
            rocketMQSourceBuilder1.setTopics((List<String>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.flink.util.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder0 = new RocketMQSourceBuilder<Object>();
        OffsetsSelector offsetsSelector0 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder1 =
                rocketMQSourceBuilder0.setBounded(offsetsSelector0);
        rocketMQSourceBuilder1.build();
        rocketMQSourceBuilder1.setGroupId("");
        RocketMQSourceBuilder<Integer> rocketMQSourceBuilder2 =
                new RocketMQSourceBuilder<Integer>();
        OffsetsSelector offsetsSelector1 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<Integer> rocketMQSourceBuilder3 =
                rocketMQSourceBuilder2.setMinOffsets(offsetsSelector1);
        ConfigOption<RocketMQSourceBuilder<Object>> configOption0 =
                (ConfigOption<RocketMQSourceBuilder<Object>>)
                        mock(ConfigOption.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(configOption0).hasFallbackKeys();
        doReturn((String) null, (String) null).when(configOption0).key();
        // Undeclared exception!
        try {
            rocketMQSourceBuilder3.setConfig(configOption0, rocketMQSourceBuilder0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Key must not be null.
            //
            verifyException("org.apache.flink.configuration.Configuration", e);
        }
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        RocketMQSourceBuilder<RocketMQSourceBuilder<String>> rocketMQSourceBuilder0 =
                new RocketMQSourceBuilder<RocketMQSourceBuilder<String>>();
        OffsetsSelector offsetsSelector0 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<RocketMQSourceBuilder<String>> rocketMQSourceBuilder1 =
                rocketMQSourceBuilder0.setUnbounded(offsetsSelector0);
        // Undeclared exception!
        try {
            rocketMQSourceBuilder1.setTopics((String[]) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.Objects", e);
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder0 = new RocketMQSourceBuilder<Object>();
        DeserializationSchema<Object> deserializationSchema0 =
                (DeserializationSchema<Object>)
                        mock(DeserializationSchema.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder1 =
                rocketMQSourceBuilder0.setBodyOnlyDeserializer(deserializationSchema0);
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder2 =
                rocketMQSourceBuilder1.setGroupId("");
        OffsetsSelector offsetsSelector0 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder3 =
                rocketMQSourceBuilder2.setUnbounded(offsetsSelector0);
        Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
        doReturn((Map) null).when(configuration0).toMap();
        // Undeclared exception!
        try {
            rocketMQSourceBuilder3.setConfig(configuration0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.common.config.RocketMQConfigBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder0 = new RocketMQSourceBuilder<Object>();
        RocketMQDeserializationSchema<Object> rocketMQDeserializationSchema0 =
                (RocketMQDeserializationSchema<Object>)
                        mock(RocketMQDeserializationSchema.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder1 =
                rocketMQSourceBuilder0.setDeserializer(rocketMQDeserializationSchema0);
        OffsetsSelector offsetsSelector0 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder2 =
                rocketMQSourceBuilder1.setBounded(offsetsSelector0);
        rocketMQSourceBuilder1.setGroupId("K");
        // Undeclared exception!
        try {
            rocketMQSourceBuilder2.setGroupId("/z4^l\"-kH|d");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // This option rocketmq.source.group has been set to value K.
            //
            verifyException("org.apache.flink.util.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder0 = new RocketMQSourceBuilder<Object>();
        OffsetsSelector offsetsSelector0 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        rocketMQSourceBuilder0.setBodyOnlyDeserializer((DeserializationSchema<Object>) null);
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder1 =
                rocketMQSourceBuilder0.setMinOffsets(offsetsSelector0);
        String[] stringArray0 = new String[9];
        stringArray0[0] = "";
        stringArray0[1] = "f46\\IbsIa&.((]^4Vr";
        stringArray0[2] = "rocketmq.source.pull.threshold.all";
        stringArray0[3] = "hlPV5?6uu~";
        stringArray0[4] = "H4/UxXUS";
        stringArray0[5] = ",,UG6=O,jLe,";
        stringArray0[6] = "";
        stringArray0[7] = "+NhPyY]O>/Ba4T5";
        stringArray0[8] = "";
        rocketMQSourceBuilder1.setTopics(stringArray0);
        OffsetsSelector offsetsSelector1 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder2 =
                rocketMQSourceBuilder0.setUnbounded(offsetsSelector1);
        rocketMQSourceBuilder2.setEndpoints("<DpXZOWD)qaP32");
        RocketMQSourceBuilder<RocketMQSourceBuilder<String>> rocketMQSourceBuilder3 =
                new RocketMQSourceBuilder<RocketMQSourceBuilder<String>>();
        RocketMQSourceBuilder<RocketMQSourceBuilder<String>> rocketMQSourceBuilder4 =
                rocketMQSourceBuilder3.setEndpoints("");
        DeserializationSchema<RocketMQSourceBuilder<String>> deserializationSchema0 =
                (DeserializationSchema<RocketMQSourceBuilder<String>>)
                        mock(DeserializationSchema.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<RocketMQSourceBuilder<String>> rocketMQSourceBuilder5 =
                rocketMQSourceBuilder4.setBodyOnlyDeserializer(deserializationSchema0);
        Properties properties0 = null;
        // Undeclared exception!
        try {
            rocketMQSourceBuilder5.setProperties((Properties) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.common.config.RocketMQConfigBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder0 = new RocketMQSourceBuilder<Object>();
        rocketMQSourceBuilder0.setGroupId("S*{Cc)&=:qlv'5HJn");
        OffsetsSelector offsetsSelector0 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder1 =
                rocketMQSourceBuilder0.setMinOffsets(offsetsSelector0);
        assertSame(rocketMQSourceBuilder1, rocketMQSourceBuilder0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        RocketMQSourceBuilder<Integer> rocketMQSourceBuilder0 =
                new RocketMQSourceBuilder<Integer>();
        OffsetsSelector offsetsSelector0 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<Integer> rocketMQSourceBuilder1 =
                rocketMQSourceBuilder0.setUnbounded(offsetsSelector0);
        RocketMQSourceBuilder<Integer> rocketMQSourceBuilder2 =
                rocketMQSourceBuilder1.setGroupId("Jgh\"(r");
        RocketMQSourceBuilder<Integer> rocketMQSourceBuilder3 =
                rocketMQSourceBuilder2.setEndpoints("Jgh\"(r");
        RocketMQSourceBuilder<Integer> rocketMQSourceBuilder4 =
                rocketMQSourceBuilder3.setBodyOnlyDeserializer(
                        (DeserializationSchema<Integer>) null);
        RocketMQDeserializationSchema<Integer> rocketMQDeserializationSchema0 =
                (RocketMQDeserializationSchema<Integer>)
                        mock(RocketMQDeserializationSchema.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<Integer> rocketMQSourceBuilder5 =
                rocketMQSourceBuilder4.setDeserializer(rocketMQDeserializationSchema0);
        RocketMQDeserializationSchema<Integer> rocketMQDeserializationSchema1 =
                (RocketMQDeserializationSchema<Integer>)
                        mock(RocketMQDeserializationSchema.class, new ViolatedAssumptionAnswer());
        rocketMQSourceBuilder5.setDeserializer(rocketMQDeserializationSchema1);
        RocketMQSourceBuilder<RocketMQSourceBuilder<Integer>> rocketMQSourceBuilder6 =
                new RocketMQSourceBuilder<RocketMQSourceBuilder<Integer>>();
        RocketMQSourceBuilder<RocketMQSourceBuilder<Integer>> rocketMQSourceBuilder7 =
                rocketMQSourceBuilder6.setGroupId(";");
        OffsetsSelector offsetsSelector1 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<RocketMQSourceBuilder<Integer>> rocketMQSourceBuilder8 =
                rocketMQSourceBuilder7.setMinOffsets(offsetsSelector1);
        OffsetsSelector offsetsSelector2 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<RocketMQSourceBuilder<Integer>> rocketMQSourceBuilder9 =
                rocketMQSourceBuilder8.setUnbounded(offsetsSelector2);
        OffsetsSelector offsetsSelector3 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<RocketMQSourceBuilder<Integer>> rocketMQSourceBuilder10 =
                rocketMQSourceBuilder9.setBounded(offsetsSelector3);
        RocketMQDeserializationSchema<RocketMQSourceBuilder<Integer>>
                rocketMQDeserializationSchema2 =
                        (RocketMQDeserializationSchema<RocketMQSourceBuilder<Integer>>)
                                mock(
                                        RocketMQDeserializationSchema.class,
                                        new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<RocketMQSourceBuilder<Integer>> rocketMQSourceBuilder11 =
                rocketMQSourceBuilder10.setDeserializer(rocketMQDeserializationSchema2);
        OffsetsSelector offsetsSelector4 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        rocketMQSourceBuilder11.setBounded(offsetsSelector4);
        RocketMQSourceBuilder<String> rocketMQSourceBuilder12 = new RocketMQSourceBuilder<String>();
        String[] stringArray0 = new String[2];
        stringArray0[0] = "=RSa.gzq";
        stringArray0[1] = ";";
        RocketMQSourceBuilder<String> rocketMQSourceBuilder13 =
                rocketMQSourceBuilder12.setTopics(stringArray0);
        // Undeclared exception!
        try {
            rocketMQSourceBuilder13.setConfig((Configuration) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.common.config.RocketMQConfigBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder0 = new RocketMQSourceBuilder<Object>();
        RocketMQSourceBuilder<String> rocketMQSourceBuilder1 = new RocketMQSourceBuilder<String>();
        ConfigOption<Object> configOption0 =
                (ConfigOption<Object>) mock(ConfigOption.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(configOption0).hasFallbackKeys();
        doReturn((String) null, (String) null).when(configOption0).key();
        // Undeclared exception!
        try {
            rocketMQSourceBuilder1.setConfig(configOption0, (Object) rocketMQSourceBuilder0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Key must not be null.
            //
            verifyException("org.apache.flink.configuration.Configuration", e);
        }
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        RocketMQSourceBuilder<RocketMQSourceBuilder<String>> rocketMQSourceBuilder0 =
                new RocketMQSourceBuilder<RocketMQSourceBuilder<String>>();
        DeserializationSchema<RocketMQSourceBuilder<String>> deserializationSchema0 =
                (DeserializationSchema<RocketMQSourceBuilder<String>>)
                        mock(DeserializationSchema.class, new ViolatedAssumptionAnswer());
        rocketMQSourceBuilder0.setBodyOnlyDeserializer(deserializationSchema0);
        RocketMQSource<RocketMQSourceBuilder<String>> rocketMQSource0 =
                rocketMQSourceBuilder0.build();
        assertEquals(Boundedness.CONTINUOUS_UNBOUNDED, rocketMQSource0.getBoundedness());
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        RocketMQSourceBuilder<Integer> rocketMQSourceBuilder0 =
                new RocketMQSourceBuilder<Integer>();
        RocketMQSourceBuilder<Integer> rocketMQSourceBuilder1 =
                rocketMQSourceBuilder0.setGroupId("k&ws/Caau('MsIb");
        RocketMQDeserializationSchema<Integer> rocketMQDeserializationSchema0 =
                (RocketMQDeserializationSchema<Integer>)
                        mock(RocketMQDeserializationSchema.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<Integer> rocketMQSourceBuilder2 =
                rocketMQSourceBuilder1.setDeserializer(rocketMQDeserializationSchema0);
        assertSame(rocketMQSourceBuilder0, rocketMQSourceBuilder2);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        RocketMQSourceBuilder<Integer> rocketMQSourceBuilder0 =
                new RocketMQSourceBuilder<Integer>();
        RocketMQSourceBuilder<RocketMQSourceBuilder<Object>> rocketMQSourceBuilder1 =
                new RocketMQSourceBuilder<RocketMQSourceBuilder<Object>>();
        OffsetsSelector offsetsSelector0 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<RocketMQSourceBuilder<Object>> rocketMQSourceBuilder2 =
                rocketMQSourceBuilder1.setBounded(offsetsSelector0);
        assertSame(rocketMQSourceBuilder1, rocketMQSourceBuilder2);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder0 = new RocketMQSourceBuilder<Object>();
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder1 =
                rocketMQSourceBuilder0.setEndpoints("");
        Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
        doReturn((Map) null).when(configuration0).toMap();
        // Undeclared exception!
        try {
            rocketMQSourceBuilder1.setConfig(configuration0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.common.config.RocketMQConfigBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        RocketMQSourceBuilder<RocketMQSourceBuilder<String>> rocketMQSourceBuilder0 =
                new RocketMQSourceBuilder<RocketMQSourceBuilder<String>>();
        String[] stringArray0 = new String[3];
        stringArray0[0] = "!em";
        stringArray0[1] = "z~3?||86fT]:LK+";
        stringArray0[2] = "J0=5'A ";
        RocketMQSourceBuilder<RocketMQSourceBuilder<String>> rocketMQSourceBuilder1 =
                rocketMQSourceBuilder0.setTopics(stringArray0);
        RocketMQSourceBuilder<RocketMQSourceBuilder<String>> rocketMQSourceBuilder2 =
                rocketMQSourceBuilder1.setGroupId("z~3?||86fT]:LK+");
        assertSame(rocketMQSourceBuilder0, rocketMQSourceBuilder2);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder0 = new RocketMQSourceBuilder<Object>();
        ConfigOption<String> configOption0 =
                (ConfigOption<String>) mock(ConfigOption.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(configOption0).hasFallbackKeys();
        doReturn((String) null, (String) null).when(configOption0).key();
        // Undeclared exception!
        try {
            rocketMQSourceBuilder0.setConfig(configOption0, "I_$B");
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Key must not be null.
            //
            verifyException("org.apache.flink.configuration.Configuration", e);
        }
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        OffsetsSelector offsetsSelector0 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        DeserializationSchema<Object> deserializationSchema0 =
                (DeserializationSchema<Object>)
                        mock(DeserializationSchema.class, new ViolatedAssumptionAnswer());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        RocketMQSourceBuilder<String> rocketMQSourceBuilder0 = new RocketMQSourceBuilder<String>();
        // Undeclared exception!
        try {
            rocketMQSourceBuilder0.setProperties((Properties) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.common.config.RocketMQConfigBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        RocketMQSourceBuilder<Object> rocketMQSourceBuilder0 = new RocketMQSourceBuilder<Object>();
        OffsetsSelector offsetsSelector0 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        Iterable<FallbackKey> iterable0 =
                (Iterable<FallbackKey>) mock(Iterable.class, new ViolatedAssumptionAnswer());
        ConfigOption<Object> configOption0 =
                (ConfigOption<Object>) mock(ConfigOption.class, new ViolatedAssumptionAnswer());
        Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
        rocketMQSourceBuilder0.setGroupId("ZBY;yVppM<");
        RocketMQSourceBuilder<RocketMQSourceBuilder<Object>> rocketMQSourceBuilder1 =
                new RocketMQSourceBuilder<RocketMQSourceBuilder<Object>>();
        OffsetsSelector offsetsSelector1 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        DeserializationSchema<RocketMQSourceBuilder<Object>> deserializationSchema0 =
                (DeserializationSchema<RocketMQSourceBuilder<Object>>)
                        mock(DeserializationSchema.class, new ViolatedAssumptionAnswer());
        rocketMQSourceBuilder1.setBodyOnlyDeserializer(deserializationSchema0);
        Configuration configuration1 = mock(Configuration.class, new ViolatedAssumptionAnswer());
        doReturn((Map) null).when(configuration1).toMap();
        // Undeclared exception!
        try {
            rocketMQSourceBuilder0.setConfig(configuration1);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.common.config.RocketMQConfigBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        RocketMQSourceBuilder<RocketMQSourceBuilder<Object>> rocketMQSourceBuilder0 =
                new RocketMQSourceBuilder<RocketMQSourceBuilder<Object>>();
        String[] stringArray0 = new String[4];
        stringArray0[0] = "8)4]'JD!";
        stringArray0[2] = "rocketmq.source.offset.commit.interval";
        stringArray0[3] = "org.apache.flink.configuration.ConfigOptions";
        RocketMQSourceBuilder<RocketMQSourceBuilder<Object>> rocketMQSourceBuilder1 =
                rocketMQSourceBuilder0.setTopics(stringArray0);
        RocketMQSourceBuilder<RocketMQSourceBuilder<Object>> rocketMQSourceBuilder2 =
                rocketMQSourceBuilder1.setEndpoints("org.apache.flink.configuration.ConfigOptions");
        OffsetsSelector offsetsSelector0 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<RocketMQSourceBuilder<Object>> rocketMQSourceBuilder3 =
                rocketMQSourceBuilder2.setUnbounded(offsetsSelector0);
        RocketMQDeserializationSchema<RocketMQSourceBuilder<Object>>
                rocketMQDeserializationSchema0 =
                        (RocketMQDeserializationSchema<RocketMQSourceBuilder<Object>>)
                                mock(
                                        RocketMQDeserializationSchema.class,
                                        new ViolatedAssumptionAnswer());
        OffsetsSelector offsetsSelector1 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        RocketMQSourceBuilder<RocketMQSourceBuilder<Object>> rocketMQSourceBuilder4 =
                rocketMQSourceBuilder3.setGroupId("8)4]'JD!");
        OffsetsSelector offsetsSelector2 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        rocketMQSourceBuilder4.setBounded(offsetsSelector2);
        RocketMQSourceBuilder<RocketMQSourceBuilder<Object>> rocketMQSourceBuilder5 =
                rocketMQSourceBuilder3.setDeserializer(rocketMQDeserializationSchema0);
        OffsetsSelector offsetsSelector3 =
                mock(OffsetsSelector.class, new ViolatedAssumptionAnswer());
        rocketMQSourceBuilder5.setBounded(offsetsSelector3);
        // Undeclared exception!
        try {
            rocketMQSourceBuilder5.setEndpoints("oIx';@Qv@''u@X'xQ");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // This option rocketmq.client.endpoints has been set to value
            // org.apache.flink.configuration.ConfigOptions.
            //
            verifyException("org.apache.flink.util.Preconditions", e);
        }
    }
}
