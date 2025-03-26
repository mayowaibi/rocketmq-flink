/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 26 10:50:45 GMT 2025
 */

package org.apache.flink.connector.rocketmq.legacy.common.serialization;

import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.configuration.DelegatingConfiguration;
import org.apache.flink.connector.rocketmq.source.reader.deserializer.DirtyDataStrategy;
import org.apache.flink.table.api.TableSchema;
import org.apache.flink.table.data.BoxedWrapperRowData;
import org.apache.flink.table.data.GenericRowData;
import org.apache.flink.table.data.RowData;
import org.apache.flink.table.types.DataType;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.Array;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;

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
public class RowKeyValueDeserializationSchema_ESTest
        extends RowKeyValueDeserializationSchema_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        String[] stringArray0 = new String[0];
        DataType[] dataTypeArray0 = new DataType[8];
        TableSchema tableSchema0 = mock(TableSchema.class, new ViolatedAssumptionAnswer());
        doReturn(dataTypeArray0).when(tableSchema0).getFieldDataTypes();
        doReturn(stringArray0).when(tableSchema0).getFieldNames();
        DirtyDataStrategy dirtyDataStrategy0 = DirtyDataStrategy.CUT;
        Configuration configuration0 = new Configuration();
        DelegatingConfiguration delegatingConfiguration0 =
                new DelegatingConfiguration(configuration0, "SGRQ)|");
        Map<String, String> map0 = delegatingConfiguration0.toMap();
        RowKeyValueDeserializationSchema rowKeyValueDeserializationSchema0 =
                new RowKeyValueDeserializationSchema(
                        tableSchema0,
                        dirtyDataStrategy0,
                        dirtyDataStrategy0,
                        dirtyDataStrategy0,
                        "SGRQ)|",
                        "",
                        false,
                        map0);
        byte[] byteArray0 = new byte[8];
        byte[] byteArray1 = new byte[5];
        // Undeclared exception!
        try {
            rowKeyValueDeserializationSchema0.deserializeKeyAndValue(byteArray1, byteArray0);
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // java.io.UnsupportedEncodingException: SGRQ)|
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.legacy.common.serialization.RowKeyValueDeserializationSchema",
                    e);
        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        RowKeyValueDeserializationSchema.Builder rowKeyValueDeserializationSchema_Builder0 =
                new RowKeyValueDeserializationSchema.Builder();
        RowKeyValueDeserializationSchema.Builder rowKeyValueDeserializationSchema_Builder1 =
                rowKeyValueDeserializationSchema_Builder0.setFieldDelimiter("ALL");
        assertSame(
                rowKeyValueDeserializationSchema_Builder1,
                rowKeyValueDeserializationSchema_Builder0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        RowKeyValueDeserializationSchema.Builder rowKeyValueDeserializationSchema_Builder0 =
                new RowKeyValueDeserializationSchema.Builder();
        RowKeyValueDeserializationSchema.Builder rowKeyValueDeserializationSchema_Builder1 =
                rowKeyValueDeserializationSchema_Builder0.setEncoding("v2LcIgq@");
        assertSame(
                rowKeyValueDeserializationSchema_Builder1,
                rowKeyValueDeserializationSchema_Builder0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        RowKeyValueDeserializationSchema.Builder rowKeyValueDeserializationSchema_Builder0 =
                new RowKeyValueDeserializationSchema.Builder();
        RowKeyValueDeserializationSchema.Builder rowKeyValueDeserializationSchema_Builder1 =
                rowKeyValueDeserializationSchema_Builder0.setColumnErrorDebug(false);
        assertSame(
                rowKeyValueDeserializationSchema_Builder0,
                rowKeyValueDeserializationSchema_Builder1);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        String[] stringArray0 = new String[2];
        TypeInformation<GenericRowData>[] typeInformationArray0 =
                (TypeInformation<GenericRowData>[]) Array.newInstance(TypeInformation.class, 9);
        Class<GenericRowData> class0 = GenericRowData.class;
        TypeInformation<GenericRowData> typeInformation0 = TypeInformation.of(class0);
        typeInformationArray0[0] = typeInformation0;
        typeInformationArray0[1] = typeInformationArray0[0];
        TableSchema tableSchema0 = mock(TableSchema.class, new ViolatedAssumptionAnswer());
        doReturn((Object) stringArray0, (Object) stringArray0, (Object) null)
                .when(tableSchema0)
                .getFieldNames();
        DirtyDataStrategy dirtyDataStrategy0 = DirtyDataStrategy.PAD;
        HashMap<String, String> hashMap0 = new HashMap<String, String>();
        RowKeyValueDeserializationSchema rowKeyValueDeserializationSchema0 = null;
        try {
            rowKeyValueDeserializationSchema0 =
                    new RowKeyValueDeserializationSchema(
                            tableSchema0,
                            dirtyDataStrategy0,
                            dirtyDataStrategy0,
                            dirtyDataStrategy0,
                            (String) null,
                            "ux=dl9f%l%86kF7",
                            false,
                            hashMap0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.legacy.common.serialization.RowKeyValueDeserializationSchema",
                    e);
        }
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        TableSchema tableSchema0 = mock(TableSchema.class, new ViolatedAssumptionAnswer());
        DirtyDataStrategy dirtyDataStrategy0 = DirtyDataStrategy.PAD;
        String string0 = "$^\\u(:v0\\ G=7$g,h";
        Map<String, String> map0 = ZoneId.SHORT_IDS;
        RowKeyValueDeserializationSchema rowKeyValueDeserializationSchema0 = null;
        try {
            rowKeyValueDeserializationSchema0 =
                    new RowKeyValueDeserializationSchema(
                            tableSchema0,
                            dirtyDataStrategy0,
                            dirtyDataStrategy0,
                            dirtyDataStrategy0,
                            "/:VXFB@-.",
                            string0,
                            true,
                            map0);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Unable to parse unicode value: (:v0
            //
            verifyException("org.apache.commons.lang3.text.translate.UnicodeUnescaper", e);
        }
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        String[] stringArray0 = new String[4];
        TypeInformation<BoxedWrapperRowData>[] typeInformationArray0 =
                (TypeInformation<BoxedWrapperRowData>[])
                        Array.newInstance(TypeInformation.class, 0);
        TableSchema tableSchema0 = mock(TableSchema.class, new ViolatedAssumptionAnswer());
        doReturn(
                        (Object) stringArray0,
                        (Object) stringArray0,
                        (Object) stringArray0,
                        (Object) stringArray0,
                        (Object) stringArray0)
                .when(tableSchema0)
                .getFieldNames();
        doReturn((TypeInformation[]) null).when(tableSchema0).getFieldTypes();
        DirtyDataStrategy dirtyDataStrategy0 = DirtyDataStrategy.NULL;
        HashMap<String, String> hashMap0 = new HashMap<String, String>();
        RowKeyValueDeserializationSchema rowKeyValueDeserializationSchema0 = null;
        try {
            rowKeyValueDeserializationSchema0 =
                    new RowKeyValueDeserializationSchema(
                            tableSchema0,
                            dirtyDataStrategy0,
                            dirtyDataStrategy0,
                            dirtyDataStrategy0,
                            (String) null,
                            (String) null,
                            true,
                            hashMap0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.legacy.common.serialization.RowKeyValueDeserializationSchema",
                    e);
        }
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        RowKeyValueDeserializationSchema.Builder rowKeyValueDeserializationSchema_Builder0 =
                new RowKeyValueDeserializationSchema.Builder();
        RowKeyValueDeserializationSchema.Builder rowKeyValueDeserializationSchema_Builder1 =
                rowKeyValueDeserializationSchema_Builder0.setProperties((Map<String, String>) null);
        assertSame(
                rowKeyValueDeserializationSchema_Builder0,
                rowKeyValueDeserializationSchema_Builder1);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        String[] stringArray0 = new String[0];
        DataType[] dataTypeArray0 = new DataType[8];
        TableSchema tableSchema0 = mock(TableSchema.class, new ViolatedAssumptionAnswer());
        doReturn(dataTypeArray0).when(tableSchema0).getFieldDataTypes();
        doReturn(stringArray0).when(tableSchema0).getFieldNames();
        DirtyDataStrategy dirtyDataStrategy0 = DirtyDataStrategy.PAD;
        DelegatingConfiguration delegatingConfiguration0 = new DelegatingConfiguration();
        Map<String, String> map0 = delegatingConfiguration0.toMap();
        RowKeyValueDeserializationSchema rowKeyValueDeserializationSchema0 =
                new RowKeyValueDeserializationSchema(
                        tableSchema0,
                        dirtyDataStrategy0,
                        dirtyDataStrategy0,
                        dirtyDataStrategy0,
                        "Source type must not be null.",
                        "Source type must not be null.",
                        false,
                        map0);
        RowData rowData0 =
                rowKeyValueDeserializationSchema0.deserializeKeyAndValue(
                        (byte[]) null, (byte[]) null);
        assertNull(rowData0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        String[] stringArray0 = new String[2];
        TypeInformation<GenericRowData>[] typeInformationArray0 =
                (TypeInformation<GenericRowData>[]) Array.newInstance(TypeInformation.class, 9);
        TableSchema tableSchema0 = mock(TableSchema.class, new ViolatedAssumptionAnswer());
        doReturn((Object) stringArray0, (Object) stringArray0, (Object) stringArray0)
                .when(tableSchema0)
                .getFieldNames();
        doReturn(typeInformationArray0).when(tableSchema0).getFieldTypes();
        DirtyDataStrategy dirtyDataStrategy0 = DirtyDataStrategy.PAD;
        HashMap<String, String> hashMap0 = new HashMap<String, String>();
        RowKeyValueDeserializationSchema rowKeyValueDeserializationSchema0 = null;
        try {
            rowKeyValueDeserializationSchema0 =
                    new RowKeyValueDeserializationSchema(
                            tableSchema0,
                            dirtyDataStrategy0,
                            dirtyDataStrategy0,
                            dirtyDataStrategy0,
                            (String) null,
                            "ux=dl9f%l%86kF7",
                            false,
                            hashMap0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.legacy.common.serialization.RowKeyValueDeserializationSchema",
                    e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        RowKeyValueDeserializationSchema.Builder rowKeyValueDeserializationSchema_Builder0 =
                new RowKeyValueDeserializationSchema.Builder();
        // Undeclared exception!
        try {
            rowKeyValueDeserializationSchema_Builder0.build();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.legacy.common.serialization.RowKeyValueDeserializationSchema",
                    e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        RowKeyValueDeserializationSchema.Builder rowKeyValueDeserializationSchema_Builder0 =
                new RowKeyValueDeserializationSchema.Builder();
        DirtyDataStrategy dirtyDataStrategy0 = DirtyDataStrategy.SKIP;
        RowKeyValueDeserializationSchema.Builder rowKeyValueDeserializationSchema_Builder1 =
                rowKeyValueDeserializationSchema_Builder0.setFieldIncrementStrategy(
                        dirtyDataStrategy0);
        assertSame(
                rowKeyValueDeserializationSchema_Builder1,
                rowKeyValueDeserializationSchema_Builder0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        RowKeyValueDeserializationSchema.Builder rowKeyValueDeserializationSchema_Builder0 =
                new RowKeyValueDeserializationSchema.Builder();
        DirtyDataStrategy dirtyDataStrategy0 = DirtyDataStrategy.SKIP_SILENT;
        RowKeyValueDeserializationSchema.Builder rowKeyValueDeserializationSchema_Builder1 =
                rowKeyValueDeserializationSchema_Builder0.setFormatErrorStrategy(
                        dirtyDataStrategy0);
        assertSame(
                rowKeyValueDeserializationSchema_Builder1,
                rowKeyValueDeserializationSchema_Builder0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        RowKeyValueDeserializationSchema.Builder rowKeyValueDeserializationSchema_Builder0 =
                new RowKeyValueDeserializationSchema.Builder();
        Map<String, String> map0 = ZoneId.SHORT_IDS;
        RowKeyValueDeserializationSchema.Builder rowKeyValueDeserializationSchema_Builder1 =
                rowKeyValueDeserializationSchema_Builder0.setProperties(map0);
        assertSame(
                rowKeyValueDeserializationSchema_Builder1,
                rowKeyValueDeserializationSchema_Builder0);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        RowKeyValueDeserializationSchema.Builder rowKeyValueDeserializationSchema_Builder0 =
                new RowKeyValueDeserializationSchema.Builder();
        DirtyDataStrategy dirtyDataStrategy0 = DirtyDataStrategy.SKIP;
        RowKeyValueDeserializationSchema.Builder rowKeyValueDeserializationSchema_Builder1 =
                rowKeyValueDeserializationSchema_Builder0.setFieldMissingStrategy(
                        dirtyDataStrategy0);
        assertSame(
                rowKeyValueDeserializationSchema_Builder1,
                rowKeyValueDeserializationSchema_Builder0);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        RowKeyValueDeserializationSchema.CollectorOption
                rowKeyValueDeserializationSchema_CollectorOption0 =
                        new RowKeyValueDeserializationSchema.CollectorOption();
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        String[] stringArray0 = new String[0];
        DataType[] dataTypeArray0 = new DataType[8];
        TableSchema tableSchema0 = mock(TableSchema.class, new ViolatedAssumptionAnswer());
        doReturn((DataType[]) null).when(tableSchema0).getFieldDataTypes();
        doReturn(stringArray0).when(tableSchema0).getFieldNames();
        doReturn((DataType) null).when(tableSchema0).toRowDataType();
        DirtyDataStrategy dirtyDataStrategy0 = DirtyDataStrategy.PAD;
        DelegatingConfiguration delegatingConfiguration0 = new DelegatingConfiguration();
        Map<String, String> map0 = delegatingConfiguration0.toMap();
        RowKeyValueDeserializationSchema rowKeyValueDeserializationSchema0 =
                new RowKeyValueDeserializationSchema(
                        tableSchema0,
                        dirtyDataStrategy0,
                        dirtyDataStrategy0,
                        dirtyDataStrategy0,
                        "Source type must not be null.",
                        "Source type must not be null.",
                        false,
                        map0);
        // Undeclared exception!
        try {
            rowKeyValueDeserializationSchema0.getProducedType();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException(
                    "org.apache.flink.connector.rocketmq.legacy.common.serialization.RowKeyValueDeserializationSchema",
                    e);
        }
    }
}
