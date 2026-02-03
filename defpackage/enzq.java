package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enzq extends evsn implements evui {
    public static final enzq a;
    private static volatile evuo j;
    public int b;
    public Object d;
    public int e;
    public enzm g;
    public int h;
    public int i;
    public int c = 0;
    public evqs f = evqs.b;

    static {
        enzq enzqVar = new enzq();
        a = enzqVar;
        evsn.registerDefaultInstance(enzq.class, enzqVar);
    }

    private enzq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007᠌\u0003\bင\u0004", new Object[]{"d", "c", "b", "e", enzo.a, "f", "g", enzx.class, enzs.class, enzv.class, "h", aiaz.a, "i"});
        }
        if (iOrdinal == 3) {
            return new enzq();
        }
        if (iOrdinal == 4) {
            return new enzn();
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
        synchronized (enzq.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
