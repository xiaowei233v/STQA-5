/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.Collections;
import java.util.List;

import static net.mooctest.CreditCardParser.parseNumber;

/*
 * Luhn validator used to pass the credit card number through
 * a series of algorithm checks that confirm whether or not the
 * number are valid
 */
class LuhnValidator {public static class __CLR4_4_19494mn4dv0p5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004e\u004a\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0072\u0065\u0064\u0069\u0074\u002d\u0043\u0061\u0072\u0064\u002d\u0056\u0061\u006c\u0069\u0064\u0061\u0074\u006f\u0072\u005f\u0031\u0037\u0036\u0033\u0032\u0030\u0036\u0036\u0037\u0034\u0033\u0037\u0032\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1774342750329L,8589935092L,363,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /*
     * @param String representation of the credit card number.
     * @return boolean of whether or not the number pass the
     * algorithm check.
     */
    boolean validate(String creditCardNumber) {try{__CLR4_4_19494mn4dv0p5.R.inc(328);
        __CLR4_4_19494mn4dv0p5.R.inc(329);return algorithmCheck(creditCardNumber);
    }finally{__CLR4_4_19494mn4dv0p5.R.flushNeeded();}}

    /*
     * @param int of number that should be split into individual
     * digits
     * @return the sum of the digits
     */
    public int sumOfDigits(int number) {try{__CLR4_4_19494mn4dv0p5.R.inc(330);
        __CLR4_4_19494mn4dv0p5.R.inc(331);String[] tempNumberArray = Integer.toString(number).split("");
        __CLR4_4_19494mn4dv0p5.R.inc(332);int total = 0;
        __CLR4_4_19494mn4dv0p5.R.inc(333);for (String digit : tempNumberArray) {{
            __CLR4_4_19494mn4dv0p5.R.inc(334);total += Integer.parseInt(digit);
        }

        }__CLR4_4_19494mn4dv0p5.R.inc(335);return total;
    }finally{__CLR4_4_19494mn4dv0p5.R.flushNeeded();}}

    /*
     * @param String representation of the credit card number
     * @return boolean of whether or not the number pass the
     * Luhn algorithm check
     */
    public boolean algorithmCheck(String creditCardNumber) {try{__CLR4_4_19494mn4dv0p5.R.inc(336);
        __CLR4_4_19494mn4dv0p5.R.inc(337);List<Integer> numberList = parseNumber(creditCardNumber);
        __CLR4_4_19494mn4dv0p5.R.inc(338);boolean isValid = false;
        __CLR4_4_19494mn4dv0p5.R.inc(339);int listSize = numberList.size();
        __CLR4_4_19494mn4dv0p5.R.inc(340);int[] tempArray = new int[listSize];
        __CLR4_4_19494mn4dv0p5.R.inc(341);int sum = 0;

        // Reverse the order
        __CLR4_4_19494mn4dv0p5.R.inc(342);Collections.reverse(numberList);

        // Double the value of every second digit
        __CLR4_4_19494mn4dv0p5.R.inc(343);for (int i = 1; (((i < listSize)&&(__CLR4_4_19494mn4dv0p5.R.iget(344)!=0|true))||(__CLR4_4_19494mn4dv0p5.R.iget(345)==0&false)); i += 2) {{
            __CLR4_4_19494mn4dv0p5.R.inc(346);int tempNumber = numberList.get(i) * 2;

            /*
             * If doubling results in a single digit number then add it to list
             * otherwise, add each digit together to obtain a single digit number
            */
            __CLR4_4_19494mn4dv0p5.R.inc(347);if ((((tempNumber < 10)&&(__CLR4_4_19494mn4dv0p5.R.iget(348)!=0|true))||(__CLR4_4_19494mn4dv0p5.R.iget(349)==0&false))) {{
                __CLR4_4_19494mn4dv0p5.R.inc(350);tempArray[i] = tempNumber;
            } }else {{
                __CLR4_4_19494mn4dv0p5.R.inc(351);tempArray[i] = sumOfDigits(tempNumber);
            }
        }}
        
        // Add the remaining digits
        }__CLR4_4_19494mn4dv0p5.R.inc(352);for (int i = 0; (((i < listSize)&&(__CLR4_4_19494mn4dv0p5.R.iget(353)!=0|true))||(__CLR4_4_19494mn4dv0p5.R.iget(354)==0&false)); i += 2) {{
            __CLR4_4_19494mn4dv0p5.R.inc(355);tempArray[i] = numberList.get(i);
        }

        // Take sum of all digits
        }__CLR4_4_19494mn4dv0p5.R.inc(356);for (int number : tempArray) {{
            __CLR4_4_19494mn4dv0p5.R.inc(357);sum += number;
        }
        // If total modulo 10 is equal to 0 then the card is valid
        }__CLR4_4_19494mn4dv0p5.R.inc(358);if ((((sum % 10 == 0)&&(__CLR4_4_19494mn4dv0p5.R.iget(359)!=0|true))||(__CLR4_4_19494mn4dv0p5.R.iget(360)==0&false))) {{
            __CLR4_4_19494mn4dv0p5.R.inc(361);isValid = true;
        }

        }__CLR4_4_19494mn4dv0p5.R.inc(362);return isValid;
    }finally{__CLR4_4_19494mn4dv0p5.R.flushNeeded();}}
}
