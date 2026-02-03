package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eypb extends evsn implements evui {
    public static final eypb a;
    private static volatile evuo d;
    public String b = "";
    public String c = "";

    static {
        eypb eypbVar = new eypb();
        a = eypbVar;
        evsn.registerDefaultInstance(eypb.class, eypbVar);
    }

    private eypb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eypb();
        }
        if (iOrdinal == 4) {
            return new eypa();
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
        synchronized (eypb.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
