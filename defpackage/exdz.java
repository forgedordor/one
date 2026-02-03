package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exdz extends evsn implements evui {
    public static final exdz a;
    private static volatile evuo e;
    public int b;
    public exdy c;
    public evrj d;

    static {
        exdz exdzVar = new exdz();
        a = exdzVar;
        evsn.registerDefaultInstance(exdz.class, exdzVar);
    }

    private exdz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new exdz();
        }
        if (iOrdinal == 4) {
            return new exdw();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exdz.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
