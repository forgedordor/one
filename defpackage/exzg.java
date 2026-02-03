package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exzg extends evsn implements evui {
    public static final exzg a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public int e;
    public exzm f;

    static {
        exzg exzgVar = new exzg();
        a = exzgVar;
        evsn.registerDefaultInstance(exzg.class, exzgVar);
    }

    private exzg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0004ဉ\u0000", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new exzg();
        }
        if (iOrdinal == 4) {
            return new exze();
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
        synchronized (exzg.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
