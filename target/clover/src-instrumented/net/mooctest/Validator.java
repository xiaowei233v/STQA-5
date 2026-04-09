/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import net.mooctest.DateParser;

import static net.mooctest.DateChecker.*;

/*
 * Validator used to consume credit card number, expiration
 * date & CVV for validation
 */
public class Validator {public static class __CLR4_4_1h6h6mn4dv0qe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004e\u004a\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0072\u0065\u0064\u0069\u0074\u002d\u0043\u0061\u0072\u0064\u002d\u0056\u0061\u006c\u0069\u0064\u0061\u0074\u006f\u0072\u005f\u0031\u0037\u0036\u0033\u0032\u0030\u0036\u0036\u0037\u0034\u0033\u0037\u0032\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1774342750329L,8589935092L,656,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String creditCardNumber;
    private StringBuilder expirationDate;
    private Integer expirationYear;
    private Integer expirationMonth;
    private String CVV;

    /*
     * @param String representation of credit card number
     */
    public Validator(String creditCardNumber) {try{__CLR4_4_1h6h6mn4dv0qe.R.inc(618);
        __CLR4_4_1h6h6mn4dv0qe.R.inc(619);this.creditCardNumber = creditCardNumber;
    }finally{__CLR4_4_1h6h6mn4dv0qe.R.flushNeeded();}}

    /*
     * @param String representation of credit card number,
     * expiration date & CVV
     */
    public Validator(String creditCardNumber, String expirationDate, String CVV) {try{__CLR4_4_1h6h6mn4dv0qe.R.inc(620);
        __CLR4_4_1h6h6mn4dv0qe.R.inc(621);this.creditCardNumber = creditCardNumber;
        __CLR4_4_1h6h6mn4dv0qe.R.inc(622);this.expirationDate = DateParser.parseDate(convertDate(expirationDate));
        __CLR4_4_1h6h6mn4dv0qe.R.inc(623);this.CVV = CVV;
        __CLR4_4_1h6h6mn4dv0qe.R.inc(624);setExpirationMonth();
        __CLR4_4_1h6h6mn4dv0qe.R.inc(625);setExpirationYear();
    }finally{__CLR4_4_1h6h6mn4dv0qe.R.flushNeeded();}}

    /*
     * Set expiration year
     */
    public void setExpirationYear() {try{__CLR4_4_1h6h6mn4dv0qe.R.inc(626);
        __CLR4_4_1h6h6mn4dv0qe.R.inc(627);this.expirationYear = DateParser.parseDate(expirationDate, 2, 4);
    }finally{__CLR4_4_1h6h6mn4dv0qe.R.flushNeeded();}}

    /*
     * Set expiration month
     */
    public void setExpirationMonth() {try{__CLR4_4_1h6h6mn4dv0qe.R.inc(628);
        __CLR4_4_1h6h6mn4dv0qe.R.inc(629);this.expirationMonth = DateParser.parseDate(expirationDate, 0, 2);
    }finally{__CLR4_4_1h6h6mn4dv0qe.R.flushNeeded();}}

    /*
     * Validate credit card number using Luhn algorithm
     * @throws InvalidCardException if card does not pass
     * test.
     */
    public boolean validate() throws InvalidCardException {try{__CLR4_4_1h6h6mn4dv0qe.R.inc(630);
        __CLR4_4_1h6h6mn4dv0qe.R.inc(631);LuhnValidator luhnValidator = new LuhnValidator();
        __CLR4_4_1h6h6mn4dv0qe.R.inc(632);boolean isValid = luhnValidator.validate(creditCardNumber);

        __CLR4_4_1h6h6mn4dv0qe.R.inc(633);if ((((!isValid)&&(__CLR4_4_1h6h6mn4dv0qe.R.iget(634)!=0|true))||(__CLR4_4_1h6h6mn4dv0qe.R.iget(635)==0&false))) {{
            __CLR4_4_1h6h6mn4dv0qe.R.inc(636);throw new InvalidCardException("This card isn't invalid");
        }

        }__CLR4_4_1h6h6mn4dv0qe.R.inc(637);return isValid;
    }finally{__CLR4_4_1h6h6mn4dv0qe.R.flushNeeded();}}

    /*
     * @return boolean of whether or not the CVV matches
     * the appropriate length
     */
    public boolean checkCVV() {try{__CLR4_4_1h6h6mn4dv0qe.R.inc(638);
        __CLR4_4_1h6h6mn4dv0qe.R.inc(639);boolean isValid = false;

        __CLR4_4_1h6h6mn4dv0qe.R.inc(640);if ((((CVV.length() == 3 || CVV.length() == 4)&&(__CLR4_4_1h6h6mn4dv0qe.R.iget(641)!=0|true))||(__CLR4_4_1h6h6mn4dv0qe.R.iget(642)==0&false))) {{
            __CLR4_4_1h6h6mn4dv0qe.R.inc(643);isValid = true;
        }

        }__CLR4_4_1h6h6mn4dv0qe.R.inc(644);return isValid;
    }finally{__CLR4_4_1h6h6mn4dv0qe.R.flushNeeded();}}

    /*
     * @return boolean of whether or not the card is expired
     */
    public boolean checkExpirationDate() {try{__CLR4_4_1h6h6mn4dv0qe.R.inc(645);
        __CLR4_4_1h6h6mn4dv0qe.R.inc(646);boolean isValid = false;

        __CLR4_4_1h6h6mn4dv0qe.R.inc(647);if ((((compareDates(expirationYear, CURRENT_YEAR))&&(__CLR4_4_1h6h6mn4dv0qe.R.iget(648)!=0|true))||(__CLR4_4_1h6h6mn4dv0qe.R.iget(649)==0&false))) {{
            __CLR4_4_1h6h6mn4dv0qe.R.inc(650);isValid = true;
        } }else {__CLR4_4_1h6h6mn4dv0qe.R.inc(651);if ((((compareDates(expirationMonth, CURRENT_MONTH))&&(__CLR4_4_1h6h6mn4dv0qe.R.iget(652)!=0|true))||(__CLR4_4_1h6h6mn4dv0qe.R.iget(653)==0&false))){{
            __CLR4_4_1h6h6mn4dv0qe.R.inc(654);isValid = true;
        }

        }}__CLR4_4_1h6h6mn4dv0qe.R.inc(655);return isValid;
    }finally{__CLR4_4_1h6h6mn4dv0qe.R.flushNeeded();}}
}
