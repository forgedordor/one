package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgvx extends evsn implements evui {
    public static final cgvx a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        cgvx cgvxVar = new cgvx();
        a = cgvxVar;
        evsn.registerDefaultInstance(cgvx.class, cgvxVar);
    }

    private cgvx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0001\u0000eh\u0004\u0000\u0000\u0000e<\u0000f<\u0000g<\u0000h<\u0000", new Object[]{"c", "b", cgvw.class, cgvu.class, cgvq.class, cgvs.class});
        }
        if (iOrdinal == 3) {
            return new cgvx();
        }
        if (iOrdinal == 4) {
            return new cgvo();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cgvx.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
