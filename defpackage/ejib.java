package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejib extends evsn implements evui {
    public static final ejib a;
    private static volatile evuo e;
    public int b;
    public float c;
    public evtg d = evsn.emptyProtobufList();

    static {
        ejib ejibVar = new ejib();
        a = ejibVar;
        evsn.registerDefaultInstance(ejib.class, ejibVar);
    }

    private ejib() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ခ\u0000\u0002\u001a", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ejib();
        }
        if (iOrdinal == 4) {
            return new ejia();
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
        synchronized (ejib.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
