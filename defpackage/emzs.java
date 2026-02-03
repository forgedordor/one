package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emzs extends evsn implements evui {
    public static final emzs a;
    private static volatile evuo d;
    public int b;
    public long c;

    static {
        emzs emzsVar = new emzs();
        a = emzsVar;
        evsn.registerDefaultInstance(emzs.class, emzsVar);
    }

    private emzs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new emzs();
        }
        if (iOrdinal == 4) {
            return new emzr();
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
        synchronized (emzs.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
