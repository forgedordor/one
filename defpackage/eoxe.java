package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoxe extends evsn implements evui {
    public static final eoxe a;
    private static volatile evuo g;
    public String b = "";
    public int c;
    public evqs d;
    public evqs e;
    public String f;

    static {
        eoxe eoxeVar = new eoxe();
        a = eoxeVar;
        evsn.registerDefaultInstance(eoxe.class, eoxeVar);
    }

    private eoxe() {
        evqs evqsVar = evqs.b;
        this.d = evqsVar;
        this.e = evqsVar;
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
            return newMessageInfo(a, "\u0004\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\n\u0005\n\u0006Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eoxe();
        }
        if (iOrdinal == 4) {
            return new eoxd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eoxe.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
