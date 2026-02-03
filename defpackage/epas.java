package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epas extends evsn implements evui {
    public static final epas a;
    private static volatile evuo h;
    public int b;
    public int d;
    public epaq f;
    public epqd g;
    public String c = "";
    public String e = "";

    static {
        epas epasVar = new epas();
        a = epasVar;
        evsn.registerDefaultInstance(epas.class, epasVar);
    }

    private epas() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005ဉ\u0000\u0006ဉ\u0001", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new epas();
        }
        if (iOrdinal == 4) {
            return new epar();
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
        synchronized (epas.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
