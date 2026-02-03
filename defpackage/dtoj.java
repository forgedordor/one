package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtoj extends evsn implements evui {
    public static final dtoj a;
    private static volatile evuo c;
    public String b = "";
    private int d;

    static {
        dtoj dtojVar = new dtoj();
        a = dtojVar;
        evsn.registerDefaultInstance(dtoj.class, dtojVar);
    }

    private dtoj() {
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
            return new dtoj();
        }
        if (iOrdinal == 4) {
            return new dtoi();
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
        synchronized (dtoj.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
