package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emyc extends evsn implements evui {
    public static final emyc a;
    private static volatile evuo h;
    public int b;
    public emza c;
    public emyn d;
    public int e;
    public int f;
    public int g;

    static {
        emyc emycVar = new emyc();
        a = emycVar;
        evsn.registerDefaultInstance(emyc.class, emycVar);
    }

    private emyc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = emyb.a;
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", emya.a, "f", evsvVar, "g", evsvVar});
        }
        if (iOrdinal == 3) {
            return new emyc();
        }
        if (iOrdinal == 4) {
            return new emxz();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emyc.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
