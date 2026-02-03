package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqnu extends evsn implements evui {
    public static final eqnu a;
    private static volatile evuo h;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f;
    public evqe g;

    static {
        eqnu eqnuVar = new eqnu();
        a = eqnuVar;
        evsn.registerDefaultInstance(eqnu.class, eqnuVar);
    }

    private eqnu() {
        evqs evqsVar = evqs.b;
        this.f = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\bȈ\nဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new eqnu();
        }
        if (iOrdinal == 4) {
            return new eqnt();
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
        synchronized (eqnu.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
