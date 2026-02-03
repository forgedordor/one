package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class faek extends evsn implements evui {
    public static final faek a;
    private static volatile evuo c;
    public faeu b;
    private int d;

    static {
        faek faekVar = new faek();
        a = faekVar;
        evsn.registerDefaultInstance(faek.class, faekVar);
    }

    private faek() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new faek();
        }
        if (iOrdinal == 4) {
            return new faej();
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
        synchronized (faek.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
