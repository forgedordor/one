package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epni extends evsn implements evui {
    public static final epni a;
    private static volatile evuo k;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public exuy g;
    public int h;
    public int i;
    public String f = "";
    public evqs j = evqs.b;

    static {
        epni epniVar = new epni();
        a = epniVar;
        evsn.registerDefaultInstance(epni.class, epniVar);
    }

    private epni() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0007\u0004Ȉ\u0005ဉ\u0000\u0006\u000b\u0007\u000b\b\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new epni();
        }
        if (iOrdinal == 4) {
            return new epng();
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
        synchronized (epni.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
