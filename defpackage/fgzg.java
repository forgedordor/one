package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgzg {
    private static final fgyj a;
    private static final fgyj b;

    static {
        fgyj fgyjVar = new fgyj("DNS Rcode", 2);
        a = fgyjVar;
        fgyj fgyjVar2 = new fgyj("TSIG rcode", 2);
        b = fgyjVar2;
        fgyjVar.e = 4095;
        fgyjVar.f("RESERVED");
        fgyjVar.d(0, "NOERROR");
        fgyjVar.d(1, "FORMERR");
        fgyjVar.d(2, "SERVFAIL");
        fgyjVar.d(3, "NXDOMAIN");
        fgyjVar.d(4, "NOTIMP");
        fgyjVar.e(4, "NOTIMPL");
        fgyjVar.d(5, "REFUSED");
        fgyjVar.d(6, "YXDOMAIN");
        fgyjVar.d(7, "YXRRSET");
        fgyjVar.d(8, "NXRRSET");
        fgyjVar.d(9, "NOTAUTH");
        fgyjVar.d(10, "NOTZONE");
        fgyjVar.d(16, "BADVERS");
        fgyjVar2.e = 65535;
        fgyjVar2.f("RESERVED");
        if (fgyjVar2.d != fgyjVar.d) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(fgyjVar.c);
            stringBuffer.append(": wordcases do not match");
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        fgyjVar2.a.putAll(fgyjVar.a);
        fgyjVar2.b.putAll(fgyjVar.b);
        fgyjVar2.d(16, "BADSIG");
        fgyjVar2.d(17, "BADKEY");
        fgyjVar2.d(18, "BADTIME");
        fgyjVar2.d(19, "BADMODE");
    }

    public static String a(int i) {
        return b.c(i);
    }

    public static String b(int i) {
        return a.c(i);
    }
}
