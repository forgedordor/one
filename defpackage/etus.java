package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etus extends evsn implements evui {
    public static final etus a;
    private static volatile evuo e;
    public etxi c;
    private int f;
    public String b = "";
    public evtg d = emptyProtobufList();

    static {
        etus etusVar = new etus();
        a = etusVar;
        evsn.registerDefaultInstance(etus.class, etusVar);
    }

    private etus() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"f", "b", "c", "d", etvs.class});
        }
        if (iOrdinal == 3) {
            return new etus();
        }
        if (iOrdinal == 4) {
            return new etur();
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
        synchronized (etus.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
