package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelRepeatedTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class PersonRepeatedTests implements ModelRepeatedTests {
    @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} - {totalRepetitions}")
    @DisplayName("my repeated test")
    void myRepeatedTest() {
        // todo- impl
    }

    @RepeatedTest(value = 5, name = "{displayName} : {currentRepetition} - {totalRepetitions}")
    void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());
    }

    @RepeatedTest(value = 5, name = "{displayName} : {currentRepetition} | {totalRepetitions}")
    @DisplayName("My Assigment Repeated test")
    void myAssigmentRepeated() {
        // todo- impl
    }
}
