package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjle extends evsn implements evui {
    public static final cjle a;
    private static volatile evuo b;

    static {
        cjle cjleVar = new cjle();
        a = cjleVar;
        evsn.registerDefaultInstance(cjle.class, cjleVar);
    }

    private cjle() {
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
            return new cjle();
        }
        if (iOrdinal == 4) {
            return new cjld();
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
        synchronized (cjle.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
