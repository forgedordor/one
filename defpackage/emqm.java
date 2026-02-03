package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emqm extends evsn implements evui {
    public static final emqm a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        emqm emqmVar = new emqm();
        a = emqmVar;
        evsn.registerDefaultInstance(emqm.class, emqmVar);
    }

    private emqm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", emql.a});
        }
        if (iOrdinal == 3) {
            return new emqm();
        }
        if (iOrdinal == 4) {
            return new emqk();
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
        synchronized (emqm.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
