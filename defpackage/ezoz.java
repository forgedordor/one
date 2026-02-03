package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezoz extends evsn implements evui {
    public static final ezoz a;
    private static volatile evuo h;
    public evqs d;
    public String e;
    public evqs f;
    public evub g = evub.a;
    public String b = "";
    public String c = "";

    static {
        ezoz ezozVar = new ezoz();
        a = ezozVar;
        evsn.registerDefaultInstance(ezoz.class, ezozVar);
    }

    private ezoz() {
        evqs evqsVar = evqs.b;
        this.d = evqsVar;
        this.e = "";
        this.f = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\t\u0006\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0005\n\u0007Ȉ\b\n\t2", new Object[]{"b", "c", "d", "e", "f", "g", ezoy.a});
        }
        if (iOrdinal == 3) {
            return new ezoz();
        }
        if (iOrdinal == 4) {
            return new ezox();
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
        synchronized (ezoz.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
