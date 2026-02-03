package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erxh extends evsn implements evui {
    public static final erxh a;
    private static volatile evuo c;
    public long b = -1;
    private int d;

    static {
        erxh erxhVar = new erxh();
        a = erxhVar;
        evsn.registerDefaultInstance(erxh.class, erxhVar);
    }

    private erxh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဂ\u0003", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new erxh();
        }
        if (iOrdinal == 4) {
            return new erxg();
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
        synchronized (erxh.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
