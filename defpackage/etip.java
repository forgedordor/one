package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etip extends evsn implements evui {
    public static final etip a;
    private static volatile evuo j;
    public int b;
    public etir c;
    public long d;
    public int e;
    public eveg f;
    public String g = "";
    public String h = "";
    public evqs i = evqs.b;

    static {
        etip etipVar = new etip();
        a = etipVar;
        evsn.registerDefaultInstance(etip.class, etipVar);
    }

    private etip() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0002\b\u0007\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bည\u0007", new Object[]{"b", "c", "d", "e", etje.a, "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new etip();
        }
        if (iOrdinal == 4) {
            return new etio();
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
        synchronized (etip.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
