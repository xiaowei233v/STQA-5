/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import net.mooctest.CreditCardType;


/*
 * Type checker checking against the most common
 * credit card types: VISA, AMERICAN EXPXRESS,
 * DISCOVER & MASTERCARD.
 */
public class TypeChecker {public static class __CLR4_4_1fkfkmn4dv0q5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004e\u004a\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0072\u0065\u0064\u0069\u0074\u002d\u0043\u0061\u0072\u0064\u002d\u0056\u0061\u006c\u0069\u0064\u0061\u0074\u006f\u0072\u005f\u0031\u0037\u0036\u0033\u0032\u0030\u0036\u0036\u0037\u0034\u0033\u0037\u0032\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1774342750329L,8589935092L,600,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /*
     * @param a String representation of the credit card number
     * @return CreditCardType enumerable
     */
    public static CreditCardType checkType(String creditCardNumber) {try{__CLR4_4_1fkfkmn4dv0q5.R.inc(560);
        __CLR4_4_1fkfkmn4dv0q5.R.inc(561);CreditCardType type = null;

        // Instantiate credit card validators and set type on match
        __CLR4_4_1fkfkmn4dv0q5.R.inc(562);while ((((type == null)&&(__CLR4_4_1fkfkmn4dv0q5.R.iget(563)!=0|true))||(__CLR4_4_1fkfkmn4dv0q5.R.iget(564)==0&false))) {{
            __CLR4_4_1fkfkmn4dv0q5.R.inc(565);boolean isThisType;

            __CLR4_4_1fkfkmn4dv0q5.R.inc(566);VisaValidator visaValidator = new VisaValidator(creditCardNumber);
            __CLR4_4_1fkfkmn4dv0q5.R.inc(567);isThisType = visaValidator.validate();

            __CLR4_4_1fkfkmn4dv0q5.R.inc(568);if ((((isThisType)&&(__CLR4_4_1fkfkmn4dv0q5.R.iget(569)!=0|true))||(__CLR4_4_1fkfkmn4dv0q5.R.iget(570)==0&false))) {{
                __CLR4_4_1fkfkmn4dv0q5.R.inc(571);type = CreditCardType.VISA;
                __CLR4_4_1fkfkmn4dv0q5.R.inc(572);break;
            }

            }__CLR4_4_1fkfkmn4dv0q5.R.inc(573);AmericanExpressValidator americanExpressValidator = new AmericanExpressValidator(creditCardNumber);
            __CLR4_4_1fkfkmn4dv0q5.R.inc(574);isThisType = americanExpressValidator.validate();

            __CLR4_4_1fkfkmn4dv0q5.R.inc(575);if ((((isThisType)&&(__CLR4_4_1fkfkmn4dv0q5.R.iget(576)!=0|true))||(__CLR4_4_1fkfkmn4dv0q5.R.iget(577)==0&false))) {{
                __CLR4_4_1fkfkmn4dv0q5.R.inc(578);type = CreditCardType.AMERICAN_EXPRESS;
                __CLR4_4_1fkfkmn4dv0q5.R.inc(579);break;
            }

            }__CLR4_4_1fkfkmn4dv0q5.R.inc(580);MasterCardValidator masterCardValidator = new MasterCardValidator(creditCardNumber);
            __CLR4_4_1fkfkmn4dv0q5.R.inc(581);isThisType = masterCardValidator.validate();

            __CLR4_4_1fkfkmn4dv0q5.R.inc(582);if ((((isThisType)&&(__CLR4_4_1fkfkmn4dv0q5.R.iget(583)!=0|true))||(__CLR4_4_1fkfkmn4dv0q5.R.iget(584)==0&false))) {{
                __CLR4_4_1fkfkmn4dv0q5.R.inc(585);type = CreditCardType.MASTERCARD;
                __CLR4_4_1fkfkmn4dv0q5.R.inc(586);break;
            }

            }__CLR4_4_1fkfkmn4dv0q5.R.inc(587);DiscoverValidator discoverValidator = new DiscoverValidator(creditCardNumber);
            __CLR4_4_1fkfkmn4dv0q5.R.inc(588);isThisType = discoverValidator.validate();

            __CLR4_4_1fkfkmn4dv0q5.R.inc(589);if ((((isThisType)&&(__CLR4_4_1fkfkmn4dv0q5.R.iget(590)!=0|true))||(__CLR4_4_1fkfkmn4dv0q5.R.iget(591)==0&false))) {{
                __CLR4_4_1fkfkmn4dv0q5.R.inc(592);type = CreditCardType.DISCOVER;
                __CLR4_4_1fkfkmn4dv0q5.R.inc(593);break;
            }

            // If credit card type does not match, mark as "other"
            }__CLR4_4_1fkfkmn4dv0q5.R.inc(594);if ((((type == null)&&(__CLR4_4_1fkfkmn4dv0q5.R.iget(595)!=0|true))||(__CLR4_4_1fkfkmn4dv0q5.R.iget(596)==0&false))) {{
                __CLR4_4_1fkfkmn4dv0q5.R.inc(597);type = CreditCardType.OTHER;
                __CLR4_4_1fkfkmn4dv0q5.R.inc(598);break;
            }

        }}

        }__CLR4_4_1fkfkmn4dv0q5.R.inc(599);return type;
    }finally{__CLR4_4_1fkfkmn4dv0q5.R.flushNeeded();}}
}
