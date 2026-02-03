package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyvg extends evsn implements evui {
    public static final eyvg a;
    private static volatile evuo c;
    public int b;

    static {
        eyvg eyvgVar = new eyvg();
        a = eyvgVar;
        evsn.registerDefaultInstance(eyvg.class, eyvgVar);
    }

    private eyvg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new eyvg();
        }
        if (iOrdinal == 4) {
            return new eyvf();
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
        synchronized (eyvg.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
