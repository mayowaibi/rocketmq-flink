/**
 * Scaffolding file used to store all the setups needed to run tests automatically generated by
 * EvoSuite Wed Mar 26 11:44:31 GMT 2025
 */
package org.apache.flink.connector.rocketmq.source.enumerator.offset;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.evosuite.runtime.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.evosuite.shaded.org.mockito.Mockito.*;

@EvoSuiteClassExclude
public class OffsetsSelectorByStrategy_ESTest_scaffolding {

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
                "org.apache.flink.connector.rocketmq.source.enumerator.offset.OffsetsSelectorByStrategy";
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
                OffsetsSelectorByStrategy_ESTest_scaffolding.class.getClassLoader(),
                "org.apache.flink.connector.rocketmq.source.enumerator.offset.OffsetsValidator",
                "org.apache.flink.connector.rocketmq.source.InnerConsumerImpl$RemotingOffsetsRetrieverImpl",
                "org.apache.flink.connector.rocketmq.source.enumerator.offset.OffsetsSelectorByStrategy",
                "org.apache.flink.connector.rocketmq.source.enumerator.offset.OffsetsSelector$MessageQueueOffsetsRetriever",
                "org.apache.flink.connector.rocketmq.source.enumerator.offset.OffsetsSelectorByStrategy$1",
                "org.apache.flink.connector.rocketmq.source.InnerConsumerImpl",
                "org.apache.rocketmq.common.message.MessageQueue",
                "org.apache.rocketmq.common.consumer.ConsumeFromWhere",
                "org.apache.flink.connector.rocketmq.legacy.common.config.OffsetResetStrategy",
                "org.apache.flink.connector.rocketmq.source.InnerConsumer",
                "org.apache.flink.connector.rocketmq.source.reader.MessageView",
                "org.apache.flink.connector.rocketmq.source.enumerator.offset.OffsetsSelector");
    }

    private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException {
        mock(
                Class.forName(
                        "java.util.concurrent.CompletableFuture",
                        false,
                        OffsetsSelectorByStrategy_ESTest_scaffolding.class.getClassLoader()));
        mock(
                Class.forName(
                        "org.apache.flink.connector.rocketmq.source.InnerConsumer",
                        false,
                        OffsetsSelectorByStrategy_ESTest_scaffolding.class.getClassLoader()));
    }

    private static void resetClasses() {
        org.evosuite.runtime.classhandling.ClassResetter.getInstance()
                .setClassLoader(
                        OffsetsSelectorByStrategy_ESTest_scaffolding.class.getClassLoader());

        org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
                "org.apache.flink.connector.rocketmq.source.enumerator.offset.OffsetsSelectorByStrategy",
                "org.apache.rocketmq.common.consumer.ConsumeFromWhere",
                "org.apache.flink.connector.rocketmq.source.enumerator.offset.OffsetsSelectorByStrategy$1",
                "org.apache.flink.connector.rocketmq.source.InnerConsumerImpl$RemotingOffsetsRetrieverImpl",
                "org.apache.flink.connector.rocketmq.source.enumerator.offset.OffsetsSelectorBySpecified",
                "org.apache.rocketmq.common.message.MessageQueue",
                "org.apache.flink.connector.rocketmq.source.enumerator.offset.OffsetsSelectorByTimestamp",
                "org.apache.flink.connector.rocketmq.source.InnerConsumerImpl");
    }
}
