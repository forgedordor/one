package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evkx extends evsn implements evui {
    public static final evkx a;
    private static volatile evuo k;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public eviy f;
    public evtg g = emptyProtobufList();
    public int h;
    public evkt i;
    public evkr j;

    static {
        evkx evkxVar = new evkx();
        a = evkxVar;
        evsn.registerDefaultInstance(evkx.class, evkxVar);
    }

    private evkx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\t\b\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0002\u0003ဉ\u0003\u0005\u001b\u0006᠌\u0004\u0007ဉ\u0005\bဉ\u0006\tဇ\u0001", new Object[]{"b", "c", evkm.a, "e", "f", "g", evkw.class, "h", evko.a, "i", "j", "d"});
        }
        if (iOrdinal == 3) {
            return new evkx();
        }
        if (iOrdinal == 4) {
            return new evkl();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evkx.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
