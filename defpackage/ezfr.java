package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezfr extends evsn implements evui {
    public static final ezfr a;
    private static volatile evuo d;
    public String b = "";
    public int c;

    static {
        ezfr ezfrVar = new ezfr();
        a = ezfrVar;
        evsn.registerDefaultInstance(ezfr.class, ezfrVar);
    }

    private ezfr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ezfr();
        }
        if (iOrdinal == 4) {
            return new ezfq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezfr.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
