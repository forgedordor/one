package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewaj extends evsn implements evui {
    public static final ewaj a;
    private static volatile evuo e;
    public int b;
    public int c;
    public evtg d = emptyProtobufList();

    static {
        ewaj ewajVar = new ewaj();
        a = ewajVar;
        evsn.registerDefaultInstance(ewaj.class, ewajVar);
    }

    private ewaj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"b", "c", ewus.a, "d", ewai.class});
        }
        if (iOrdinal == 3) {
            return new ewaj();
        }
        if (iOrdinal == 4) {
            return new ewag();
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
        synchronized (ewaj.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
