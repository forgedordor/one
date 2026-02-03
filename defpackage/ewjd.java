package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewjd extends evsn implements evui {
    public static final ewjd a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public long e;
    public evtg f = emptyProtobufList();

    static {
        ewjd ewjdVar = new ewjd();
        a = ewjdVar;
        evsn.registerDefaultInstance(ewjd.class, ewjdVar);
    }

    private ewjd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003\u001b\u0004ဂ\u0002", new Object[]{"b", "c", ewix.a, "d", "f", ewjc.class, "e"});
        }
        if (iOrdinal == 3) {
            return new ewjd();
        }
        if (iOrdinal == 4) {
            return new ewiw();
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
        synchronized (ewjd.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
