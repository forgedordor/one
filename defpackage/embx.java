package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class embx extends evsn implements evui {
    public static final embx a;
    private static volatile evuo g;
    public int b;
    public elpy c;
    public int d;
    public int e;
    public int f;

    static {
        embx embxVar = new embx();
        a = embxVar;
        evsn.registerDefaultInstance(embx.class, embxVar);
    }

    private embx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", embw.a});
        }
        if (iOrdinal == 3) {
            return new embx();
        }
        if (iOrdinal == 4) {
            return new embv();
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
        synchronized (embx.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
