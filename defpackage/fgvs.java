package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgvs extends evsn implements evui {
    public static final fgvs a;
    private static volatile evuo c;
    public evsw b = emptyFloatList();

    static {
        fgvs fgvsVar = new fgvs();
        a = fgvsVar;
        evsn.registerDefaultInstance(fgvs.class, fgvsVar);
    }

    private fgvs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new fgvs();
        }
        if (iOrdinal == 4) {
            return new fgvr();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (fgvs.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
