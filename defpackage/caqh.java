package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caqh extends evsn implements evui {
    public static final caqh a;
    private static volatile evuo d;
    public int b;
    public long c;

    static {
        caqh caqhVar = new caqh();
        a = caqhVar;
        evsn.registerDefaultInstance(caqh.class, caqhVar);
    }

    private caqh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0002", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new caqh();
        }
        if (iOrdinal == 4) {
            return new caqg();
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
        synchronized (caqh.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
