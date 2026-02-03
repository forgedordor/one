package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtoo extends evsn implements evui {
    public static final dtoo a;
    private static volatile evuo c;
    public String b = "";
    private int d;

    static {
        dtoo dtooVar = new dtoo();
        a = dtooVar;
        evsn.registerDefaultInstance(dtoo.class, dtooVar);
    }

    private dtoo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new dtoo();
        }
        if (iOrdinal == 4) {
            return new dton();
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
        synchronized (dtoo.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
