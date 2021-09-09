package garden.vegetables;

public class LVTI {



    public static void main(String[] args){

        System.out.println("--- Shift Operators ---");
// left shift (<<)
// bit pattern shifted left by 2 places (right operand = 2)
// 0b0000_0001 becomes 0b0000_0100
        System.out.println("result of left shift (00000001 << 2 ) = "
                + String.format("%8s",Integer.toBinaryString(0b00000001 << 2)).
                replace(' ', '0'));


// right shift (>>)
// bit pattern shifted left by 3 places (right operand = 3)
// 0b10001000 becomes 0b00010001
        System.out.println("result of right shift (10001000 >> 3 ) = "
                + String.format("%8s",Integer.toBinaryString(0b10001000 >> 3)).
                replace(' ', '0'));


// >>>  right shift unsigned
        System.out.println("result of unsigned right shift (" +
                "10000010_00000010_00000010_00000010 >>> 1 ) = "
                + String.format("%32s",Integer.toBinaryString(
                        0b10000010_00000010_00000010_00000010 >>> 1)).
                replace(' ', '0'));

//  Compare right shift unsigned to right shift results
        System.out.println("result of signed right shift   (" +
                "10000010_00000010_00000010_00000010 >>  1 ) = "
                + String.format("%32s",Integer.toBinaryString(
                        0b10000010_00000010_00000010_00000010 >> 1)).
                replace(' ', '0'));

    }




}
