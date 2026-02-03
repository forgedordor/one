package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crkr extends evsn implements evui {
    public static final crkr a;
    private static volatile evuo f;
    public String b = "";
    public String c = "";
    public int d;
    public boolean e;

    static {
        crkr crkrVar = new crkr();
        a = crkrVar;
        evsn.registerDefaultInstance(crkr.class, crkrVar);
    }

    private crkr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new crkr();
        }
        if (iOrdinal == 4) {
            return new crkq();
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
        synchronized (crkr.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
