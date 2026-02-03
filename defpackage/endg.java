package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class endg extends evsn implements evui {
    public static final endg a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        endg endgVar = new endg();
        a = endgVar;
        evsn.registerDefaultInstance(endg.class, endgVar);
    }

    private endg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0000", new Object[]{"b", "c", ende.a});
        }
        if (iOrdinal == 3) {
            return new endg();
        }
        if (iOrdinal == 4) {
            return new endf();
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
        synchronized (endg.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
