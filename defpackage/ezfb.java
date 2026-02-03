package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezfb extends evsn implements evui {
    public static final ezfb a;
    private static volatile evuo f;
    public String b = "";
    public String c = "";
    public int d;
    public int e;

    static {
        ezfb ezfbVar = new ezfb();
        a = ezfbVar;
        evsn.registerDefaultInstance(ezfb.class, ezfbVar);
    }

    private ezfb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\f", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ezfb();
        }
        if (iOrdinal == 4) {
            return new ezey();
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
        synchronized (ezfb.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
