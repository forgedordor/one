package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqno extends evsn implements evui {
    public static final eqno a;
    private static volatile evuo d;
    public int b;
    public String c = "";

    static {
        eqno eqnoVar = new eqno();
        a = eqnoVar;
        evsn.registerDefaultInstance(eqno.class, eqnoVar);
    }

    private eqno() {
        emptyIntList();
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eqno();
        }
        if (iOrdinal == 4) {
            return new eqnm();
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
        synchronized (eqno.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
