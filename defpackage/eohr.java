package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eohr extends evsn implements evui {
    public static final eohr a;
    private static volatile evuo j;
    public int b;
    public int c;
    public evtg d = evsn.emptyProtobufList();
    public evtg e = evsn.emptyProtobufList();
    public evtg f = evsn.emptyProtobufList();
    public evtg g = evsn.emptyProtobufList();
    public eohi h;
    public boolean i;

    static {
        eohr eohrVar = new eohr();
        a = eohrVar;
        evsn.registerDefaultInstance(eohr.class, eohrVar);
    }

    private eohr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0004\u0000\u0001᠌\u0000\u0002\u001a\u0003\u001a\u0004\u001a\u0005\u001a\u0007ဉ\u0002\tဇ\u0004", new Object[]{"b", "c", eohq.a, "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new eohr();
        }
        if (iOrdinal == 4) {
            return new eohp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eohr.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
