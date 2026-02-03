package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejhz extends evsn implements evui {
    public static final ejhz a;
    private static volatile evuo g;
    public int b;
    public ejha c;
    public int e;
    public evtg d = emptyProtobufList();
    public int f = 1;

    static {
        ejhz ejhzVar = new ejhz();
        a = ejhzVar;
        evsn.registerDefaultInstance(ejhz.class, ejhzVar);
    }

    private ejhz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0001\u0000\u0005\u001b\u0006င\u0001\u0007ဉ\u0000\b᠌\u0002", new Object[]{"b", "d", ejhy.class, "e", "c", "f", ejik.a});
        }
        if (iOrdinal == 3) {
            return new ejhz();
        }
        if (iOrdinal == 4) {
            return new ejhw();
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
        synchronized (ejhz.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
