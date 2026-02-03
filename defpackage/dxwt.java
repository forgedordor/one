package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxwt extends evsn implements evui {
    public static final dxwt a;
    private static volatile evuo b;

    static {
        dxwt dxwtVar = new dxwt();
        a = dxwtVar;
        evsn.registerDefaultInstance(dxwt.class, dxwtVar);
    }

    private dxwt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new dxwt();
        }
        if (iOrdinal == 4) {
            return new dxws();
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
        synchronized (dxwt.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
