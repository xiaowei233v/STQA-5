/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.List;

import static net.mooctest.CreditCardParser.*;

/*
 * Discover format:
 * length = 16
 * IIN range = 6011, 622126 - 622925, 644 - 649, 65
 */
public class DiscoverValidator extends CreditCardValidator {public static class __CLR4_4_15j5jmn4dv0oi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004e\u004a\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0072\u0065\u0064\u0069\u0074\u002d\u0043\u0061\u0072\u0064\u002d\u0056\u0061\u006c\u0069\u0064\u0061\u0074\u006f\u0072\u005f\u0031\u0037\u0036\u0033\u0032\u0030\u0036\u0036\u0037\u0034\u0033\u0037\u0032\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1774342750329L,8589935092L,246,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private List<Integer> creditCardNumberList;

    /*
     * @param String representation of credit card number
     */
    public DiscoverValidator(String creditCardNumber) {try{__CLR4_4_15j5jmn4dv0oi.R.inc(199);
        __CLR4_4_15j5jmn4dv0oi.R.inc(200);creditCardNumberList = parseNumber(creditCardNumber);
    }finally{__CLR4_4_15j5jmn4dv0oi.R.flushNeeded();}}

    /*
     * Check the length of the card against the format
     * requirement.
     *
     * @return boolean of whether or not credit card
     * number meet requirement.
     */
    @Override
    boolean checkLength() {try{__CLR4_4_15j5jmn4dv0oi.R.inc(201);
        __CLR4_4_15j5jmn4dv0oi.R.inc(202);boolean hasAllowedLength = false;

        __CLR4_4_15j5jmn4dv0oi.R.inc(203);if ((((creditCardNumberList.size() == 16)&&(__CLR4_4_15j5jmn4dv0oi.R.iget(204)!=0|true))||(__CLR4_4_15j5jmn4dv0oi.R.iget(205)==0&false))) {{
            __CLR4_4_15j5jmn4dv0oi.R.inc(206);hasAllowedLength = true;
        }

        }__CLR4_4_15j5jmn4dv0oi.R.inc(207);return hasAllowedLength;
    }finally{__CLR4_4_15j5jmn4dv0oi.R.flushNeeded();}}

    /*
     * Check that IIN meets IIN range requirement
     *
     * @return boolean of whether or not IIN matches
     * requirement
     */
    @Override
    boolean checkIINRanges() {try{__CLR4_4_15j5jmn4dv0oi.R.inc(208);
        __CLR4_4_15j5jmn4dv0oi.R.inc(209);boolean hasAllowedIINRange = false;
        __CLR4_4_15j5jmn4dv0oi.R.inc(210);int[] IINRange = {6011, 622126, 622925, 644, 649, 65};
        __CLR4_4_15j5jmn4dv0oi.R.inc(211);int firstTwo = parseIIN(creditCardNumberList, 2);
        __CLR4_4_15j5jmn4dv0oi.R.inc(212);int firstThree = parseIIN(creditCardNumberList, 3);
        __CLR4_4_15j5jmn4dv0oi.R.inc(213);int firstFour = parseIIN(creditCardNumberList, 4);
        __CLR4_4_15j5jmn4dv0oi.R.inc(214);int firstSix = parseIIN(creditCardNumberList, 6);

        __CLR4_4_15j5jmn4dv0oi.R.inc(215);if ((((firstFour == IINRange[0])&&(__CLR4_4_15j5jmn4dv0oi.R.iget(216)!=0|true))||(__CLR4_4_15j5jmn4dv0oi.R.iget(217)==0&false))) {{
            __CLR4_4_15j5jmn4dv0oi.R.inc(218);hasAllowedIINRange = true;
        }

        }__CLR4_4_15j5jmn4dv0oi.R.inc(219);if ((((!hasAllowedIINRange)&&(__CLR4_4_15j5jmn4dv0oi.R.iget(220)!=0|true))||(__CLR4_4_15j5jmn4dv0oi.R.iget(221)==0&false))) {{
            __CLR4_4_15j5jmn4dv0oi.R.inc(222);for (int i = IINRange[1]; (((i <= IINRange[2])&&(__CLR4_4_15j5jmn4dv0oi.R.iget(223)!=0|true))||(__CLR4_4_15j5jmn4dv0oi.R.iget(224)==0&false)); i++) {{
                __CLR4_4_15j5jmn4dv0oi.R.inc(225);if ((((firstSix == i)&&(__CLR4_4_15j5jmn4dv0oi.R.iget(226)!=0|true))||(__CLR4_4_15j5jmn4dv0oi.R.iget(227)==0&false))) {{
                    __CLR4_4_15j5jmn4dv0oi.R.inc(228);hasAllowedIINRange = true;
                    __CLR4_4_15j5jmn4dv0oi.R.inc(229);break;
                }
            }}
        }}

        }__CLR4_4_15j5jmn4dv0oi.R.inc(230);if ((((!hasAllowedIINRange)&&(__CLR4_4_15j5jmn4dv0oi.R.iget(231)!=0|true))||(__CLR4_4_15j5jmn4dv0oi.R.iget(232)==0&false))) {{
            __CLR4_4_15j5jmn4dv0oi.R.inc(233);for (int i = IINRange[3]; (((i <= IINRange[4])&&(__CLR4_4_15j5jmn4dv0oi.R.iget(234)!=0|true))||(__CLR4_4_15j5jmn4dv0oi.R.iget(235)==0&false)); i++) {{
                __CLR4_4_15j5jmn4dv0oi.R.inc(236);if ((((firstThree == i)&&(__CLR4_4_15j5jmn4dv0oi.R.iget(237)!=0|true))||(__CLR4_4_15j5jmn4dv0oi.R.iget(238)==0&false))) {{
                    __CLR4_4_15j5jmn4dv0oi.R.inc(239);hasAllowedIINRange = true;
                    __CLR4_4_15j5jmn4dv0oi.R.inc(240);break;
                }
            }}
        }}

        }__CLR4_4_15j5jmn4dv0oi.R.inc(241);if ((((!hasAllowedIINRange && firstTwo == IINRange[5])&&(__CLR4_4_15j5jmn4dv0oi.R.iget(242)!=0|true))||(__CLR4_4_15j5jmn4dv0oi.R.iget(243)==0&false))) {{
            __CLR4_4_15j5jmn4dv0oi.R.inc(244);hasAllowedIINRange = true;
        }

        }__CLR4_4_15j5jmn4dv0oi.R.inc(245);return hasAllowedIINRange;
    }finally{__CLR4_4_15j5jmn4dv0oi.R.flushNeeded();}}
}
