package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dibt extends evsn implements evui {
    public static final dibt a;
    private static volatile evuo f;
    public int b;
    public long c;
    public long d;
    public int e;

    static {
        dibt dibtVar = new dibt();
        a = dibtVar;
        evsn.registerDefaultInstance(dibt.class, dibtVar);
    }

    private dibt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new dibt();
        }
        if (iOrdinal == 4) {
            return new dibs();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dibt.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
