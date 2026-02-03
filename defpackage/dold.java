package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dold extends evsn implements evui {
    public static final dold a;
    private static volatile evuo e;
    public int b;
    public evrj c;
    public dokx d;

    static {
        dold doldVar = new dold();
        a = doldVar;
        evsn.registerDefaultInstance(dold.class, doldVar);
    }

    private dold() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001d\u0002\u0000\u0000\u0000\u0001ဉ\u0000dဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dold();
        }
        if (iOrdinal == 4) {
            return new dolc();
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
        synchronized (dold.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
