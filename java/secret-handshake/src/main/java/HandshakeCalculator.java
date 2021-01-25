import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> returnValue = new ArrayList<>();
        if (Integer.toBinaryString(number & 0b1).equals(Integer.toBinaryString(1))) returnValue.add(Signal.WINK);
        if (Integer.toBinaryString(number & 0b10).equals(Integer.toBinaryString(2))) returnValue.add(Signal.DOUBLE_BLINK);
        if (Integer.toBinaryString(number & 0b100).equals(Integer.toBinaryString(4))) returnValue.add(Signal.CLOSE_YOUR_EYES);
        if (Integer.toBinaryString(number & 0b1000).equals(Integer.toBinaryString(8))) returnValue.add(Signal.JUMP);
        if (Integer.toBinaryString(number & 0b10000).equals(Integer.toBinaryString(16))) Collections.reverse(returnValue);
        return returnValue;
    }
}
