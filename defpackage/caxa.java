package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caxa extends evsn implements evui {
    public static final caxa a;
    private static volatile evuo d;
    public int b;
    public boolean c;

    static {
        caxa caxaVar = new caxa();
        a = caxaVar;
        evsn.registerDefaultInstance(caxa.class, caxaVar);
    }

    private caxa() {
    }

    public static /* synthetic */ void a(caxa caxaVar) {
        caxaVar.b |= 1;
        caxaVar.c = true;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new caxa();
        }
        if (iOrdinal == 4) {
            return new cawz();
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
        synchronized (caxa.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
