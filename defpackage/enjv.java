package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enjv extends evsn implements evui {
    public static final enjv a;
    private static volatile evuo f;
    public int b;
    public int d;
    public String c = "";
    public evtg e = emptyProtobufList();

    static {
        enjv enjvVar = new enjv();
        a = enjvVar;
        evsn.registerDefaultInstance(enjv.class, enjvVar);
    }

    private enjv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u001b", new Object[]{"b", "c", "d", enjw.a, "e", enjt.class});
        }
        if (iOrdinal == 3) {
            return new enjv();
        }
        if (iOrdinal == 4) {
            return new enju();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enjv.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
