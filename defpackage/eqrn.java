package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqrn extends evsn implements evui {
    public static final eqrn a;
    private static volatile evuo i;
    public int b;
    public evvp d;
    public int g;
    public evtg c = emptyProtobufList();
    public evqs e = evqs.b;
    public String f = "";
    public evtg h = emptyProtobufList();

    static {
        eqrn eqrnVar = new eqrn();
        a = eqrnVar;
        evsn.registerDefaultInstance(eqrn.class, eqrnVar);
    }

    private eqrn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u001c\u0002ဉ\u0000\u0003\n\u0004Ȉ\u0005\f\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", evvp.class});
        }
        if (iOrdinal == 3) {
            return new eqrn();
        }
        if (iOrdinal == 4) {
            return new eqrl();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eqrn.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
