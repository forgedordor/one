package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epvp extends evsn implements evui {
    public static final epvp a;
    private static volatile evuo b;
    private evub c;
    private evub d;
    private evub e;
    private evub f;

    static {
        epvp epvpVar = new epvp();
        a = epvpVar;
        evsn.registerDefaultInstance(epvp.class, epvpVar);
    }

    private epvp() {
        evub evubVar = evub.a;
        this.c = evubVar;
        this.d = evubVar;
        this.e = evubVar;
        this.f = evubVar;
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0007\r\u0004\u0004\u0000\u0000\u00072\u000b2\f2\r2", new Object[]{"c", epvi.a, "e", epvg.a, "f", epvh.a, "d", epvf.a});
        }
        if (iOrdinal == 3) {
            return new epvp();
        }
        if (iOrdinal == 4) {
            return new epve();
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
        synchronized (epvp.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
