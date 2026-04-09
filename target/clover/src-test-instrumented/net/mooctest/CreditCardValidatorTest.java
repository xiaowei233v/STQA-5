/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * \u5bee\ufffd\u9359\u6223\ufffd\u546d\u4edb\u68f0\u6a3a\u58a0\u951b\u5c83\ue1ec\u6d60\u65c2\u7c8f\u95c3\u5470\ue1f0\u6d60\u30e4\u7b05\u7487\u5b58\u69d1\u951b\ufffd
 * 
 * 1\u9286\u4f7d\ue1da\u5a34\u5b2d\u762f\u7eeb\u8bb3\u8d1f\u5a34\u5b2d\u762f\u7eeb\u8364\u305a\u6e1a\u5b36\u7d1d\u6d93\u5d88\ue6e6\u59f9\u509a\u756c\u934f\u3126\u5bdc\u9413\u0446\ue1da\u7ec0\u8f70\u7de5\u7eeb\u8364\u6b91\u93cd\u714e\u7d21\u951b\ufffd
 *	    \u9470\u51aa\u6553\u9359\ue21d\u569c\u741b\u5c7d\u57b1\u5be4\u70d8\u7974\u7487\u66e0\u88ab\u951b\u5c80\u88ab\u935a\u5d85\u5f72\u9477\ue047\ue511\u7039\u6c2b\u7b9f\u951b\u5c7c\u7d7e\u95c7\ufffd\u95ac\u975b\u60caJUnit\u935b\u85c9\u6095\u7459\u52ee\u5bd6\u951b\u5c7e\u7278\u5bee\u5fce\u8d1fxxxTest.java\u951b\u5c7e\u5f41\u6d5c\u3087\u88ab\u6d7c\u7d05est.java\u9428\u52ec\u6783\u6d60\u8dfa\u6095\u704f\u55d7\u6d1c\u6d93\u5d87\ue0c1\u935a\u5823\ue1e2\u5a09\u66e1\ufffd\u5c7d\u57bd0\u9352\u55ed\u7d12
 * 
 * 2\u9286\u4f79\u588d\u93c8\u590b\u7974\u7487\u66df\u67df\u5a09\u66df\u6581\u9366\u3128\ue1da\u6924\u8dfa\u7730\u7eeb\u8bb3\u8151\u951b\u5c7c\u7b09\u5be4\u9e3f\ue185\u9350\u5d85\u57b1\u5be4\u54c4\u5534\u95ae\u3127\u88ab\u9286\u509d\u5ae2\u8e47\u5474\u6e36\u9352\u6d98\u7f13\u9350\u5474\u5134\u7eeb\u4f19\u7d1d\u9352\u6b13\u6e36\u59ab\ufffd\u93cc\ue650Unit\u7035\u901b\u7c2c\u9350\u5474\u5134\u5a34\u5b2d\u762f\u7eeb\u8364\u6b91\u7455\u4f79\u7730\u951b\u5c7d\u82df\u5a23\u8bf2\u59de\u9429\u7a3f\u53e7\u5a09\u3129\u5674\u951b\u5c7d\u60c1\u9352\u6b0f\u76a2\u9365\u72b3\u68e4\u5a09\u66df\u58bd\u741b\u5c83\ufffd\u5c7d\u57bd0\u9352\u55ed\u7d12
 * 
 * 3\u9286\u4f79\u6e70\u59e3\u65c7\u798c\u6d63\u8de8\u6564jdk1.8+JUnit4\u951b\u5c7e\u6e6d\u6d63\u8de8\u6564\u6d60\u30e4\u7b02\u9417\u581f\u6e70\u7f02\u6827\u5553\u5a34\u5b2d\u762f\u9422\u3124\u7de5\u9470\u5483\u7d1d\u6d93\u5d85\u5540\u93ba\u30e5\u5f48\u6d63\u5ea1\u578e\u9422\u5ba0\u7614\u951b\ufffd
 * 
 * 4\u9286\u4f77\u7b09\u7455\u4f77\u6168\u93c0\u7845\ue766\u5a34\u5b29\u552c\u942e\u4f8a\u7d31
 * 
 * 5\u9286\u4f78\u7f13\u7481\ue1bc\u6556\u95b2\u5fdb\u4f29\u934f\u5d85\u5d31\u9410\u89c4\u5f41\u6d5c\u3087\u74df\u5997\u582c\u7d1d\u704f\u3085\u53fe\u93c4\ue219\u88b1\u6d60\u82a5\u59e4\u935b\u5a44\u6b91zip\u9356\u546b\ufffd\ufffd
 * 
 * */

public class CreditCardValidatorTest {static class __CLR4_4_1k7k7mn4dv0sd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004e\u004a\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0072\u0065\u0064\u0069\u0074\u002d\u0043\u0061\u0072\u0064\u002d\u0056\u0061\u006c\u0069\u0064\u0061\u0074\u006f\u0072\u005f\u0031\u0037\u0036\u0033\u0032\u0030\u0036\u0036\u0037\u0034\u0033\u0037\u0032\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1774342750905L,8589935092L,732,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {try{__CLR4_4_1k7k7mn4dv0sd.R.inc(727);
	}finally{__CLR4_4_1k7k7mn4dv0sd.R.flushNeeded();}}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {try{__CLR4_4_1k7k7mn4dv0sd.R.inc(728);
	}finally{__CLR4_4_1k7k7mn4dv0sd.R.flushNeeded();}}

	@Before
	public void setUp() throws Exception {try{__CLR4_4_1k7k7mn4dv0sd.R.inc(729);
	}finally{__CLR4_4_1k7k7mn4dv0sd.R.flushNeeded();}}

	@After
	public void tearDown() throws Exception {try{__CLR4_4_1k7k7mn4dv0sd.R.inc(730);
	}finally{__CLR4_4_1k7k7mn4dv0sd.R.flushNeeded();}}

	@Test
	public void test() {__CLR4_4_1k7k7mn4dv0sd.R.globalSliceStart(getClass().getName(),731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3kb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k7k7mn4dv0sd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k7k7mn4dv0sd.R.globalSliceEnd(getClass().getName(),"net.mooctest.CreditCardValidatorTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3kb(){try{__CLR4_4_1k7k7mn4dv0sd.R.inc(731);
		
	}finally{__CLR4_4_1k7k7mn4dv0sd.R.flushNeeded();}}

}
