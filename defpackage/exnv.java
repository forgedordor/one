package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exnv extends evsn implements evui {
    public static final exnv a;
    private static volatile evuo f;
    public int b;
    public exnr c;
    public exnu d;
    public evrj e;

    static {
        exnv exnvVar = new exnv();
        a = exnvVar;
        evsn.registerDefaultInstance(exnv.class, exnvVar);
    }

    private exnv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new exnv();
        }
        if (iOrdinal == 4) {
            return new exns();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exnv.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
