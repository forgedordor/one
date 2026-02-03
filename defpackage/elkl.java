package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elkl extends evsn implements evui {
    public static final elkl a;
    private static volatile evuo f;
    public int b;
    public int c;
    public long d;
    public evtg e = emptyProtobufList();

    static {
        elkl elklVar = new elkl();
        a = elklVar;
        evsn.registerDefaultInstance(elkl.class, elklVar);
    }

    private elkl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"b", "c", elkj.a, "d", "e", elwl.class});
        }
        if (iOrdinal == 3) {
            return new elkl();
        }
        if (iOrdinal == 4) {
            return new elkk();
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
        synchronized (elkl.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
