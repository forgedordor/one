package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbwe {
    public static final cfre a(cbwd cbwdVar) {
        cbwdVar.getClass();
        int i = cbwdVar.c;
        if (i == 2) {
            aubq aubqVar = ((aufh) cbwdVar.d).h;
            if (aubqVar == null) {
                aubqVar = aubq.a;
            }
            return new cfre(aubqVar.d);
        }
        if (i != 6) {
            throw new IllegalStateException("No transport context in the MLS context.");
        }
        ccps ccpsVar = ((cbug) cbwdVar.d).c;
        if (ccpsVar == null) {
            ccpsVar = ccps.a;
        }
        return new cfre(ccpsVar.b);
    }

    public static final ezol b(cbwd cbwdVar) {
        cbwdVar.getClass();
        int i = cbwdVar.c;
        if (i != 2) {
            if (i != 6) {
                throw new IllegalStateException("No transport context in the MLS context. ".concat(String.valueOf(cbwdVar.e)));
            }
            ezol ezolVar = ((cbug) cbwdVar.d).d;
            if (ezolVar == null) {
                ezolVar = ezol.a;
            }
            ezolVar.getClass();
            return ezolVar;
        }
        aufh aufhVar = (aufh) cbwdVar.d;
        aufhVar.getClass();
        String str = aufhVar.k;
        str.getClass();
        if (str.length() > 0) {
            ezok ezokVar = (ezok) ezol.a.createBuilder();
            ezokVar.getClass();
            eymt.b("RCS", ezokVar);
            eymt.d(felm.GROUP_ID, ezokVar);
            String str2 = aufhVar.k;
            str2.getClass();
            eymt.c(str2, ezokVar);
            return eymt.a(ezokVar);
        }
        ezok ezokVar2 = (ezok) ezol.a.createBuilder();
        ezokVar2.getClass();
        eymt.b("RCS", ezokVar2);
        eymt.d(felm.PHONE_NUMBER, ezokVar2);
        aubq aubqVar = aufhVar.d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        String str3 = aubqVar.d;
        str3.getClass();
        eymt.c(str3, ezokVar2);
        return eymt.a(ezokVar2);
    }
}
