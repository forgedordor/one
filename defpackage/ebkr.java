package defpackage;

import j$.util.Objects;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebkr {
    public static final eblv a(ebma ebmaVar) {
        eblv eblvVar = new eblv();
        eblvVar.b = ebmaVar;
        return eblvVar;
    }

    public static final eblv b(String str) {
        if (str.equals("*")) {
            eblv eblvVar = new eblv();
            eblvVar.c = 3;
            return eblvVar;
        }
        ebpx ebpxVar = new ebpx();
        ebpxVar.a = new ebpu("charLexer", str);
        return ebpg.b(true, ebpxVar);
    }

    public static final eblx c(String str, int i, String str2) throws ebml {
        eblx eblxVar = new eblx();
        ebme ebmeVar = new ebme(str);
        eblxVar.a = new eblw();
        eblw eblwVar = eblxVar.a;
        if (eblwVar.a == null) {
            eblwVar.a = new ebmg();
        }
        eblwVar.a.a = ebmeVar;
        eblxVar.i(i);
        ebmj ebmjVar = new ebmj("lr", null);
        eblxVar.b.i("lr");
        eblxVar.b.e(ebmjVar);
        eblxVar.j(str2);
        return eblxVar;
    }

    public static final ebma d(String str) {
        if (str == null) {
            throw new NullPointerException("null arg");
        }
        try {
            ebqi ebqiVar = new ebqi(str);
            Vector vectorG = ebqiVar.a.g(1);
            String str2 = vectorG.size() == 0 ? null : ((ebmq) vectorG.elementAt(0)).a;
            if (str2 != null) {
                return str2.equalsIgnoreCase("sip") ? ebqiVar.b() : str2.equalsIgnoreCase("sips") ? ebqiVar.b() : str2.equalsIgnoreCase("tel") ? ebqiVar.d() : new ebma(str);
            }
            throw new ebml("bad scheme");
        } catch (ebml e) {
            throw new ebml(Objects.toString(e.getMessage(), "Problems parsing URI"));
        }
    }

    public static final eblx e(String str) throws ebml {
        if (str == null) {
            throw new NullPointerException("null URI");
        }
        try {
            return g(str);
        } catch (ebml e) {
            throw new ebml(Objects.toString(e.getMessage(), "Problems parsing SIP URI"));
        }
    }

    public static final eblx f(String str, boolean z, String str2, String str3) throws ebml {
        if (str != null && !z) {
            return e(str);
        }
        if (str3 == null) {
            throw new NullPointerException("null host");
        }
        StringBuffer stringBuffer = new StringBuffer("sip:");
        if (str2 != null) {
            stringBuffer.append(str2);
            stringBuffer.append("@");
        }
        if (str3.indexOf(58) != str3.lastIndexOf(58) && str3.trim().charAt(0) != '[') {
            str3 = a.a(str3, "[", "]");
        }
        stringBuffer.append(str3);
        try {
            return g(stringBuffer.toString());
        } catch (ebml e) {
            throw new ebml(Objects.toString(e.getMessage(), "Problems parsing SIP URI"));
        }
    }

    private static final eblx g(String str) throws ebml {
        try {
            return (eblx) new ebqi(str).e();
        } catch (ClassCastException unused) {
            throw new ebml(str.concat(" Not a SIP URL "));
        }
    }
}
