package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emzf extends evsn implements evui {
    public static final emzf a;
    private static volatile evuo g;
    public int b;
    public emza c;
    public emyn d;
    public int e;
    public int f;

    static {
        emzf emzfVar = new emzf();
        a = emzfVar;
        evsn.registerDefaultInstance(emzf.class, emzfVar);
    }

    private emzf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", emzd.a, "f"});
        }
        if (iOrdinal == 3) {
            return new emzf();
        }
        if (iOrdinal == 4) {
            return new emze();
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
        synchronized (emzf.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
