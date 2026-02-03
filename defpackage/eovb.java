package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eovb extends evsn implements evui {
    public static final eovb a;
    private static volatile evuo d;
    public String b = "";
    public String c = "";

    static {
        eovb eovbVar = new eovb();
        a = eovbVar;
        evsn.registerDefaultInstance(eovb.class, eovbVar);
    }

    private eovb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0004\u0005\u0002\u0000\u0000\u0000\u0004Ȉ\u0005Ȉ", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eovb();
        }
        if (iOrdinal == 4) {
            return new eova();
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
        synchronized (eovb.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
