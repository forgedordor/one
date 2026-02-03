package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class faeb extends evsn implements evui {
    public static final faeb a;
    private static volatile evuo c;
    public evqs b = evqs.b;

    static {
        faeb faebVar = new faeb();
        a = faebVar;
        evsn.registerDefaultInstance(faeb.class, faebVar);
    }

    private faeb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new faeb();
        }
        if (iOrdinal == 4) {
            return new faea();
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
        synchronized (faeb.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
