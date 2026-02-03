package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fema extends evsn implements evui {
    public static final fema a;
    private static volatile evuo d;
    public int b;
    public eyar c;

    static {
        fema femaVar = new fema();
        a = femaVar;
        evsn.registerDefaultInstance(fema.class, femaVar);
    }

    private fema() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new fema();
        }
        if (iOrdinal == 4) {
            return new felz();
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
        synchronized (fema.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
