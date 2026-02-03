package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exzr extends evsn implements evui {
    public static final exzr a;
    private static volatile evuo h;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public exzm g;

    static {
        exzr exzrVar = new exzr();
        a = exzrVar;
        evsn.registerDefaultInstance(exzr.class, exzrVar);
    }

    private exzr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\f\u0005ဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new exzr();
        }
        if (iOrdinal == 4) {
            return new exzp();
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
        synchronized (exzr.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
