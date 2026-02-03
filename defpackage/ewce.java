package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewce extends evsn implements evui {
    public static final ewce a;
    private static volatile evuo e;
    public int b;
    public int c;
    public evtg d = emptyProtobufList();

    static {
        ewce ewceVar = new ewce();
        a = ewceVar;
        evsn.registerDefaultInstance(ewce.class, ewceVar);
    }

    private ewce() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0003\u001c", new Object[]{"b", "c", ewcd.a, "d"});
        }
        if (iOrdinal == 3) {
            return new ewce();
        }
        if (iOrdinal == 4) {
            return new ewcc();
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
        synchronized (ewce.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
