/**
 * Scaffolding file used to store all the setups needed to run tests automatically generated by
 * EvoSuite Wed Mar 26 12:12:30 GMT 2025
 */
package org.apache.flink.connector.rocketmq.sink;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.evosuite.runtime.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.evosuite.shaded.org.mockito.Mockito.*;

@EvoSuiteClassExclude
public class RocketMQSinkBuilder_ESTest_scaffolding {

    @org.junit.Rule
    public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr =
            new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

    private static final java.util.Properties defaultProperties =
            (java.util.Properties) java.lang.System.getProperties().clone();

    private org.evosuite.runtime.thread.ThreadStopper threadStopper =
            new org.evosuite.runtime.thread.ThreadStopper(
                    org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);

    @BeforeClass
    public static void initEvoSuiteFramework() {
        org.evosuite.runtime.RuntimeSettings.className =
                "org.apache.flink.connector.rocketmq.sink.RocketMQSinkBuilder";
        org.evosuite.runtime.GuiSupport.initialize();
        org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100;
        org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000;
        org.evosuite.runtime.RuntimeSettings.mockSystemIn = true;
        org.evosuite.runtime.RuntimeSettings.sandboxMode =
                org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED;
        org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT();
        org.evosuite.runtime.classhandling.JDKClassResetter.init();
        setSystemProperties();
        initializeClasses();
        org.evosuite.runtime.Runtime.getInstance().resetRuntime();
        try {
            initMocksToAvoidTimeoutsInTheTests();
        } catch (ClassNotFoundException e) {
        }
    }

    @AfterClass
    public static void clearEvoSuiteFramework() {
        Sandbox.resetDefaultSecurityManager();
        java.lang.System.setProperties((java.util.Properties) defaultProperties.clone());
    }

    @Before
    public void initTestCase() {
        threadStopper.storeCurrentThreads();
        threadStopper.startRecordingTime();
        org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler();
        org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode();
        setSystemProperties();
        org.evosuite.runtime.GuiSupport.setHeadless();
        org.evosuite.runtime.Runtime.getInstance().resetRuntime();
        org.evosuite.runtime.agent.InstrumentingAgent.activate();
    }

    @After
    public void doneWithTestCase() {
        threadStopper.killAndJoinClientThreads();
        org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks();
        org.evosuite.runtime.classhandling.JDKClassResetter.reset();
        resetClasses();
        org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode();
        org.evosuite.runtime.agent.InstrumentingAgent.deactivate();
        org.evosuite.runtime.GuiSupport.restoreHeadlessMode();
    }

    public static void setSystemProperties() {

        java.lang.System.setProperties((java.util.Properties) defaultProperties.clone());
        java.lang.System.setProperty("file.encoding", "UTF-8");
        java.lang.System.setProperty("java.awt.headless", "true");
        java.lang.System.setProperty(
                "java.io.tmpdir", "/var/folders/t3/x2jshcps4n99vnsnf_qb26qm0000gn/T/");
        java.lang.System.setProperty("user.country", "GB");
        java.lang.System.setProperty("user.dir", "/Users/isaac/IdeaProjects/rocketmq-flink");
        java.lang.System.setProperty("user.home", "/Users/isaac");
        java.lang.System.setProperty("user.language", "en");
        java.lang.System.setProperty("user.name", "isaac");
        java.lang.System.setProperty("user.timezone", "America/Toronto");
    }

