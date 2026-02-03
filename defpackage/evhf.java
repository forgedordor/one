package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evhf extends evsn implements evui {
    public static final evhf a;
    private static volatile evuo h;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public evhe f;
    public evqe g;

    static {
        evhf evhfVar = new evhf();
        a = evhfVar;
        evsn.registerDefaultInstance(evhf.class, evhfVar);
    }

    private evhf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u001e\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0005\u0004ဈ\u0003\u0005ဈ\u0002\u001eဉ\u0006", new Object[]{"b", "c", "f", "e", "d", "g"});
        }
        if (iOrdinal == 3) {
            return new evhf();
        }
        if (iOrdinal == 4) {
            return new evgn();
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
        synchronized (evhf.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
