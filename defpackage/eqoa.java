package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqoa extends evsn implements evui {
    public static final eqoa a;
    private static volatile evuo d;
    public int b;
    public eqny c;

    static {
        eqoa eqoaVar = new eqoa();
        a = eqoaVar;
        evsn.registerDefaultInstance(eqoa.class, eqoaVar);
    }

    private eqoa() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001ϧϧ\u0001\u0000\u0000\u0000ϧဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eqoa();
        }
        if (iOrdinal == 4) {
            return new eqnz();
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
        synchronized (eqoa.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