    private static void initializeClasses() {
        org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(
                RocketMQSinkBuilder_ESTest_scaffolding.class.getClassLoader(),
                "org.apache.flink.configuration.ConfigOptions",
                "org.apache.rocketmq.common.message.Message",
                "org.apache.rocketmq.remoting.protocol.LanguageCode",
                "org.apache.flink.connector.rocketmq.sink.RocketMQSink",
                "org.apache.flink.shaded.guava30.com.google.common.collect.PeekingIterator",
                "org.apache.flink.shaded.guava30.com.google.common.base.Preconditions",
                "org.apache.flink.connector.rocketmq.sink.RocketMQSinkBuilder",
                "org.apache.flink.configuration.WritableConfig",
                "org.apache.flink.connector.rocketmq.common.config.RocketMQConfigBuilder",
                "org.apache.flink.api.connector.sink2.SinkWriter",
                "org.apache.flink.api.connector.sink2.TwoPhaseCommittingSink$PrecommittingSinkWriter",
                "org.apache.flink.connector.rocketmq.sink.writer.context.RocketMQSinkContext",
                "org.apache.commons.lang3.ClassUtils",
                "org.apache.flink.util.InstantiationUtil",
                "org.apache.flink.shaded.guava30.com.google.common.collect.RegularImmutableList",
                "org.apache.flink.api.common.InvalidProgramException",
                "org.apache.flink.configuration.description.TextElement",
                "org.apache.flink.core.io.Versioned",
                "org.apache.flink.configuration.description.Description",
                "org.apache.rocketmq.client.producer.MessageQueueSelector",
                "org.apache.flink.connector.rocketmq.sink.writer.serializer.RocketMQSerializationSchema",
                "org.apache.flink.configuration.FallbackKey",
                "org.apache.flink.connector.rocketmq.common.config.RocketMQConfigValidator",
                "org.apache.flink.shaded.guava30.com.google.common.collect.ImmutableSet",
                "org.apache.flink.shaded.guava30.com.google.common.collect.SingletonImmutableList",
                "org.apache.flink.shaded.guava30.com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
                "org.apache.flink.configuration.DescribedEnum",
                "org.apache.flink.api.connector.sink2.TwoPhaseCommittingSink",
                "org.apache.flink.configuration.ConfigOptions$TypedConfigOptionBuilder",
                "org.apache.flink.shaded.guava30.com.google.common.collect.UnmodifiableIterator",
                "org.apache.flink.configuration.description.TextElement$TextStyle",
                "org.apache.flink.shaded.guava30.com.google.common.collect.UnmodifiableListIterator",
                "org.apache.flink.shaded.guava30.com.google.common.collect.ImmutableList$1",
                "org.apache.flink.api.connector.sink2.Committer",
                "org.apache.flink.util.Preconditions",
                "org.apache.flink.shaded.guava30.com.google.common.collect.ImmutableList$ReverseImmutableList",
                "org.apache.flink.core.io.IOReadableWritable",
                "org.apache.flink.shaded.guava30.com.google.common.base.Java8Usage",
                "org.apache.flink.shaded.guava30.com.google.common.collect.ImmutableCollection",
                "org.apache.flink.core.io.SimpleVersionedSerializer",
                "org.apache.flink.shaded.guava30.com.google.common.collect.Iterators$ArrayItr",
                "org.apache.flink.connector.rocketmq.common.config.RocketMQOptions",
                "org.apache.flink.configuration.description.BlockElement",
                "org.apache.flink.connector.base.DeliveryGuarantee",
                "org.apache.flink.util.FlinkException",
                "org.apache.flink.util.InstantiationUtil$FailureTolerantObjectInputStream",
                "org.apache.flink.connector.rocketmq.sink.RocketMQSinkOptions",
                "org.apache.flink.configuration.description.DescriptionElement",
                "org.apache.flink.shaded.guava30.com.google.common.collect.ImmutableList$SubList",
                "org.apache.flink.api.connector.sink2.Sink",
                "org.apache.rocketmq.common.message.MessageQueue",
                "org.apache.flink.shaded.guava30.com.google.common.collect.RegularImmutableAsList",
                "org.apache.flink.shaded.guava30.com.google.common.collect.Iterators$5",
                "org.apache.flink.core.memory.DataOutputView",
                "org.apache.flink.shaded.guava30.com.google.common.collect.Iterators$4",
                "org.apache.flink.connector.rocketmq.common.config.RocketMQConfigValidator$RocketMQConfigValidatorBuilder",
                "org.apache.flink.shaded.guava30.com.google.common.collect.Iterators$9",
                "org.apache.flink.shaded.guava30.com.google.common.collect.AbstractIterator",
                "org.apache.flink.configuration.UnmodifiableConfiguration",
                "org.apache.flink.util.InstantiationUtil$ClassLoaderObjectInputStream",
                "org.apache.flink.shaded.guava30.com.google.common.collect.ImmutableAsList",
                "org.apache.flink.configuration.ReadableConfig",
                "org.apache.flink.configuration.description.InlineElement",
                "org.apache.flink.shaded.asm9.org.objectweb.asm.ClassVisitor",
                "org.apache.flink.shaded.guava30.com.google.common.collect.Iterators$1",
                "org.apache.flink.configuration.description.Description$DescriptionBuilder",
                "org.apache.flink.shaded.guava30.com.google.common.collect.ObjectArrays",
                "org.apache.flink.connector.rocketmq.legacy.common.selector.MessageQueueSelector",
                "org.apache.flink.configuration.ConfigOptions$OptionBuilder",
                "org.apache.flink.configuration.ConfigOption",
                "org.apache.flink.core.memory.DataInputView",
                "org.apache.flink.shaded.guava30.com.google.common.collect.Iterators$10",
                "org.apache.flink.api.java.This0AccessFinder",
                "org.apache.flink.shaded.guava30.com.google.common.collect.Iterators$MergingIterator",
                "org.apache.flink.configuration.Configuration",
                "org.apache.flink.shaded.guava30.com.google.common.collect.AbstractIndexedListIterator",
                "org.apache.flink.shaded.guava30.com.google.common.collect.RegularImmutableSet",
                "org.apache.flink.shaded.guava30.com.google.common.collect.Iterators",
                "org.apache.flink.api.common.serialization.SerializationSchema$InitializationContext",
                "org.apache.flink.configuration.ConfigurationUtils",
                "org.apache.flink.shaded.guava30.com.google.common.collect.ImmutableList",
                "org.apache.flink.api.common.ExecutionConfig$GlobalJobParameters",
                "org.apache.flink.shaded.guava30.com.google.common.collect.ImmutableSet$SetBuilderImpl",
                "org.apache.flink.shaded.guava30.com.google.common.collect.SingletonImmutableSet",
                "org.apache.flink.api.java.ClosureCleaner",
                "org.apache.rocketmq.client.AccessChannel",
                "org.apache.flink.api.common.ExecutionConfig$ClosureCleanerLevel",
                "org.apache.flink.api.connector.sink2.Sink$InitContext");
    }

