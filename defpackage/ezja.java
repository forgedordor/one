package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezja extends evsn implements evui {
    public static final ezja a;
    private static volatile evuo f;
    public int b;
    public ezpr c;
    public evqs d = evqs.b;
    public ezol e;

    static {
        ezja ezjaVar = new ezja();
        a = ezjaVar;
        evsn.registerDefaultInstance(ezja.class, ezjaVar);
    }

    private ezja() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n\u0003ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ezja();
        }
        if (iOrdinal == 4) {
            return new eziz();
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
        synchronized (ezja.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
