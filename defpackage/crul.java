package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crul extends evsn implements evui {
    public static final crul a;
    private static volatile evuo e;
    public int b;
    public float c;
    public int d;

    static {
        crul crulVar = new crul();
        a = crulVar;
        evsn.registerDefaultInstance(crul.class, crulVar);
    }

    private crul() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0001\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new crul();
        }
        if (iOrdinal == 4) {
            return new cruj();
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
        synchronized (crul.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
