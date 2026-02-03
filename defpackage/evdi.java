package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evdi extends evsn implements evui {
    public static final evdi a;
    private static volatile evuo h;
    public int b;
    public long e;
    public long g;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        evdi evdiVar = new evdi();
        a = evdiVar;
        evsn.registerDefaultInstance(evdi.class, evdiVar);
    }

    private evdi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဂ\u0002\u0004ဂ\u0004\u0006ဈ\u0001", new Object[]{"b", "c", "f", "e", "g", "d"});
        }
        if (iOrdinal == 3) {
            return new evdi();
        }
        if (iOrdinal == 4) {
            return new evdh();
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
        synchronized (evdi.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
