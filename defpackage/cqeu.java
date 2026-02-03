package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqeu extends evsn implements evui {
    public static final cqeu a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        cqeu cqeuVar = new cqeu();
        a = cqeuVar;
        evsn.registerDefaultInstance(cqeu.class, cqeuVar);
    }

    private cqeu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"b", "c", cqes.a, "d"});
        }
        if (iOrdinal == 3) {
            return new cqeu();
        }
        if (iOrdinal == 4) {
            return new cqer();
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
        synchronized (cqeu.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
