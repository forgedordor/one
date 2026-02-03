package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eytg extends evsn implements evui {
    public static final eytg a;
    private static volatile evuo e;
    public int c;
    public String b = "";
    public evtg d = emptyProtobufList();

    static {
        eytg eytgVar = new eytg();
        a = eytgVar;
        evsn.registerDefaultInstance(eytg.class, eytgVar);
    }

    private eytg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"b", "c", "d", eyty.class});
        }
        if (iOrdinal == 3) {
            return new eytg();
        }
        if (iOrdinal == 4) {
            return new eytf();
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
        synchronized (eytg.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
