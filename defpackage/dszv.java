package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dszv extends evsn implements evui {
    public static final dszv a;
    private static volatile evuo b;

    static {
        dszv dszvVar = new dszv();
        a = dszvVar;
        evsn.registerDefaultInstance(dszv.class, dszvVar);
    }

    private dszv() {
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
            return new dszv();
        }
        if (iOrdinal == 4) {
            return new dszu();
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
        synchronized (dszv.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
