package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erla extends evsn implements evui {
    public static final erla a;
    private static volatile evuo e;
    public int b;
    public int c;
    public evqs d = evqs.b;

    static {
        erla erlaVar = new erla();
        a = erlaVar;
        evsn.registerDefaultInstance(erla.class, erlaVar);
    }

    private erla() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new erla();
        }
        if (iOrdinal == 4) {
            return new erkz();
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
        synchronized (erla.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
