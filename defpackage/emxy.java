package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emxy extends evsn implements evui {
    public static final emxy a;
    private static volatile evuo f;
    public int b;
    public emza c;
    public emyn d;
    public int e;

    static {
        emxy emxyVar = new emxy();
        a = emxyVar;
        evsn.registerDefaultInstance(emxy.class, emxyVar);
    }

    private emxy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", emxx.a});
        }
        if (iOrdinal == 3) {
            return new emxy();
        }
        if (iOrdinal == 4) {
            return new emxw();
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
        synchronized (emxy.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
