package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elin extends evsn implements evui {
    public static final elin a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        elin elinVar = new elin();
        a = elinVar;
        evsn.registerDefaultInstance(elin.class, elinVar);
    }

    private elin() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0007\u0002\u0000\u0000\u0000\u0002᠌\u0001\u0007᠌\u0006", new Object[]{"b", "c", elik.a, "d", elvf.a});
        }
        if (iOrdinal == 3) {
            return new elin();
        }
        if (iOrdinal == 4) {
            return new elim();
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
        synchronized (elin.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
