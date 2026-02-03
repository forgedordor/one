package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eliv extends evsn implements evui {
    public static final eliv a;
    private static volatile evuo f;
    public int b;
    public int c = 0;
    public Object d;
    public ennd e;

    static {
        eliv elivVar = new eliv();
        a = elivVar;
        evsn.registerDefaultInstance(eliv.class, elivVar);
    }

    private eliv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000f\u0001\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000fဉ\u0000", new Object[]{"d", "c", "b", emsm.class, emon.class, emrk.class, emrv.class, emzl.class, emzj.class, emzn.class, emsb.class, emrx.class, enlh.class, enlk.class, enla.class, emzp.class, emse.class, "e"});
        }
        if (iOrdinal == 3) {
            return new eliv();
        }
        if (iOrdinal == 4) {
            return new eliu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eliv.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
