package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjgj extends evsn implements evui {
    public static final cjgj a;
    private static volatile evuo b;

    static {
        cjgj cjgjVar = new cjgj();
        a = cjgjVar;
        evsn.registerDefaultInstance(cjgj.class, cjgjVar);
    }

    private cjgj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new cjgj();
        }
        if (iOrdinal == 4) {
            return new cjgi();
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
        synchronized (cjgj.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
