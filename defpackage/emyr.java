package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emyr extends evsn implements evui {
    public static final emyr a;
    private static volatile evuo g;
    public int b;
    public emza c;
    public emyn d;
    public int e;
    public boolean f;

    static {
        emyr emyrVar = new emyr();
        a = emyrVar;
        evsn.registerDefaultInstance(emyr.class, emyrVar);
    }

    private emyr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new emyr();
        }
        if (iOrdinal == 4) {
            return new emyq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emyr.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
