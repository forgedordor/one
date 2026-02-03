package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evlf extends evsn implements evui {
    public static final evlf a;
    private static volatile evuo e;
    public int b;
    public evsx c = emptyIntList();
    public int d;

    static {
        evlf evlfVar = new evlf();
        a = evlfVar;
        evsn.registerDefaultInstance(evlf.class, evlfVar);
    }

    private evlf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001'\u0002᠌\u0000", new Object[]{"b", "c", "d", evlc.a});
        }
        if (iOrdinal == 3) {
            return new evlf();
        }
        if (iOrdinal == 4) {
            return new evle();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evlf.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
