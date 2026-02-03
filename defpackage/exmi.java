package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exmi extends evsn implements evui {
    public static final exmi a;
    private static volatile evuo h;
    public int b;
    public double c;
    public double d;
    public exjh e;
    public int f;
    public long g;

    static {
        exmi exmiVar = new exmi();
        a = exmiVar;
        evsn.registerDefaultInstance(exmi.class, exmiVar);
    }

    private exmi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003ဉ\u0000\u0004\f\u0005\u0002", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new exmi();
        }
        if (iOrdinal == 4) {
            return new exmh();
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
        synchronized (exmi.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
