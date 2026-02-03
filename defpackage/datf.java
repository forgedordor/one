package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class datf extends evsn implements evui {
    public static final datf a;
    private static volatile evuo c;
    public long b;
    private int d;
    private evub e;
    private evub f;

    static {
        datf datfVar = new datf();
        a = datfVar;
        evsn.registerDefaultInstance(datf.class, datfVar);
    }

    private datf() {
        evub evubVar = evub.a;
        this.e = evubVar;
        this.f = evubVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0007\t\u0003\u0002\u0000\u0000\u00072\b2\tဂ\u0000", new Object[]{"d", "e", datd.a, "f", date.a, "b"});
        }
        if (iOrdinal == 3) {
            return new datf();
        }
        if (iOrdinal == 4) {
            return new datc();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (datf.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
