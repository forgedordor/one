package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elyn extends evsn implements evui {
    public static final elyn a;
    private static volatile evuo h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        elyn elynVar = new elyn();
        a = elynVar;
        evsn.registerDefaultInstance(elyn.class, elynVar);
    }

    private elyn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = elyp.a;
            evsv evsvVar2 = elyt.a;
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"b", "c", evsvVar, "d", evsvVar, "e", elym.a, "f", evsvVar2, "g", evsvVar2});
        }
        if (iOrdinal == 3) {
            return new elyn();
        }
        if (iOrdinal == 4) {
            return new elyl();
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
        synchronized (elyn.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
