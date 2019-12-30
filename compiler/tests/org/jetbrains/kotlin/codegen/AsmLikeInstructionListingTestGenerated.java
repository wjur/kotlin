/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/asmLike")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class AsmLikeInstructionListingTestGenerated extends AbstractAsmLikeInstructionListingTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM, testDataFilePath);
    }

    public void testAllFilesPresentInAsmLike() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/asmLike"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM, true);
    }

    @TestMetadata("compiler/testData/codegen/asmLike/receiverMangling")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ReceiverMangling extends AbstractAsmLikeInstructionListingTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM, testDataFilePath);
        }

        public void testAllFilesPresentInReceiverMangling() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/asmLike/receiverMangling"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM, true);
        }

        @TestMetadata("deepInline.kt")
        public void testDeepInline() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/deepInline.kt");
        }

        @TestMetadata("deepInlineWithLabels.kt")
        public void testDeepInlineWithLabels() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/deepInlineWithLabels.kt");
        }

        @TestMetadata("deepNoinlineWithLabels_after.kt")
        public void testDeepNoinlineWithLabels_after() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/deepNoinlineWithLabels_after.kt");
        }

        @TestMetadata("deepNoinlineWithLabels_before.kt")
        public void testDeepNoinlineWithLabels_before() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/deepNoinlineWithLabels_before.kt");
        }

        @TestMetadata("deepNoinline_after.kt")
        public void testDeepNoinline_after() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/deepNoinline_after.kt");
        }

        @TestMetadata("deepNoinline_before.kt")
        public void testDeepNoinline_before() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/deepNoinline_before.kt");
        }

        @TestMetadata("inlineClassCapture.kt")
        public void testInlineClassCapture() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/inlineClassCapture.kt");
        }

        @TestMetadata("inlineReceivers.kt")
        public void testInlineReceivers() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/inlineReceivers.kt");
        }

        @TestMetadata("innerClass.kt")
        public void testInnerClass() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/innerClass.kt");
        }

        @TestMetadata("localFunctions.kt")
        public void testLocalFunctions() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/localFunctions.kt");
        }

        @TestMetadata("mangledNames.kt")
        public void testMangledNames() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/mangledNames.kt");
        }

        @TestMetadata("nonInlineReceivers_after.kt")
        public void testNonInlineReceivers_after() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/nonInlineReceivers_after.kt");
        }

        @TestMetadata("nonInlineReceivers_before.kt")
        public void testNonInlineReceivers_before() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/nonInlineReceivers_before.kt");
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/simple.kt");
        }
    }

    @TestMetadata("compiler/testData/codegen/asmLike/typeAnnotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TypeAnnotations extends AbstractAsmLikeInstructionListingTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM, testDataFilePath);
        }

        public void testAllFilesPresentInTypeAnnotations() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/asmLike/typeAnnotations"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM, true);
        }

        @TestMetadata("complex.kt")
        public void testComplex() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/complex.kt");
        }

        @TestMetadata("constructor.kt")
        public void testConstructor() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/constructor.kt");
        }

        @TestMetadata("defaultArgs.kt")
        public void testDefaultArgs() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/defaultArgs.kt");
        }

        @TestMetadata("enumClassConstructor.kt")
        public void testEnumClassConstructor() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/enumClassConstructor.kt");
        }

        @TestMetadata("extension.kt")
        public void testExtension() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/extension.kt");
        }

        @TestMetadata("implicit.kt")
        public void testImplicit() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/implicit.kt");
        }

        @TestMetadata("innerClassConstructor.kt")
        public void testInnerClassConstructor() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/innerClassConstructor.kt");
        }

        @TestMetadata("jvmOverload.kt")
        public void testJvmOverload() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/jvmOverload.kt");
        }

        @TestMetadata("jvmStatic.kt")
        public void testJvmStatic() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/jvmStatic.kt");
        }

        @TestMetadata("notYetSupported.kt")
        public void testNotYetSupported() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/notYetSupported.kt");
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/simple.kt");
        }

        @TestMetadata("simple2Params.kt")
        public void testSimple2Params() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/simple2Params.kt");
        }

        @TestMetadata("staticNested.kt")
        public void testStaticNested() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/staticNested.kt");
        }
    }
}
