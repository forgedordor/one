package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exya extends evsn implements evui {
    public static final exya a;
    private static volatile evuo b;
    private evub c;
    private evub d;

    static {
        exya exyaVar = new exya();
        a = exyaVar;
        evsn.registerDefaultInstance(exya.class, exyaVar);
    }

    private exya() {
        evub evubVar = evub.a;
        this.c = evubVar;
        this.d = evubVar;
        evsn.emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0006\u0007\u0002\u0002\u0000\u0000\u00062\u00072", new Object[]{"c", exxz.a, "d", exxy.a});
        }
        if (iOrdinal == 3) {
            return new exya();
        }
        if (iOrdinal == 4) {
            return new exxx();
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
        synchronized (exya.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
