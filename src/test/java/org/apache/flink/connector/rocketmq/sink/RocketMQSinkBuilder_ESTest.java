/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 26 12:12:30 GMT 2025
 */

package org.apache.flink.connector.rocketmq.sink;

import org.apache.flink.configuration.ConfigOption;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.connector.base.DeliveryGuarantee;
import org.apache.flink.connector.rocketmq.legacy.common.selector.MessageQueueSelector;
import org.apache.flink.connector.rocketmq.sink.writer.serializer.RocketMQSerializationSchema;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;

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
public class RocketMQSinkBuilder_ESTest extends RocketMQSinkBuilder_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        RocketMQSinkBuilder<String> rocketMQSinkBuilder0 = new RocketMQSinkBuilder<String>();
        ConfigOption<Integer> configOption0 =
                (ConfigOption<Integer>) mock(ConfigOption.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(configOption0).hasFallbackKeys();
        doReturn("/tA::&A@rMC", "/tA::&A@rMC").when(configOption0).key();
        Integer integer0 = new Integer((-3457));
        RocketMQSinkBuilder<String> rocketMQSinkBuilder1 =
                rocketMQSinkBuilder0.setConfig(configOption0, integer0);
        assertSame(rocketMQSinkBuilder0, rocketMQSinkBuilder1);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        RocketMQSinkBuilder<RocketMQSinkBuilder<String>> rocketMQSinkBuilder0 =
                new RocketMQSinkBuilder<RocketMQSinkBuilder<String>>();
        // Undeclared exception!
        try {
            rocketMQSinkBuilder0.setSerializer(
                    (RocketMQSerializationSchema<RocketMQSinkBuilder<String>>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // serializer is null
            //
            verifyException("org.apache.flink.util.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        RocketMQSinkBuilder<Object> rocketMQSinkBuilder0 = new RocketMQSinkBuilder<Object>();
        // Undeclared exception!
        try {
            rocketMQSinkBuilder0.setGroupId((String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.flink.util.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        RocketMQSinkBuilder<Object> rocketMQSinkBuilder0 = new RocketMQSinkBuilder<Object>();
        rocketMQSinkBuilder0.setGroupId("serializer is null");
        // Undeclared exception!
        try {
            rocketMQSinkBuilder0.setGroupId("+zH>rQZ4:r[");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // This option rocketmq.sink.group has been set to value serializer is null.
            //
            verifyException("org.apache.flink.util.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        RocketMQSinkBuilder<Integer> rocketMQSinkBuilder0 = new RocketMQSinkBuilder<Integer>();
        // Undeclared exception!
        try {
            rocketMQSinkBuilder0.setEndpoints((String) null);
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
        RocketMQSinkBuilder<RocketMQSinkBuilder<Integer>> rocketMQSinkBuilder0 =
                new RocketMQSinkBuilder<RocketMQSinkBuilder<Integer>>();
        rocketMQSinkBuilder0.setEndpoints("?TG");
        // Undeclared exception!
        try {
            rocketMQSinkBuilder0.setEndpoints("serializer is null");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // This option rocketmq.client.endpoints has been set to value ?TG.
            //
            verifyException("org.apache.flink.util.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        RocketMQSinkBuilder<Object> rocketMQSinkBuilder0 = new RocketMQSinkBuilder<Object>();
        // Undeclared exception!
        try {
            rocketMQSinkBuilder0.setDeliveryGuarantee((DeliveryGuarantee) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // delivery guarantee is null
            //
            verifyException("org.apache.flink.util.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        RocketMQSinkBuilder<Object> rocketMQSinkBuilder0 = new RocketMQSinkBuilder<Object>();
        DeliveryGuarantee deliveryGuarantee0 = DeliveryGuarantee.AT_LEAST_ONCE;
        RocketMQSinkBuilder<Object> rocketMQSinkBuilder1 =
                rocketMQSinkBuilder0.setDeliveryGuarantee(deliveryGuarantee0);
        DeliveryGuarantee deliveryGuarantee1 = DeliveryGuarantee.EXACTLY_ONCE;
        // Undeclared exception!
        try {
            rocketMQSinkBuilder1.setDeliveryGuarantee(deliveryGuarantee1);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // This option rocketmq.sink.delivery.guarantee has been set to value AT_LEAST_ONCE.
            //
            verifyException("org.apache.flink.util.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        RocketMQSerializationSchema<String> rocketMQSerializationSchema0 =
                (RocketMQSerializationSchema<String>)
                        mock(RocketMQSerializationSchema.class, new ViolatedAssumptionAnswer());
        RocketMQSinkBuilder<String> rocketMQSinkBuilder0 = new RocketMQSinkBuilder<String>();
        MessageQueueSelector messageQueueSelector0 =
                mock(MessageQueueSelector.class, new ViolatedAssumptionAnswer());
        rocketMQSinkBuilder0.setMessageQueueSelector(messageQueueSelector0);
        RocketMQSinkBuilder<Object> rocketMQSinkBuilder1 = new RocketMQSinkBuilder<Object>();
        Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
        doReturn((Map) null).when(configuration0).toMap();
        // Undeclared exception!
        try {
            rocketMQSinkBuilder1.setConfig(configuration0);
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
    public void test09() throws Throwable {
        RocketMQSinkBuilder<Object> rocketMQSinkBuilder0 = new RocketMQSinkBuilder<Object>();
        ConfigOption<Integer> configOption0 =
                (ConfigOption<Integer>) mock(ConfigOption.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(configOption0).hasFallbackKeys();
        doReturn((String) null, (String) null).when(configOption0).key();
        Integer integer0 = new Integer(0);
        // Undeclared exception!
        try {
            rocketMQSinkBuilder0.setConfig(configOption0, integer0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Key must not be null.
            //
            verifyException("org.apache.flink.configuration.Configuration", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        RocketMQSinkBuilder<Object> rocketMQSinkBuilder0 = new RocketMQSinkBuilder<Object>();
        // Undeclared exception!
        try {
            rocketMQSinkBuilder0.setProperties((Properties) null);
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
    public void test11() throws Throwable {
        RocketMQSinkBuilder<RocketMQSinkBuilder<Integer>> rocketMQSinkBuilder0 =
                new RocketMQSinkBuilder<RocketMQSinkBuilder<Integer>>();
        RocketMQSink<RocketMQSinkBuilder<Integer>> rocketMQSink0 = rocketMQSinkBuilder0.build();
        assertNotNull(rocketMQSink0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        RocketMQSinkBuilder<Object> rocketMQSinkBuilder0 = new RocketMQSinkBuilder<Object>();
        RocketMQSerializationSchema<Object> rocketMQSerializationSchema0 =
                (RocketMQSerializationSchema<Object>)
                        mock(RocketMQSerializationSchema.class, new ViolatedAssumptionAnswer());
        RocketMQSinkBuilder<Object> rocketMQSinkBuilder1 =
                rocketMQSinkBuilder0.setSerializer(rocketMQSerializationSchema0);
        assertSame(rocketMQSinkBuilder1, rocketMQSinkBuilder0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        RocketMQSinkBuilder<Object> rocketMQSinkBuilder0 = new RocketMQSinkBuilder<Object>();
        // Undeclared exception!
        try {
            rocketMQSinkBuilder0.setMessageQueueSelector((MessageQueueSelector) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // message queue selector is null
            //
            verifyException("org.apache.flink.util.Preconditions", e);
        }
    }
}
