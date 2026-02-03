package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyax extends evsn implements evui {
    public static final eyax a;
    private static volatile evuo g;
    public int b;
    public float c;
    public float d;
    public float e;
    public evsc f;

    static {
        eyax eyaxVar = new eyax();
        a = eyaxVar;
        evsn.registerDefaultInstance(eyax.class, eyaxVar);
    }

    private eyax() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004ဉ\u0000", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eyax();
        }
        if (iOrdinal == 4) {
            return new eyaw();
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
        synchronized (eyax.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
