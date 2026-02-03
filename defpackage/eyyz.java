package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyyz extends evsn implements evui {
    public static final eyyz a;
    private static volatile evuo b;

    static {
        eyyz eyyzVar = new eyyz();
        a = eyyzVar;
        evsn.registerDefaultInstance(eyyz.class, eyyzVar);
    }

    private eyyz() {
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
            return new eyyz();
        }
        if (iOrdinal == 4) {
            return new eyyy();
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
        synchronized (eyyz.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
