package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emzc extends evsn implements evui {
    public static final emzc a;
    private static volatile evuo f;
    public int b;
    public emza c;
    public int d;
    public int e;

    static {
        emzc emzcVar = new emzc();
        a = emzcVar;
        evsn.registerDefaultInstance(emzc.class, emzcVar);
    }

    private emzc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new emzc();
        }
        if (iOrdinal == 4) {
            return new emzb();
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
        synchronized (emzc.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
