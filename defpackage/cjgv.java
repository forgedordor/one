package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjgv extends evsn implements evui {
    public static final cjgv a;
    private static volatile evuo b;

    static {
        cjgv cjgvVar = new cjgv();
        a = cjgvVar;
        evsn.registerDefaultInstance(cjgv.class, cjgvVar);
    }

    private cjgv() {
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
            return new cjgv();
        }
        if (iOrdinal == 4) {
            return new cjgu();
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
        synchronized (cjgv.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
