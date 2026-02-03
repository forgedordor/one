package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epfv extends evsn implements evui {
    public static final epfv a;
    private static volatile evuo h;
    public int b;
    public Object d;
    public int e;
    public epqd g;
    private eowm i;
    public int c = 0;
    public String f = "";

    static {
        epfv epfvVar = new epfv();
        a = epfvVar;
        evsn.registerDefaultInstance(epfv.class, epfvVar);
    }

    private epfv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003Ȉ\u0005<\u0000\u0006ဉ\u0001", new Object[]{"d", "c", "b", "i", "e", "f", epej.class, "g"});
        }
        if (iOrdinal == 3) {
            return new epfv();
        }
        if (iOrdinal == 4) {
            return new epft();
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
        synchronized (epfv.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
