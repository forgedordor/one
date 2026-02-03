package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exzm extends evsn implements evui {
    public static final exzm a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public evub e = evub.a;

    static {
        exzm exzmVar = new exzm();
        a = exzmVar;
        evsn.registerDefaultInstance(exzm.class, exzmVar);
    }

    private exzm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\f\u0002\f\u0003\f\u00042", new Object[]{"b", "c", "d", "e", exzl.a});
        }
        if (iOrdinal == 3) {
            return new exzm();
        }
        if (iOrdinal == 4) {
            return new exzk();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exzm.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
