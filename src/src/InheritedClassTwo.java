//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package src;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InheritedClassTwo extends InheritedClassOne {
    @Override
    public String deleteWords(String text) {
        String result = Arrays.stream(text.split("\\s+")).distinct().collect(Collectors.joining(" "));
        return result;
    }
}
