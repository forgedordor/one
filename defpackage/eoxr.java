package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoxr extends evsn implements evui {
    public static final eoxr a;
    private static volatile evuo d;
    public String b = "";
    public boolean c;

    static {
        eoxr eoxrVar = new eoxr();
        a = eoxrVar;
        evsn.registerDefaultInstance(eoxr.class, eoxrVar);
    }

    private eoxr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eoxr();
        }
        if (iOrdinal == 4) {
            return new eoxq();
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
        synchronized (eoxr.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
