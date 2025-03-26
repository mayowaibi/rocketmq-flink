/**
 * Scaffolding file used to store all the setups needed to run tests automatically generated by
 * EvoSuite Wed Mar 26 11:43:17 GMT 2025
 */
package org.apache.flink.connector.rocketmq.sink.table;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.evosuite.runtime.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.evosuite.shaded.org.mockito.Mockito.*;

@EvoSuiteClassExclude
public class RocketMQDynamicTableSink_ESTest_scaffolding {

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
                "org.apache.flink.connector.rocketmq.sink.table.RocketMQDynamicTableSink";
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
                RocketMQDynamicTableSink_ESTest_scaffolding.class.getClassLoader(),
                "org.apache.flink.table.types.DataType",
                "org.apache.flink.api.common.typeinfo.TypeHint",
                "org.apache.flink.table.types.logical.CharType",
                "org.apache.flink.api.common.typeinfo.LocalTimeTypeInfo",
                "org.apache.flink.table.api.DataTypes$Resolution$IntervalUnit",
                "org.apache.flink.api.common.typeutils.base.DateComparator",
                "org.apache.rocketmq.client.producer.MessageQueueSelector",
                "org.apache.flink.api.java.typeutils.ValueTypeInfo",
                "org.apache.flink.table.types.logical.SymbolType",
                "org.apache.flink.table.types.logical.LocalZonedTimestampType",
                "org.apache.flink.api.common.typeutils.base.DateSerializer",
                "org.apache.flink.api.common.typeinfo.NumericTypeInfo",
                "org.apache.flink.table.data.MapData",
                "org.apache.flink.table.api.TableSchema",
                "org.apache.flink.table.types.extraction.ExtractionUtils$ParameterExtractor",
                "org.apache.flink.api.common.typeutils.base.LocalTimeSerializer",
                "org.apache.flink.types.Row",
                "org.apache.flink.api.common.typeutils.base.ShortComparator",
                "org.apache.flink.api.common.typeutils.base.DoubleComparator",
                "org.apache.flink.table.types.KeyValueDataType",
                "org.apache.flink.api.common.typeutils.base.array.BooleanPrimitiveArraySerializer",
                "org.apache.flink.table.types.logical.DayTimeIntervalType$1",
                "org.apache.flink.table.api.TableSchema$1",
                "org.apache.flink.api.common.typeutils.base.ShortSerializer",
                "org.apache.flink.api.common.typeutils.base.LocalTimeComparator",
                "org.apache.flink.table.types.logical.TimestampType",
                "org.apache.flink.api.common.typeutils.base.array.DoublePrimitiveArrayComparator",
                "org.apache.flink.api.common.typeutils.base.LongComparator",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$Extractor",
                "org.apache.flink.table.api.TableColumn",
                "org.apache.flink.table.connector.sink.DynamicTableSink$Context",
                "org.apache.flink.api.common.typeutils.base.BigIntComparator",
                "org.apache.flink.connector.rocketmq.legacy.RocketMQSink",
                "org.apache.flink.table.connector.ChangelogMode$Builder",
                "org.apache.flink.connector.rocketmq.sink.table.RocketMQRowDataSink",
                "org.apache.flink.api.common.typeinfo.Types",
                "org.apache.flink.api.common.typeutils.base.LocalDateTimeComparator",
                "org.apache.flink.table.types.logical.YearMonthIntervalType$YearMonthResolution",
                "org.apache.flink.util.FlinkRuntimeException",
                "org.apache.flink.api.java.typeutils.GenericTypeInfo",
                "org.apache.flink.api.common.typeutils.base.array.IntPrimitiveArraySerializer",
                "org.apache.flink.table.api.TableException",
                "org.apache.flink.table.data.DecimalData",
                "org.apache.flink.table.types.logical.ArrayType",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$FieldNamesExtractor",
                "org.apache.flink.table.types.DataTypeVisitor",
                "org.apache.flink.table.api.DataTypes$AbstractField",
                "org.apache.flink.connector.rocketmq.sink.table.RocketMQDynamicTableSink$WritableMetadata$1",
                "org.apache.flink.connector.rocketmq.sink.table.RocketMQDynamicTableSink$WritableMetadata$2",
                "org.apache.flink.api.java.typeutils.EnumTypeInfo",
                "org.apache.flink.table.types.logical.LogicalTypeRoot",
                "org.apache.flink.api.common.typeutils.base.array.LongPrimitiveArrayComparator",
                "org.apache.flink.table.types.DataTypeQueryable",
                "org.apache.flink.api.java.typeutils.PojoTypeInfo",
                "org.apache.flink.api.common.typeutils.base.StringComparator",
                "org.apache.flink.api.common.typeutils.base.array.ShortPrimitiveArraySerializer",
                "org.apache.flink.api.common.typeinfo.BasicArrayTypeInfo",
                "org.apache.flink.api.common.typeutils.base.FloatComparator",
                "org.apache.flink.api.java.typeutils.TupleTypeInfo",
                "org.apache.flink.api.common.typeutils.base.BigDecComparator",
                "org.apache.flink.api.common.typeutils.base.array.CharPrimitiveArrayComparator",
                "org.apache.flink.table.types.logical.MapType",
                "org.apache.flink.api.common.typeinfo.BasicTypeInfo",
                "org.apache.flink.table.types.logical.RawType",
                "org.apache.flink.api.common.typeutils.base.array.FloatPrimitiveArrayComparator",
                "org.apache.flink.api.common.typeutils.CompositeType$InvalidFieldReferenceException",
                "org.apache.flink.table.catalog.AbstractConstraint",
                "org.apache.flink.api.common.functions.Function",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$SingleFieldIntervalExtractor",
                "org.apache.flink.api.common.typeutils.base.BasicTypeComparator",
                "org.apache.flink.api.java.typeutils.EitherTypeInfo",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$YearPrecisionExtractor",
                "org.apache.flink.api.common.typeutils.CompositeType$TypeComparatorBuilder",
                "org.apache.flink.table.connector.sink.DynamicTableSink$SinkRuntimeProvider",
                "org.apache.flink.util.Preconditions",
                "org.apache.flink.api.common.typeutils.base.ByteComparator",
                "org.apache.flink.api.common.typeutils.base.BooleanSerializer",
                "org.apache.flink.api.common.typeutils.base.LocalDateSerializer",
                "org.apache.flink.table.types.logical.LogicalTypeVisitor",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$PrecisionExtractor",
                "org.apache.flink.table.data.ArrayData",
                "org.apache.flink.table.api.ValidationException",
                "org.apache.flink.api.common.ExecutionConfig",
                "org.apache.flink.connector.rocketmq.sink.table.RocketMQRowDataConverter",
                "org.apache.flink.table.api.constraints.UniqueConstraint",
                "org.apache.flink.table.types.extraction.ExtractionUtils",
                "org.apache.rocketmq.remoting.exception.RemotingException",
                "org.apache.flink.table.types.logical.BinaryType",
                "org.apache.flink.api.java.typeutils.runtime.RowSerializer",
                "org.apache.flink.table.types.logical.IntType",
                "org.apache.flink.api.common.typeutils.base.array.DoublePrimitiveArraySerializer",
                "org.apache.flink.table.api.constraints.Constraint",
                "org.apache.flink.table.types.logical.RowType",
                "org.apache.flink.table.types.logical.FloatType",
                "org.apache.flink.table.api.Schema$Builder",
                "org.apache.flink.table.api.DataTypes$Field",
                "org.apache.flink.table.types.logical.LogicalTypeFamily",
                "org.apache.flink.table.types.FieldsDataType",
                "org.apache.flink.connector.rocketmq.sink.table.RocketMQDynamicTableSink$WritableMetadata",
                "org.apache.flink.api.java.typeutils.MapTypeInfo",
                "org.apache.flink.table.types.AbstractDataType",
                "org.apache.flink.table.types.logical.MultisetType",
                "org.apache.flink.table.catalog.WatermarkSpec",
                "org.apache.flink.table.data.TimestampData",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$FieldCountExtractor",
                "org.apache.flink.table.types.logical.BigIntType",
                "org.apache.flink.table.connector.RuntimeConverter",
                "org.apache.flink.api.common.typeutils.base.IntComparator",
                "org.apache.flink.api.common.typeutils.base.SqlDateSerializer",
                "org.apache.flink.table.api.constraints.AbstractConstraint",
                "org.apache.flink.table.api.DataTypes",
                "org.apache.flink.api.common.typeutils.base.BigIntSerializer",
                "org.apache.flink.api.common.typeutils.base.array.IntPrimitiveArrayComparator",
                "org.apache.flink.table.catalog.UniqueConstraint",
                "org.apache.flink.table.runtime.connector.sink.SinkRuntimeProviderContext",
                "org.apache.flink.table.types.logical.ZonedTimestampType",
                "org.apache.flink.api.common.functions.AbstractRichFunction",
                "org.apache.rocketmq.client.producer.SendCallback",
                "org.apache.flink.api.common.typeutils.base.array.BytePrimitiveArrayComparator",
                "org.apache.flink.table.types.logical.UserDefinedType",
                "org.apache.rocketmq.remoting.RPCHook",
                "org.apache.flink.table.catalog.ResolvedSchema",
                "org.apache.flink.table.types.logical.StructuredType",
                "org.apache.flink.api.common.typeutils.base.array.BytePrimitiveArraySerializer",
                "org.apache.flink.configuration.MemorySize",
                "org.apache.rocketmq.client.exception.MQClientException",
                "org.apache.flink.table.catalog.Constraint",
                "org.apache.flink.table.types.logical.DecimalType",
                "org.apache.flink.api.common.InvalidProgramException",
                "org.apache.flink.api.common.typeutils.base.InstantComparator",
                "org.apache.flink.table.typeutils.TimeIntervalTypeInfo",
                "org.apache.flink.api.common.typeutils.TypeSerializer",
                "org.apache.flink.table.connector.sink.DynamicTableSink",
                "org.apache.flink.streaming.api.functions.sink.SinkFunction",
                "org.apache.flink.api.common.typeutils.TypeComparator",
                "org.apache.flink.table.types.logical.NullType",
                "org.apache.flink.api.common.typeinfo.PrimitiveArrayTypeInfo",
                "org.apache.flink.table.runtime.typeutils.InternalTypeInfo",
                "org.apache.flink.table.types.logical.DistinctType",
                "org.apache.flink.api.common.typeinfo.FractionalTypeInfo",
                "org.apache.flink.api.common.typeinfo.IntegerTypeInfo",
                "org.apache.flink.api.common.functions.RichFunction",
                "org.apache.flink.table.connector.ChangelogMode",
                "org.apache.flink.table.types.logical.TinyIntType",
                "org.apache.flink.table.catalog.Column",
                "org.apache.flink.api.java.typeutils.ObjectArrayTypeInfo",
                "org.apache.flink.table.types.logical.DoubleType",
                "org.apache.flink.api.common.functions.InvalidTypesException",
                "org.apache.flink.api.common.typeutils.base.SqlTimeSerializer",
                "org.apache.flink.table.api.WatermarkSpec",
                "org.apache.flink.table.types.logical.utils.LogicalTypeDefaultVisitor",
                "org.apache.flink.table.types.logical.VarCharType",
                "org.apache.flink.table.types.logical.DateType",
                "org.apache.flink.api.common.typeutils.base.InstantSerializer",
                "org.apache.flink.table.types.logical.SmallIntType",
                "org.apache.flink.types.RowKind",
                "org.apache.flink.api.common.typeutils.base.VoidSerializer",
                "org.apache.flink.table.types.logical.VarBinaryType",
                "org.apache.flink.api.common.typeutils.base.BigDecSerializer",
                "org.apache.flink.table.api.TableColumn$MetadataColumn",
                "org.apache.flink.table.types.AtomicDataType",
                "org.apache.flink.table.api.Schema",
                "org.apache.flink.connector.rocketmq.sink.table.RocketMQRowDataConverter$MetadataConverter",
                "org.apache.flink.table.connector.sink.abilities.SupportsWritingMetadata",
                "org.apache.flink.api.common.typeutils.base.StringSerializer",
                "org.apache.flink.api.java.typeutils.RowTypeInfo",
                "org.apache.flink.api.common.typeinfo.AtomicType",
                "org.apache.flink.api.common.typeutils.base.array.PrimitiveArrayComparator",
                "org.apache.flink.api.common.typeutils.base.SqlTimestampComparator",
                "org.apache.flink.api.common.typeutils.base.IntSerializer",
                "org.apache.flink.api.common.typeutils.TypeSerializerSnapshot",
                "org.apache.flink.table.types.logical.BooleanType",
                "org.apache.flink.api.common.typeutils.base.FloatSerializer",
                "org.apache.flink.table.types.logical.TimeType",
                "org.apache.flink.api.common.typeinfo.TypeInformation",
                "org.apache.flink.api.common.typeutils.base.BooleanComparator",
                "org.apache.flink.api.common.typeutils.base.LocalDateComparator",
                "org.apache.flink.api.common.typeutils.base.CharSerializer",
                "org.apache.flink.streaming.api.checkpoint.CheckpointedFunction",
                "org.apache.flink.table.types.logical.DayTimeIntervalType",
                "org.apache.flink.api.common.typeutils.base.SqlTimestampSerializer",
                "org.apache.flink.table.api.DataTypes$Resolution",
                "org.apache.flink.api.common.typeinfo.SqlTimeTypeInfo",
                "org.apache.flink.api.common.typeutils.base.LocalDateTimeSerializer",
                "org.apache.flink.api.common.typeutils.base.CharComparator",
                "org.apache.flink.streaming.api.functions.sink.RichSinkFunction",
                "org.apache.flink.table.types.logical.LegacyTypeInformationType",
                "org.apache.flink.api.common.typeutils.base.array.CharPrimitiveArraySerializer",
                "org.apache.flink.table.types.logical.LogicalType",
                "org.apache.flink.table.types.CollectionDataType",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$DayPrecisionExtractor",
                "org.apache.flink.table.api.TableColumn$PhysicalColumn",
                "org.apache.flink.table.descriptors.DescriptorProperties",
                "org.apache.flink.api.java.typeutils.MultisetTypeInfo",
                "org.apache.flink.api.common.typeutils.base.ByteSerializer",
                "org.apache.flink.table.connector.ParallelismProvider",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$FractionalPrecisionExtractor",
                "org.apache.flink.api.common.typeutils.base.DoubleSerializer",
                "org.apache.flink.table.connector.sink.DynamicTableSink$DataStructureConverter",
                "org.apache.flink.api.common.typeutils.base.array.BooleanPrimitiveArrayComparator",
                "org.apache.flink.api.common.typeutils.base.array.LongPrimitiveArraySerializer",
                "org.apache.flink.api.java.typeutils.ListTypeInfo",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$ScaleExtractor",
                "org.apache.flink.table.types.logical.TimestampKind",
                "org.apache.flink.shaded.asm9.org.objectweb.asm.ClassVisitor",
                "org.apache.flink.api.common.typeutils.base.LongSerializer",
                "org.apache.flink.table.types.logical.YearMonthIntervalType",
                "org.apache.flink.table.connector.sink.SinkFunctionProvider",
                "org.apache.flink.api.common.Archiveable",
                "org.apache.flink.connector.rocketmq.sink.table.RocketMQDynamicTableSink",
                "org.apache.flink.api.common.typeutils.CompositeType",
                "org.apache.flink.table.types.logical.DayTimeIntervalType$DayTimeResolution",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$LengthExtractor",
                "org.apache.flink.table.api.TableColumn$ComputedColumn",
                "org.apache.flink.table.typeutils.TimeIndicatorTypeInfo",
                "org.apache.flink.api.common.typeutils.base.array.FloatPrimitiveArraySerializer",
                "org.apache.flink.table.data.StringData",
                "org.apache.flink.api.common.typeutils.base.array.ShortPrimitiveArrayComparator",
                "org.apache.flink.table.api.TableSchema$Builder",
                "org.apache.flink.api.common.typeutils.base.TypeSerializerSingleton",
                "org.apache.flink.table.types.utils.LegacyTypeInfoDataTypeConverter",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$TimestampKindExtractor",
                "org.apache.flink.api.java.typeutils.TupleTypeInfoBase",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks");
    }

    private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException {
        mock(
                Class.forName(
                        "org.apache.flink.table.api.TableSchema",
                        false,
                        RocketMQDynamicTableSink_ESTest_scaffolding.class.getClassLoader()));
        mock(
                Class.forName(
                        "org.apache.flink.table.descriptors.DescriptorProperties",
                        false,
                        RocketMQDynamicTableSink_ESTest_scaffolding.class.getClassLoader()));
    }

    private static void resetClasses() {
        org.evosuite.runtime.classhandling.ClassResetter.getInstance()
                .setClassLoader(RocketMQDynamicTableSink_ESTest_scaffolding.class.getClassLoader());

        org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
                "org.apache.flink.connector.rocketmq.sink.table.RocketMQDynamicTableSink",
                "org.apache.flink.table.api.DataTypes",
                "org.apache.flink.table.types.DataType",
                "org.apache.flink.table.types.AtomicDataType",
                "org.apache.flink.table.types.logical.LogicalType",
                "org.apache.flink.table.types.logical.LogicalTypeFamily",
                "org.apache.flink.table.types.logical.LogicalTypeRoot",
                "org.apache.flink.util.Preconditions",
                "org.apache.flink.table.types.logical.VarCharType",
                "org.apache.flink.connector.rocketmq.sink.table.RocketMQDynamicTableSink$WritableMetadata$1",
                "org.apache.flink.connector.rocketmq.sink.table.RocketMQDynamicTableSink$WritableMetadata$2",
                "org.apache.flink.connector.rocketmq.sink.table.RocketMQDynamicTableSink$WritableMetadata",
                "org.apache.flink.types.RowKind",
                "org.apache.flink.table.descriptors.DescriptorProperties",
                "org.apache.flink.table.api.TableSchema",
                "org.apache.flink.table.runtime.connector.sink.SinkRuntimeProviderContext",
                "org.apache.flink.api.common.functions.AbstractRichFunction",
                "org.apache.flink.streaming.api.functions.sink.RichSinkFunction",
                "org.apache.flink.connector.rocketmq.sink.table.RocketMQRowDataSink",
                "org.apache.flink.connector.rocketmq.legacy.RocketMQSink",
                "org.apache.flink.connector.rocketmq.sink.table.RocketMQRowDataConverter",
                "org.apache.flink.table.connector.ChangelogMode$Builder",
                "org.apache.flink.table.connector.ChangelogMode",
                "org.apache.flink.table.types.logical.LocalZonedTimestampType",
                "org.apache.flink.table.api.ValidationException",
                "org.apache.flink.table.types.logical.BinaryType",
                "org.apache.flink.table.types.FieldsDataType",
                "org.apache.flink.table.types.logical.BigIntType",
                "org.apache.flink.table.types.logical.DateType",
                "org.apache.flink.table.types.logical.utils.LogicalTypeDefaultVisitor",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$Extractor",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$TimestampKindExtractor",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$LengthExtractor",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$PrecisionExtractor",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$ScaleExtractor",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$YearPrecisionExtractor",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$DayPrecisionExtractor",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$FractionalPrecisionExtractor",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$SingleFieldIntervalExtractor",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$FieldCountExtractor",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks$FieldNamesExtractor",
                "org.apache.flink.table.types.logical.utils.LogicalTypeChecks",
                "org.apache.flink.api.common.typeinfo.TypeInformation",
                "org.apache.flink.api.common.typeutils.CompositeType",
                "org.apache.flink.api.java.typeutils.TupleTypeInfoBase",
                "org.apache.flink.api.java.typeutils.RowTypeInfo",
                "org.apache.flink.table.types.logical.FloatType",
                "org.apache.flink.table.types.logical.DecimalType",
                "org.apache.flink.table.types.logical.IntType",
                "org.apache.flink.table.types.logical.CharType",
                "org.apache.flink.table.types.logical.ArrayType",
                "org.apache.flink.table.types.logical.DayTimeIntervalType",
                "org.apache.flink.table.types.logical.DayTimeIntervalType$1",
                "org.apache.flink.table.types.logical.DoubleType",
                "org.apache.flink.table.types.CollectionDataType",
                "org.apache.flink.table.types.KeyValueDataType",
                "org.apache.flink.table.types.utils.DataTypeUtils",
                "org.apache.flink.table.types.utils.DataTypeDefaultVisitor",
                "org.apache.flink.table.types.utils.DataTypeUtils$DataTypeOutputClassValidator",
                "org.apache.flink.table.types.logical.BooleanType",
                "org.apache.flink.table.runtime.typeutils.InternalTypeInfo",
                "org.apache.flink.table.types.logical.utils.LogicalTypeDuplicator",
                "org.apache.flink.table.types.logical.utils.LogicalTypeUtils$TimeAttributeRemover",
                "org.apache.flink.table.types.logical.utils.LogicalTypeUtils",
                "org.apache.flink.table.types.logical.utils.LogicalTypeUtils$1",
                "org.apache.flink.table.runtime.typeutils.InternalSerializers",
                "org.apache.flink.table.runtime.typeutils.InternalSerializers$1",
                "org.apache.flink.api.common.typeutils.TypeSerializer",
                "org.apache.flink.api.common.typeutils.base.TypeSerializerSingleton",
                "org.apache.flink.api.common.typeutils.base.IntSerializer",
                "org.apache.flink.table.runtime.connector.sink.DataStructureConverterWrapper",
                "org.apache.flink.table.data.conversion.DataStructureConverters$ConverterIdentifier",
                "org.apache.flink.table.data.conversion.DataStructureConverters",
                "org.apache.flink.table.data.conversion.DataStructureConverter$1",
                "org.apache.flink.table.data.conversion.DataStructureConverter",
                "org.apache.flink.table.data.conversion.StringStringConverter",
                "org.apache.flink.api.common.typeutils.base.FloatSerializer",
                "org.apache.flink.api.common.typeutils.base.BooleanSerializer",
                "org.apache.flink.api.common.typeutils.base.StringSerializer",
                "org.apache.flink.api.common.typeinfo.NumericTypeInfo",
                "org.apache.flink.api.common.typeinfo.IntegerTypeInfo",
                "org.apache.flink.api.common.typeutils.base.ByteSerializer",
                "org.apache.flink.api.common.typeutils.base.ShortSerializer",
                "org.apache.flink.api.common.typeutils.base.LongSerializer",
                "org.apache.flink.api.common.typeinfo.FractionalTypeInfo",
                "org.apache.flink.api.common.typeutils.base.DoubleSerializer",
                "org.apache.flink.api.common.typeutils.base.CharSerializer",
                "org.apache.flink.api.common.typeutils.base.DateSerializer",
                "org.apache.flink.api.common.typeutils.base.VoidSerializer",
                "org.apache.flink.api.common.typeutils.base.BigIntSerializer",
                "org.apache.flink.api.common.typeutils.base.BigDecSerializer",
                "org.apache.flink.api.common.typeutils.base.InstantSerializer",
                "org.apache.flink.api.common.typeinfo.BasicTypeInfo",
                "org.apache.flink.table.types.logical.LegacyTypeInformationType",
                "org.apache.flink.api.common.typeinfo.TypeHint",
                "org.apache.flink.api.common.typeutils.base.SqlDateSerializer",
                "org.apache.flink.api.common.typeutils.base.SqlTimeSerializer",
                "org.apache.flink.api.common.typeutils.base.SqlTimestampSerializer",
                "org.apache.flink.api.common.typeinfo.SqlTimeTypeInfo",
                "org.apache.flink.api.common.typeutils.base.LocalDateSerializer",
                "org.apache.flink.api.common.typeutils.base.LocalTimeSerializer",
                "org.apache.flink.api.common.typeutils.base.LocalDateTimeSerializer",
                "org.apache.flink.api.common.typeinfo.LocalTimeTypeInfo",
                "org.apache.flink.api.common.typeinfo.Types",
                "org.apache.flink.table.types.logical.TinyIntType",
                "org.apache.flink.table.types.logical.SmallIntType",
                "org.apache.flink.table.types.logical.TimeType",
                "org.apache.flink.table.types.logical.TimestampType",
                "org.apache.flink.table.typeutils.TimeIntervalTypeInfo",
                "org.apache.flink.table.api.DataTypes$Resolution$IntervalUnit",
                "org.apache.flink.table.api.DataTypes$Resolution",
                "org.apache.flink.table.types.logical.YearMonthIntervalType",
                "org.apache.flink.table.types.logical.YearMonthIntervalType$YearMonthResolution",
                "org.apache.flink.api.common.typeutils.base.array.BooleanPrimitiveArraySerializer",
                "org.apache.flink.api.common.typeutils.base.array.BytePrimitiveArraySerializer",
                "org.apache.flink.api.common.typeutils.base.array.ShortPrimitiveArraySerializer",
                "org.apache.flink.api.common.typeutils.base.array.IntPrimitiveArraySerializer",
                "org.apache.flink.api.common.typeutils.base.array.LongPrimitiveArraySerializer",
                "org.apache.flink.api.common.typeutils.base.array.FloatPrimitiveArraySerializer",
                "org.apache.flink.api.common.typeutils.base.array.DoublePrimitiveArraySerializer",
                "org.apache.flink.api.common.typeutils.base.array.CharPrimitiveArraySerializer",
                "org.apache.flink.api.common.typeinfo.PrimitiveArrayTypeInfo",
                "org.apache.flink.table.types.logical.VarBinaryType",
                "org.apache.flink.table.types.utils.LegacyTypeInfoDataTypeConverter",
                "org.apache.flink.table.types.extraction.ExtractionUtils",
                "org.apache.flink.table.api.TableException",
                "org.apache.flink.api.java.typeutils.TypeExtractor",
                "org.apache.flink.api.java.typeutils.TypeExtractionUtils",
                "org.apache.commons.lang3.ClassUtils",
                "org.apache.flink.api.java.typeutils.GenericTypeInfo",
                "org.apache.flink.api.common.typeinfo.BasicArrayTypeInfo",
                "org.apache.flink.api.common.InvalidProgramException",
                "org.apache.flink.api.common.functions.InvalidTypesException",
                "org.apache.flink.table.runtime.typeutils.TimestampDataSerializer",
                "org.apache.flink.table.data.conversion.IdentityConverter",
                "org.apache.flink.table.runtime.typeutils.StringDataSerializer",
                "org.apache.flink.table.data.conversion.LocalZonedTimestampInstantConverter",
                "org.apache.flink.api.common.typeinfo.NothingTypeInfo",
                "org.apache.flink.table.runtime.typeutils.DecimalDataSerializer",
                "org.apache.flink.table.types.logical.TimestampKind",
                "org.apache.flink.table.types.logical.DayTimeIntervalType$DayTimeResolution");
    }
}
