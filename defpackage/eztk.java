package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eztk extends evsn implements evui {
    public static final eztk a;
    private static volatile evuo l;
    public int b;
    public ezpp c;
    public float f;
    public int i;
    public ezpx k;
    public String d = "";
    public String e = "";
    public String g = "";
    public String h = "";
    public evqs j = evqs.b;

    static {
        eztk eztkVar = new eztk();
        a = eztkVar;
        evsn.registerDefaultInstance(eztk.class, eztkVar);
    }

    private eztk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0005\u0001\u0006Ȉ\u0007Ȉ\b\f\t\n\nဉ\u0001", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new eztk();
        }
        if (iOrdinal == 4) {
            return new eztj();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eztk.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
