/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 26 12:39:15 GMT 2025
 */

package org.apache.flink.connector.rocketmq.legacy;

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
public class RunningChecker_ESTest extends RunningChecker_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        RunningChecker runningChecker0 = new RunningChecker();
        assertFalse(runningChecker0.isRunning());

        runningChecker0.setRunning(true);
        boolean boolean0 = runningChecker0.isRunning();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        RunningChecker runningChecker0 = new RunningChecker();
        boolean boolean0 = runningChecker0.isRunning();
        assertFalse(boolean0);
    }
}
