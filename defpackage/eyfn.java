package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyfn extends evsn implements evui {
    public static final eyfn a;
    private static volatile evuo h;
    public int b;
    public evqs c;
    public evqs d;
    public int e;
    public String f;
    public aubx g;

    static {
        eyfn eyfnVar = new eyfn();
        a = eyfnVar;
        evsn.registerDefaultInstance(eyfn.class, eyfnVar);
    }

    private eyfn() {
        evqs evqsVar = evqs.b;
        this.c = evqsVar;
        this.d = evqsVar;
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
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new eyfn();
        }
        if (iOrdinal == 4) {
            return new eyfm();
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
        synchronized (eyfn.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
