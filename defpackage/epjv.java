package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epjv extends evsn implements evui {
    public static final epjv a;
    private static volatile evuo h;
    public int b;
    public epkd c;
    public boolean d;
    public int e;
    public long f;
    public String g = "";

    static {
        epjv epjvVar = new epjv();
        a = epjvVar;
        evsn.registerDefaultInstance(epjv.class, epjvVar);
    }

    private epjv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003\f\u0004\u0002\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new epjv();
        }
        if (iOrdinal == 4) {
            return new epju();
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
        synchronized (epjv.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
