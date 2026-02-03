package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elsh extends evsn implements evui {
    public static final elsh a;
    private static volatile evuo k;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public evtg i = emptyProtobufList();
    public boolean j;

    static {
        elsh elshVar = new elsh();
        a = elshVar;
        evsn.registerDefaultInstance(elsh.class, elshVar);
    }

    private elsh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0000\u0001᠌\u0000\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007\t\u001b\nဇ\b", new Object[]{"b", "c", enwq.a, "d", elsd.a, "e", elsc.a, "f", elsb.a, "g", Celse.a, "h", elsa.a, "i", enxa.class, "j"});
        }
        if (iOrdinal == 3) {
            return new elsh();
        }
        if (iOrdinal == 4) {
            return new elsg();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elsh.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
