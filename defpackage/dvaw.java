package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvaw extends evsn implements evui {
    public static final dvaw a;
    private static volatile evuo b;
    private evub c = evub.a;

    static {
        dvaw dvawVar = new dvaw();
        a = dvawVar;
        evsn.registerDefaultInstance(dvaw.class, dvawVar);
    }

    private dvaw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", dvav.a});
        }
        if (iOrdinal == 3) {
            return new dvaw();
        }
        if (iOrdinal == 4) {
            return new dvau();
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
        synchronized (dvaw.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
