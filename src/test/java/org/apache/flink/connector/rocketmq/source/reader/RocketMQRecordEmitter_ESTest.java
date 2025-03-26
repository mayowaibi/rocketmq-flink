/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 26 12:27:29 GMT 2025
 */

package org.apache.flink.connector.rocketmq.source.reader;

import org.apache.flink.api.connector.source.SourceOutput;
import org.apache.flink.connector.rocketmq.source.reader.deserializer.RocketMQDeserializationSchema;
import org.apache.flink.connector.rocketmq.source.split.RocketMQSourceSplitState;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

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
public class RocketMQRecordEmitter_ESTest extends RocketMQRecordEmitter_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        RocketMQDeserializationSchema<RocketMQSourceSplitState> rocketMQDeserializationSchema0 =
                (RocketMQDeserializationSchema<RocketMQSourceSplitState>)
                        mock(RocketMQDeserializationSchema.class, new ViolatedAssumptionAnswer());
        RocketMQRecordEmitter<RocketMQSourceSplitState> rocketMQRecordEmitter0 =
                new RocketMQRecordEmitter<RocketMQSourceSplitState>(rocketMQDeserializationSchema0);
        MessageView messageView0 = mock(MessageView.class, new ViolatedAssumptionAnswer());
        doReturn(0L).when(messageView0).getEventTime();
        doReturn(0L).when(messageView0).getQueueOffset();
        SourceOutput<RocketMQSourceSplitState> sourceOutput0 =
                (SourceOutput<RocketMQSourceSplitState>)
                        mock(SourceOutput.class, new ViolatedAssumptionAnswer());
        RocketMQSourceSplitState rocketMQSourceSplitState0 =
                mock(RocketMQSourceSplitState.class, new ViolatedAssumptionAnswer());
        rocketMQRecordEmitter0.emitRecord(messageView0, sourceOutput0, rocketMQSourceSplitState0);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        RocketMQDeserializationSchema<Integer> rocketMQDeserializationSchema0 =
                (RocketMQDeserializationSchema<Integer>)
                        mock(RocketMQDeserializationSchema.class, new ViolatedAssumptionAnswer());
        RocketMQRecordEmitter<Integer> rocketMQRecordEmitter0 =
                new RocketMQRecordEmitter<Integer>(rocketMQDeserializationSchema0);
        MessageView messageView0 = mock(MessageView.class, new ViolatedAssumptionAnswer());
        doReturn(0L).when(messageView0).getEventTime();
        doReturn(0L).when(messageView0).getQueueOffset();
        SourceOutput<Integer> sourceOutput0 =
                (SourceOutput<Integer>) mock(SourceOutput.class, new ViolatedAssumptionAnswer());
        try {
            rocketMQRecordEmitter0.emitRecord(
                    messageView0, sourceOutput0, (RocketMQSourceSplitState) null);
            fail("Expecting exception: IOException");

        } catch (IOException e) {
            //
            // Failed to deserialize message due to
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.source.reader.RocketMQRecordEmitter", e);
        }
    }
}
