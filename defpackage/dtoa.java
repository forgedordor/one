package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtoa extends evsn implements evui {
    public static final dtoa a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        dtoa dtoaVar = new dtoa();
        a = dtoaVar;
        evsn.registerDefaultInstance(dtoa.class, dtoaVar);
    }

    private dtoa() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", dtnz.a, "d", dtny.a});
        }
        if (iOrdinal == 3) {
            return new dtoa();
        }
        if (iOrdinal == 4) {
            return new dtnx();
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
        synchronized (dtoa.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
