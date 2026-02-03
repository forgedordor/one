package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewuy extends evsn implements evui {
    public static final ewuy a;
    private static volatile evuo e;
    public int b;
    public evqs c = evqs.b;
    public int d;

    static {
        ewuy ewuyVar = new ewuy();
        a = ewuyVar;
        evsn.registerDefaultInstance(ewuy.class, ewuyVar);
    }

    private ewuy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ewuy();
        }
        if (iOrdinal == 4) {
            return new ewux();
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
        synchronized (ewuy.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
