package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqks extends evsn implements evui {
    public static final eqks a;
    private static volatile evuo e;
    public int b;
    public eqny c;
    public evrw d;

    static {
        eqks eqksVar = new eqks();
        a = eqksVar;
        evsn.registerDefaultInstance(eqks.class, eqksVar);
    }

    private eqks() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0000\u0000\u0001ဉ\u0001ϧဉ\u0000", new Object[]{"b", "d", "c"});
        }
        if (iOrdinal == 3) {
            return new eqks();
        }
        if (iOrdinal == 4) {
            return new eqkr();
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
        synchronized (eqks.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
