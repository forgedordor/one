package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejqy extends evsn implements evui {
    public static final ejqy a;
    private static volatile evuo e;
    public int b;
    public evqs c;
    public evqs d;

    static {
        ejqy ejqyVar = new ejqy();
        a = ejqyVar;
        evsn.registerDefaultInstance(ejqy.class, ejqyVar);
    }

    private ejqy() {
        evqs evqsVar = evqs.b;
        evqs evqsVar2 = evqs.b;
        this.c = evqsVar2;
        this.d = evqsVar2;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0003\u0005\u0003\u0000\u0000\u0000\u0003\n\u0004\u000b\u0005\n", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new ejqy();
        }
        if (iOrdinal == 4) {
            return new ejqx();
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
        synchronized (ejqy.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
