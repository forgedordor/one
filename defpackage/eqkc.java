package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqkc extends evsn implements evui {
    public static final eqkc a;
    private static volatile evuo e;
    public int b;
    public eqny c;
    public eqnd d;

    static {
        eqkc eqkcVar = new eqkc();
        a = eqkcVar;
        evsn.registerDefaultInstance(eqkc.class, eqkcVar);
    }

    private eqkc() {
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
            return new eqkc();
        }
        if (iOrdinal == 4) {
            return new eqkb();
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
        synchronized (eqkc.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
