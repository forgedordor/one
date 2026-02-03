package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emjm extends evsn implements evui {
    public static final emjm a;
    private static volatile evuo h;
    public int b;
    public eobl c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        emjm emjmVar = new emjm();
        a = emjmVar;
        evsn.registerDefaultInstance(emjm.class, emjmVar);
    }

    private emjm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = elgy.a;
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", elhb.a, "e", evsvVar, "f", evsvVar, "g", emjl.a});
        }
        if (iOrdinal == 3) {
            return new emjm();
        }
        if (iOrdinal == 4) {
            return new emjk();
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
        synchronized (emjm.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
