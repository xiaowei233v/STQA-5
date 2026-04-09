/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.List;

import static net.mooctest.CreditCardParser.*;

/*
 * Maestro format:
 * length = 12 - 19
 * IIN range = 500000 - 509999, 560000 - 589999, 600000 - 699999
 */
public class MaestroValidator extends CreditCardValidator {public static class __CLR4_4_1bgbgmn4dv0ph{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004e\u004a\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0072\u0065\u0064\u0069\u0074\u002d\u0043\u0061\u0072\u0064\u002d\u0056\u0061\u006c\u0069\u0064\u0061\u0074\u006f\u0072\u005f\u0031\u0037\u0036\u0033\u0032\u0030\u0036\u0036\u0037\u0034\u0033\u0037\u0032\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1774342750329L,8589935092L,456,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private List<Integer> creditCardNumberList;

    /*
     * @param String representation of credit card number
     */
    public MaestroValidator(String creditCardNumber) {try{__CLR4_4_1bgbgmn4dv0ph.R.inc(412);
        __CLR4_4_1bgbgmn4dv0ph.R.inc(413);creditCardNumberList = parseNumber(creditCardNumber);
    }finally{__CLR4_4_1bgbgmn4dv0ph.R.flushNeeded();}}

    /*
     * Check the length of the card against the format
     * requirement.
     *
     * @return boolean of whether or not credit card
     * number meet requirement.
     */
    @Override
    boolean checkLength() {try{__CLR4_4_1bgbgmn4dv0ph.R.inc(414);
        __CLR4_4_1bgbgmn4dv0ph.R.inc(415);boolean hasAllowedLength = false;

        __CLR4_4_1bgbgmn4dv0ph.R.inc(416);if ((((creditCardNumberList.size() >= 12 && creditCardNumberList.size() <= 19)&&(__CLR4_4_1bgbgmn4dv0ph.R.iget(417)!=0|true))||(__CLR4_4_1bgbgmn4dv0ph.R.iget(418)==0&false))) {{
            __CLR4_4_1bgbgmn4dv0ph.R.inc(419);hasAllowedLength = true;
        }

        }__CLR4_4_1bgbgmn4dv0ph.R.inc(420);return hasAllowedLength;
    }finally{__CLR4_4_1bgbgmn4dv0ph.R.flushNeeded();}}

    /*
     * Check that IIN meets IIN range requirement
     *
     * @return boolean of whether or not IIN matches
     * requirement
     */
    @Override
    boolean checkIINRanges() {try{__CLR4_4_1bgbgmn4dv0ph.R.inc(421);
        __CLR4_4_1bgbgmn4dv0ph.R.inc(422);boolean hasAllowedIINRange = false;
        __CLR4_4_1bgbgmn4dv0ph.R.inc(423);int[] IINRange = {500000, 509999, 560000, 589999, 600000, 699999};
        __CLR4_4_1bgbgmn4dv0ph.R.inc(424);int firstSix = parseIIN(creditCardNumberList, 6);

        __CLR4_4_1bgbgmn4dv0ph.R.inc(425);for (int i = IINRange[0]; (((i <= IINRange[1])&&(__CLR4_4_1bgbgmn4dv0ph.R.iget(426)!=0|true))||(__CLR4_4_1bgbgmn4dv0ph.R.iget(427)==0&false)); i++) {{
            __CLR4_4_1bgbgmn4dv0ph.R.inc(428);if ((((firstSix == i)&&(__CLR4_4_1bgbgmn4dv0ph.R.iget(429)!=0|true))||(__CLR4_4_1bgbgmn4dv0ph.R.iget(430)==0&false))) {{
                __CLR4_4_1bgbgmn4dv0ph.R.inc(431);hasAllowedIINRange = true;
                __CLR4_4_1bgbgmn4dv0ph.R.inc(432);break;
            }
        }}

        }__CLR4_4_1bgbgmn4dv0ph.R.inc(433);if ((((!hasAllowedIINRange)&&(__CLR4_4_1bgbgmn4dv0ph.R.iget(434)!=0|true))||(__CLR4_4_1bgbgmn4dv0ph.R.iget(435)==0&false))) {{
            __CLR4_4_1bgbgmn4dv0ph.R.inc(436);for (int i = IINRange[2]; (((i <= IINRange[3])&&(__CLR4_4_1bgbgmn4dv0ph.R.iget(437)!=0|true))||(__CLR4_4_1bgbgmn4dv0ph.R.iget(438)==0&false)); i++) {{
                __CLR4_4_1bgbgmn4dv0ph.R.inc(439);if ((((firstSix == i)&&(__CLR4_4_1bgbgmn4dv0ph.R.iget(440)!=0|true))||(__CLR4_4_1bgbgmn4dv0ph.R.iget(441)==0&false))) {{
                    __CLR4_4_1bgbgmn4dv0ph.R.inc(442);hasAllowedIINRange = true;
                    __CLR4_4_1bgbgmn4dv0ph.R.inc(443);break;
                }
            }}
        }}

        }__CLR4_4_1bgbgmn4dv0ph.R.inc(444);if ((((!hasAllowedIINRange)&&(__CLR4_4_1bgbgmn4dv0ph.R.iget(445)!=0|true))||(__CLR4_4_1bgbgmn4dv0ph.R.iget(446)==0&false))) {{
            __CLR4_4_1bgbgmn4dv0ph.R.inc(447);for (int i = IINRange[4]; (((i <= IINRange[5])&&(__CLR4_4_1bgbgmn4dv0ph.R.iget(448)!=0|true))||(__CLR4_4_1bgbgmn4dv0ph.R.iget(449)==0&false)); i++) {{
                __CLR4_4_1bgbgmn4dv0ph.R.inc(450);if ((((firstSix == i)&&(__CLR4_4_1bgbgmn4dv0ph.R.iget(451)!=0|true))||(__CLR4_4_1bgbgmn4dv0ph.R.iget(452)==0&false))) {{
                    __CLR4_4_1bgbgmn4dv0ph.R.inc(453);hasAllowedIINRange = true;
                    __CLR4_4_1bgbgmn4dv0ph.R.inc(454);break;
                }
            }}
        }}

        }__CLR4_4_1bgbgmn4dv0ph.R.inc(455);return hasAllowedIINRange;
    }finally{__CLR4_4_1bgbgmn4dv0ph.R.flushNeeded();}}
}