    private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException {
        mock(
                Class.forName(
                        "org.apache.flink.configuration.ConfigOption",
                        false,
                        RocketMQSinkBuilder_ESTest_scaffolding.class.getClassLoader()));
        mock(
                Class.forName(
                        "org.apache.flink.configuration.Configuration",
                        false,
                        RocketMQSinkBuilder_ESTest_scaffolding.class.getClassLoader()));
        mock(
                Class.forName(
                        "org.apache.flink.connector.rocketmq.legacy.common.selector.MessageQueueSelector",
                        false,
                        RocketMQSinkBuilder_ESTest_scaffolding.class.getClassLoader()));
        mock(
                Class.forName(
                        "org.apache.flink.connector.rocketmq.sink.writer.serializer.RocketMQSerializationSchema",
                        false,
                        RocketMQSinkBuilder_ESTest_scaffolding.class.getClassLoader()));
    }

    private static void resetClasses() {
        org.evosuite.runtime.classhandling.ClassResetter.getInstance()
                .setClassLoader(RocketMQSinkBuilder_ESTest_scaffolding.class.getClassLoader());

        org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
                "org.apache.flink.connector.rocketmq.common.config.RocketMQConfigValidator",
                "org.apache.flink.connector.rocketmq.common.config.RocketMQConfigValidator$RocketMQConfigValidatorBuilder",
                "org.apache.flink.shaded.guava30.com.google.common.collect.ImmutableCollection",
                "org.apache.flink.shaded.guava30.com.google.common.collect.ImmutableList",
                "org.apache.flink.shaded.guava30.com.google.common.collect.ObjectArrays",
                "org.apache.flink.shaded.guava30.com.google.common.collect.RegularImmutableList",
                "org.apache.flink.shaded.guava30.com.google.common.collect.ImmutableSet",
                "org.apache.flink.shaded.guava30.com.google.common.collect.RegularImmutableSet",
                "org.apache.flink.connector.rocketmq.sink.RocketMQSinkBuilder",
                "org.apache.flink.configuration.description.TextElement",
                "org.apache.flink.configuration.description.TextElement$TextStyle",
                "org.apache.flink.connector.base.DeliveryGuarantee",
                "org.apache.flink.configuration.ConfigOptions",
                "org.apache.flink.util.Preconditions",
                "org.apache.flink.configuration.ConfigOptions$OptionBuilder",
                "org.apache.flink.configuration.ConfigOptions$TypedConfigOptionBuilder",
                "org.apache.flink.configuration.description.Description",
                "org.apache.flink.configuration.description.Description$DescriptionBuilder",
                "org.apache.flink.configuration.ConfigOption",
                "org.apache.rocketmq.client.AccessChannel",
                "org.apache.rocketmq.remoting.protocol.LanguageCode",
                "org.apache.flink.connector.rocketmq.common.config.RocketMQOptions",
                "org.apache.flink.connector.rocketmq.sink.RocketMQSinkOptions",
                "org.apache.flink.api.common.ExecutionConfig$ClosureCleanerLevel",
                "org.apache.commons.lang3.ClassUtils",
                "org.apache.flink.api.java.ClosureCleaner",
                "org.apache.flink.util.InstantiationUtil",
                "org.apache.flink.connector.rocketmq.common.config.RocketMQConfigBuilder",
                "org.apache.flink.api.common.ExecutionConfig$GlobalJobParameters",
                "org.apache.flink.configuration.Configuration",
                "org.apache.flink.configuration.ConfigurationUtils",
                "org.apache.flink.connector.rocketmq.sink.RocketMQSink",
                "org.apache.flink.shaded.guava30.com.google.common.collect.Iterators",
                "org.apache.flink.shaded.guava30.com.google.common.base.Java8Usage",
                "org.apache.flink.shaded.guava30.com.google.common.base.Preconditions",
                "org.apache.flink.shaded.guava30.com.google.common.collect.UnmodifiableIterator",
                "org.apache.flink.shaded.guava30.com.google.common.collect.UnmodifiableListIterator",
                "org.apache.flink.shaded.guava30.com.google.common.collect.AbstractIndexedListIterator",
                "org.apache.flink.shaded.guava30.com.google.common.collect.Iterators$ArrayItr",
                "org.apache.flink.configuration.UnmodifiableConfiguration");
    }
}
