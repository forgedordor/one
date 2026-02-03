package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eydt extends evsn implements evui {
    public static final eydt a;
    private static volatile evuo d;
    public int b;
    public evqs c = evqs.b;

    static {
        eydt eydtVar = new eydt();
        a = eydtVar;
        evsn.registerDefaultInstance(eydt.class, eydtVar);
    }

    private eydt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ည\u0003", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eydt();
        }
        if (iOrdinal == 4) {
            return new eyds();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eydt.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
