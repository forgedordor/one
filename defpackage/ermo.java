package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ermo extends evsn implements evui {
    public static final ermo a;
    private static volatile evuo f;
    public String b = "";
    public int c;
    public int d;
    public int e;

    static {
        ermo ermoVar = new ermo();
        a = ermoVar;
        evsn.registerDefaultInstance(ermo.class, ermoVar);
    }

    private ermo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ermo();
        }
        if (iOrdinal == 4) {
            return new ermn();
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
        synchronized (ermo.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
