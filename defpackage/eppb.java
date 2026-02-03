package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eppb extends evsn implements evui {
    public static final eppb a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public String d = "";
    public epnu e;

    static {
        eppb eppbVar = new eppb();
        a = eppbVar;
        evsn.registerDefaultInstance(eppb.class, eppbVar);
    }

    private eppb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eppb();
        }
        if (iOrdinal == 4) {
            return new eppa();
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
        synchronized (eppb.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
