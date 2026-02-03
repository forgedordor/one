package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eizu extends evsn implements evui {
    public static final eizu a;
    private static volatile evuo d;
    public int b;
    public String c;
    private evub e;
    private evub f;

    static {
        eizu eizuVar = new eizu();
        a = eizuVar;
        evsn.registerDefaultInstance(eizu.class, eizuVar);
    }

    private eizu() {
        evub evubVar = evub.a;
        this.e = evubVar;
        this.f = evubVar;
        this.c = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0002\u0000\u0000\u00012\u0002ဈ\u0000\u00032", new Object[]{"b", "e", eizt.a, "c", "f", eizr.a});
        }
        if (iOrdinal == 3) {
            return new eizu();
        }
        if (iOrdinal == 4) {
            return new eizs();
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
        synchronized (eizu.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
