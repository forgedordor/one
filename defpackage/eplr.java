package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eplr extends evsn implements evui {
    public static final eplr a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public epkz d;

    static {
        eplr eplrVar = new eplr();
        a = eplrVar;
        evsn.registerDefaultInstance(eplr.class, eplrVar);
    }

    private eplr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eplr();
        }
        if (iOrdinal == 4) {
            return new eplq();
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
        synchronized (eplr.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
