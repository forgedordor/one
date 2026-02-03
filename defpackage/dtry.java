package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtry extends evsn implements evui {
    public static final dtry a;
    private static volatile evuo c;
    public boolean b;
    private int d;

    static {
        dtry dtryVar = new dtry();
        a = dtryVar;
        evsn.registerDefaultInstance(dtry.class, dtryVar);
    }

    private dtry() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new dtry();
        }
        if (iOrdinal == 4) {
            return new dtrx();
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
        synchronized (dtry.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
