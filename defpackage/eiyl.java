package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiyl extends evsn implements evui {
    public static final eiyl a;
    private static volatile evuo g;
    public eizm e;
    private int h;
    public String b = "";
    public String c = "";
    public evtg d = emptyProtobufList();
    public evtg f = emptyProtobufList();

    static {
        eiyl eiylVar = new eiyl();
        a = eiylVar;
        evsn.registerDefaultInstance(eiyl.class, eiylVar);
    }

    private eiyl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\b\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0004\u001b\u0006ဉ\u0001\b\u001b", new Object[]{"h", "b", "c", "d", eiyo.class, "e", "f", eizk.class});
        }
        if (iOrdinal == 3) {
            return new eiyl();
        }
        if (iOrdinal == 4) {
            return new eiyk();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eiyl.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
