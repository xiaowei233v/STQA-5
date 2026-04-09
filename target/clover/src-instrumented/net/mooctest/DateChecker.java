/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.Calendar;

import static net.mooctest.DateFormatter.*;

/*
 * Date checker used to validate expiration date against
 * current year and month
 */

public class DateChecker {public static class __CLR4_4_12w2wmn4dv0nq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004e\u004a\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0072\u0065\u0064\u0069\u0074\u002d\u0043\u0061\u0072\u0064\u002d\u0056\u0061\u006c\u0069\u0064\u0061\u0074\u006f\u0072\u005f\u0031\u0037\u0036\u0033\u0032\u0030\u0036\u0036\u0037\u0034\u0033\u0037\u0032\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1774342750329L,8589935092L,120,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /*
     * Set the current year and month for comparison values
     */
    public static final int CURRENT_YEAR = getCurrentYear();
    public static final int CURRENT_MONTH = getCurrentMonth();

    /*
     * @param accept expiration month/year, compare against
     * current month/year
     * @return boolean representing whether or not the card
     * s expired
     */
    public static boolean compareDates(int date, int currentDate) {try{__CLR4_4_12w2wmn4dv0nq.R.inc(104);
        __CLR4_4_12w2wmn4dv0nq.R.inc(105);boolean isValid = false;

        __CLR4_4_12w2wmn4dv0nq.R.inc(106);if ((((date > currentDate)&&(__CLR4_4_12w2wmn4dv0nq.R.iget(107)!=0|true))||(__CLR4_4_12w2wmn4dv0nq.R.iget(108)==0&false))) {{
            __CLR4_4_12w2wmn4dv0nq.R.inc(109);isValid = true;
        }

        }__CLR4_4_12w2wmn4dv0nq.R.inc(110);return isValid;
    }finally{__CLR4_4_12w2wmn4dv0nq.R.flushNeeded();}}

    /*
     * @param String representation of the expirationDate
     * @return expirationDate as a StringBuilder
     */
    public static StringBuilder convertDate(String expirationDate) {try{__CLR4_4_12w2wmn4dv0nq.R.inc(111);
        __CLR4_4_12w2wmn4dv0nq.R.inc(112);StringBuilder date = new StringBuilder(expirationDate);

        __CLR4_4_12w2wmn4dv0nq.R.inc(113);return date;
    }finally{__CLR4_4_12w2wmn4dv0nq.R.flushNeeded();}}

    /*
     * @return the current year
     */
    public static int getCurrentYear() {try{__CLR4_4_12w2wmn4dv0nq.R.inc(114);
        __CLR4_4_12w2wmn4dv0nq.R.inc(115);int currentYear = Integer.parseInt(yearFormat().format(Calendar.getInstance().getTime()));

        __CLR4_4_12w2wmn4dv0nq.R.inc(116);return currentYear;
    }finally{__CLR4_4_12w2wmn4dv0nq.R.flushNeeded();}}

    /*
     * @return the current month
     */
    public static int getCurrentMonth() {try{__CLR4_4_12w2wmn4dv0nq.R.inc(117);
        __CLR4_4_12w2wmn4dv0nq.R.inc(118);int currentMonth = Integer.parseInt(monthFormat().format(Calendar.getInstance().getTime()));

        __CLR4_4_12w2wmn4dv0nq.R.inc(119);return currentMonth;
    }finally{__CLR4_4_12w2wmn4dv0nq.R.flushNeeded();}}
}
