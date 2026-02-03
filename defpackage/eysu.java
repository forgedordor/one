package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eysu extends evsn implements evui {
    public static final eysu a;
    private static volatile evuo b;

    static {
        eysu eysuVar = new eysu();
        a = eysuVar;
        evsn.registerDefaultInstance(eysu.class, eysuVar);
    }

    private eysu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new eysu();
        }
        if (iOrdinal == 4) {
            return new eyst();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eysu.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
