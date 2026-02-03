package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawa extends evsn implements evui {
    public static final aawa a;
    private static volatile evuo c;
    public long b;

    static {
        aawa aawaVar = new aawa();
        a = aawaVar;
        evsn.registerDefaultInstance(aawa.class, aawaVar);
    }

    private aawa() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new aawa();
        }
        if (iOrdinal == 4) {
            return new aavz();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (aawa.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
