package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezgi extends evsn implements evui {
    public static final ezgi a;
    private static volatile evuo g;
    public int b;
    public int c = 0;
    public Object d;
    public ezgg e;
    public int f;

    static {
        ezgi ezgiVar = new ezgi();
        a = ezgiVar;
        evsn.registerDefaultInstance(ezgi.class, ezgiVar);
    }

    private ezgi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u001f\u0001\u0001\u0002 \u001f\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\bဉ\u0000\t<\u0000\n\f\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001c<\u0000\u001d<\u0000\u001e<\u0000\u001f<\u0000 <\u0000", new Object[]{"d", "c", "b", ezgk.class, ezfx.class, ezen.class, ezdc.class, ezbs.class, ezbj.class, "e", ezgo.class, "f", ezbu.class, ezff.class, ezcr.class, ezcn.class, ezfp.class, ezft.class, ezfv.class, ezei.class, ezbn.class, ezfz.class, ezhe.class, ezbl.class, ezeg.class, ezcv.class, ezfl.class, ezgq.class, ezfn.class, ezfr.class, ezbw.class, ezea.class, ezel.class, ezfd.class});
        }
        if (iOrdinal == 3) {
            return new ezgi();
        }
        if (iOrdinal == 4) {
            return new ezgh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezgi.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
