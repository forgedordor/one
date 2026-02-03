package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feio extends evsn implements evui {
    public static final feio a;
    private static volatile evuo d;
    public evsx b = emptyIntList();
    public evsx c = emptyIntList();

    static {
        feio feioVar = new feio();
        a = feioVar;
        evsn.registerDefaultInstance(feio.class, feioVar);
    }

    private feio() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new feio();
        }
        if (iOrdinal == 4) {
            return new fein();
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
        synchronized (feio.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
