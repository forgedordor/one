package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crxa extends evsn implements evui {
    public static final crxa a;
    private static volatile evuo f;
    public int c;
    public int d;
    public String b = "";
    public String e = "";

    static {
        crxa crxaVar = new crxa();
        a = crxaVar;
        evsn.registerDefaultInstance(crxa.class, crxaVar);
    }

    private crxa() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f\u0004Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new crxa();
        }
        if (iOrdinal == 4) {
            return new crwy();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (crxa.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
