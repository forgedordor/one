package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezvg extends evsn implements evui {
    public static final ezvg a;
    private static volatile evuo h;
    public int b;
    public int c;
    public evqs d;
    public evqs e;
    public ezow f;
    public ezow g;

    static {
        ezvg ezvgVar = new ezvg();
        a = ezvgVar;
        evsn.registerDefaultInstance(ezvg.class, ezvgVar);
    }

    private ezvg() {
        evqs evqsVar = evqs.b;
        this.d = evqsVar;
        this.e = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\n\u0003\n\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ezvg();
        }
        if (iOrdinal == 4) {
            return new ezvf();
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
        synchronized (ezvg.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
