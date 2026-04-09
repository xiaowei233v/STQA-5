/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.List;

import static net.mooctest.CreditCardParser.*;

/*
 * JCB format:
 * length = 16
 * IIN range = 3528 - 3589
 */
public class JCBValidator extends CreditCardValidator {public static class __CLR4_4_18080mn4dv0ox{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004e\u004a\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0072\u0065\u0064\u0069\u0074\u002d\u0043\u0061\u0072\u0064\u002d\u0056\u0061\u006c\u0069\u0064\u0061\u0074\u006f\u0072\u005f\u0031\u0037\u0036\u0033\u0032\u0030\u0036\u0036\u0037\u0034\u0033\u0037\u0032\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1774342750329L,8589935092L,310,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private List<Integer> creditCardNumberList;

    /*
     * @param String representation of credit card number
     */
    public JCBValidator(String creditCardNumber) {try{__CLR4_4_18080mn4dv0ox.R.inc(288);
        __CLR4_4_18080mn4dv0ox.R.inc(289);creditCardNumberList = parseNumber(creditCardNumber);
    }finally{__CLR4_4_18080mn4dv0ox.R.flushNeeded();}}

    /*
     * Check the length of the card against the format
     * requirement.
     *
     * @return boolean of whether or not credit card
     * number meet requirement.
     */
    @Override
    boolean checkLength() {try{__CLR4_4_18080mn4dv0ox.R.inc(290);
        __CLR4_4_18080mn4dv0ox.R.inc(291);boolean hasAllowedLength = false;

        __CLR4_4_18080mn4dv0ox.R.inc(292);if ((((creditCardNumberList.size() == 16)&&(__CLR4_4_18080mn4dv0ox.R.iget(293)!=0|true))||(__CLR4_4_18080mn4dv0ox.R.iget(294)==0&false))) {{
            __CLR4_4_18080mn4dv0ox.R.inc(295);hasAllowedLength = true;
        }

        }__CLR4_4_18080mn4dv0ox.R.inc(296);return hasAllowedLength;
    }finally{__CLR4_4_18080mn4dv0ox.R.flushNeeded();}}

    /*
     * Check that IIN meets IIN range requirement
     *
     * @return boolean of whether or not IIN matches
     * requirement
     */
    @Override
    boolean checkIINRanges() {try{__CLR4_4_18080mn4dv0ox.R.inc(297);
        __CLR4_4_18080mn4dv0ox.R.inc(298);boolean hasAllowedIINRange = false;
        __CLR4_4_18080mn4dv0ox.R.inc(299);int[] IINRange = {3528, 3589};
        __CLR4_4_18080mn4dv0ox.R.inc(300);int IIN = parseIIN(creditCardNumberList, 4);

        __CLR4_4_18080mn4dv0ox.R.inc(301);for (int i = IINRange[0]; (((i <= IINRange[1])&&(__CLR4_4_18080mn4dv0ox.R.iget(302)!=0|true))||(__CLR4_4_18080mn4dv0ox.R.iget(303)==0&false)); i++) {{
            __CLR4_4_18080mn4dv0ox.R.inc(304);if ((((IIN == i)&&(__CLR4_4_18080mn4dv0ox.R.iget(305)!=0|true))||(__CLR4_4_18080mn4dv0ox.R.iget(306)==0&false))) {{
                __CLR4_4_18080mn4dv0ox.R.inc(307);hasAllowedIINRange = true;
                __CLR4_4_18080mn4dv0ox.R.inc(308);break;
            }
        }}

        }__CLR4_4_18080mn4dv0ox.R.inc(309);return hasAllowedIINRange;
    }finally{__CLR4_4_18080mn4dv0ox.R.flushNeeded();}}
}
