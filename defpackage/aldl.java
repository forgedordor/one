package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aldl extends evsn implements evui {
    public static final aldl a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public evtg d = evsn.emptyProtobufList();
    public albe e;
    public double f;

    static {
        aldl aldlVar = new aldl();
        a = aldlVar;
        evsn.registerDefaultInstance(aldl.class, aldlVar);
    }

    private aldl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0003Ț\u0004ဉ\u0002\u0005က\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aldl();
        }
        if (iOrdinal == 4) {
            return new aldk();
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
        synchronized (aldl.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
