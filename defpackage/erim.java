package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erim extends evsn implements evui {
    public static final erim a;
    private static volatile evuo c;
    public int b;

    static {
        erim erimVar = new erim();
        a = erimVar;
        evsn.registerDefaultInstance(erim.class, erimVar);
    }

    private erim() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new erim();
        }
        if (iOrdinal == 4) {
            return new eril();
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
        synchronized (erim.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
