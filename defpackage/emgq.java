package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emgq extends evsn implements evui {
    public static final emgq a;
    private static volatile evuo m;
    public int b;
    public evrj c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public evqs l = evqs.b;

    static {
        emgq emgqVar = new emgq();
        a = emgqVar;
        evsn.registerDefaultInstance(emgq.class, emgqVar);
    }

    private emgq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = emok.a;
            return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\t᠌\b\nည\t", new Object[]{"b", "c", "d", evsvVar, "e", evsvVar, "f", evsvVar, "g", evsvVar, "h", evsvVar, "i", "j", "k", emgu.a, "l"});
        }
        if (iOrdinal == 3) {
            return new emgq();
        }
        if (iOrdinal == 4) {
            return new emgp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = m;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emgq.class) {
            evsgVar = m;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                m = evsgVar;
            }
        }
        return evsgVar;
    }
}
