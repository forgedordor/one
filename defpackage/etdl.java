package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etdl extends evsn implements evui {
    public static final etdl a;
    private static volatile evuo f;
    public int b;
    public etdh d;
    public int c = 1;
    public evtg e = emptyProtobufList();

    static {
        etdl etdlVar = new etdl();
        a = etdlVar;
        evsn.registerDefaultInstance(etdl.class, etdlVar);
    }

    private etdl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"b", "c", etdf.a, "d", "e", etdj.class});
        }
        if (iOrdinal == 3) {
            return new etdl();
        }
        if (iOrdinal == 4) {
            return new etdk();
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
        synchronized (etdl.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
