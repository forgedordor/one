package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdt extends evsn implements evui {
    public static final sdt a;
    private static volatile evuo e;
    public int b;
    public boolean c;
    public int d;

    static {
        sdt sdtVar = new sdt();
        a = sdtVar;
        evsn.registerDefaultInstance(sdt.class, sdtVar);
    }

    private sdt() {
        evqs evqsVar = evqs.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003᠌\u0001", new Object[]{"b", "c", "d", sey.a});
        }
        if (iOrdinal == 3) {
            return new sdt();
        }
        if (iOrdinal == 4) {
            return new sds();
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
        synchronized (sdt.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
