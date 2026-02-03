package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cihz extends evsn implements evui {
    public static final cihz a;
    private static volatile evuo c;
    public boolean b;

    static {
        cihz cihzVar = new cihz();
        a = cihzVar;
        evsn.registerDefaultInstance(cihz.class, cihzVar);
    }

    private cihz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new cihz();
        }
        if (iOrdinal == 4) {
            return new cihy();
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
        synchronized (cihz.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
