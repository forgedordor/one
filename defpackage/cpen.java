package defpackage;

import android.net.Uri;
import java.math.BigInteger;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpen {
    public final eosc d;
    private final cpez f;
    private static final cczv e = cdag.p(178320754);
    public static final Pattern a = Pattern.compile("\\/maps\\/place\\/(.*?)\\/");
    public static final Pattern b = Pattern.compile("\\/maps\\/place\\/@\\/data=!4m2!3m1!1s(.*)");
    public static final BigInteger c = BigInteger.valueOf(2).pow(64).add(BigInteger.valueOf(-1));

    public cpen(eosc eoscVar, cpez cpezVar) {
        this.f = cpezVar;
        this.d = eoscVar;
    }

    public static String b(Uri uri, String str) {
        return !((Boolean) e.e()).booleanValue() ? uri.getQueryParameter(str) : uri.isHierarchical() ? uri.getQueryParameter(str) : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(String str, ezbc ezbcVar) {
        List listI = ejxk.b(':').f().i(str);
        if (listI.size() == 2 && ((String) listI.get(0)).startsWith("0x") && ((String) listI.get(1)).startsWith("0x")) {
            try {
                BigInteger bigInteger = new BigInteger(((String) listI.get(0)).substring(2), 16);
                if (bigInteger.signum() >= 0) {
                    BigInteger bigInteger2 = c;
                    if (bigInteger.compareTo(bigInteger2) <= 0) {
                        BigInteger bigInteger3 = new BigInteger(((String) listI.get(1)).substring(2), 16);
                        if (bigInteger3.signum() >= 0 && bigInteger3.compareTo(bigInteger2) <= 0) {
                            ezes ezesVar = (ezes) ezet.a.createBuilder();
                            exbd exbdVar = (exbd) exbe.a.createBuilder();
                            esxj esxjVar = (esxj) esxk.a.createBuilder();
                            long jLongValue = bigInteger.longValue();
                            esxjVar.copyOnWrite();
                            esxk esxkVar = (esxk) esxjVar.instance;
                            esxkVar.b |= 1;
                            esxkVar.c = jLongValue;
                            long jLongValue2 = bigInteger3.longValue();
                            esxjVar.copyOnWrite();
                            esxk esxkVar2 = (esxk) esxjVar.instance;
                            esxkVar2.b = 2 | esxkVar2.b;
                            esxkVar2.d = jLongValue2;
                            exbdVar.copyOnWrite();
                            exbe exbeVar = (exbe) exbdVar.instance;
                            esxk esxkVar3 = (esxk) esxjVar.build();
                            esxkVar3.getClass();
                            exbeVar.c = esxkVar3;
                            exbeVar.b |= 1;
                            String strA = eusb.a((exbe) exbdVar.build());
                            ezesVar.copyOnWrite();
                            ((ezet) ezesVar.instance).e = strA;
                            ezbcVar.copyOnWrite();
                            ezbd ezbdVar = (ezbd) ezbcVar.instance;
                            ezet ezetVar = (ezet) ezesVar.build();
                            ezbd ezbdVar2 = ezbd.a;
                            ezetVar.getClass();
                            ezbdVar.e = ezetVar;
                            ezbdVar.b |= 4;
                            return true;
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public final eiju a(final String str, final ezbc ezbcVar) throws NumberFormatException {
        List listI = ejxk.b(',').f().i(str);
        if (listI.size() == 2) {
            try {
                double d = Double.parseDouble((String) listI.get(0));
                double d2 = Double.parseDouble((String) listI.get(1));
                ezes ezesVar = (ezes) ezet.a.createBuilder();
                eybf eybfVar = (eybf) eybg.a.createBuilder();
                eybfVar.copyOnWrite();
                ((eybg) eybfVar.instance).b = d;
                eybfVar.copyOnWrite();
                ((eybg) eybfVar.instance).c = d2;
                ezesVar.copyOnWrite();
                ezet ezetVar = (ezet) ezesVar.instance;
                eybg eybgVar = (eybg) eybfVar.build();
                eybgVar.getClass();
                ezetVar.d = eybgVar;
                ezetVar.b |= 1;
                ezbcVar.copyOnWrite();
                ezbd ezbdVar = (ezbd) ezbcVar.instance;
                ezet ezetVar2 = (ezet) ezesVar.build();
                ezbd ezbdVar2 = ezbd.a;
                ezetVar2.getClass();
                ezbdVar.e = ezetVar2;
                ezbdVar.b |= 4;
                return eijx.e(true);
            } catch (NumberFormatException unused) {
            }
        }
        return this.f.b(str).h(new ejvr() { // from class: cpem
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ezds ezdsVar = (ezds) obj;
                Pattern pattern = cpen.a;
                if (ezdsVar == null) {
                    return false;
                }
                ezev ezevVar = (ezdsVar.c == 7 ? (ezbd) ezdsVar.d : ezbd.a).c;
                if (ezevVar == null) {
                    ezevVar = ezev.a;
                }
                String str2 = str;
                ezbc ezbcVar2 = ezbcVar;
                ezbcVar2.copyOnWrite();
                ezbd ezbdVar3 = (ezbd) ezbcVar2.instance;
                ezevVar.getClass();
                ezbdVar3.c = ezevVar;
                ezbdVar3.b |= 1;
                ezes ezesVar2 = (ezes) ezet.a.createBuilder();
                ezesVar2.copyOnWrite();
                ezet ezetVar3 = (ezet) ezesVar2.instance;
                str2.getClass();
                ezetVar3.c = str2;
                ezbcVar2.copyOnWrite();
                ezbd ezbdVar4 = (ezbd) ezbcVar2.instance;
                ezet ezetVar4 = (ezet) ezesVar2.build();
                ezetVar4.getClass();
                ezbdVar4.e = ezetVar4;
                ezbdVar4.b |= 4;
                return true;
            }
        }, this.d);
    }
}
