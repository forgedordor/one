package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccht extends evsn implements evui {
    public static final ccht a;
    private static volatile evuo j;
    public int b;
    public int c;
    public evqs d;
    public evqs e;
    public evqs f;
    public evqs g;
    public cccq h;
    public String i;

    static {
        ccht cchtVar = new ccht();
        a = cchtVar;
        evsn.registerDefaultInstance(ccht.class, cchtVar);
    }

    private ccht() {
        evqs evqsVar = evqs.b;
        this.d = evqsVar;
        this.e = evqsVar;
        this.f = evqsVar;
        this.g = evqsVar;
        this.i = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001\f\u0002\n\u0003\n\u0004\n\u0005\n\u0007ဉ\u0000\bȈ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new ccht();
        }
        if (iOrdinal == 4) {
            return new cchs();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ccht.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
