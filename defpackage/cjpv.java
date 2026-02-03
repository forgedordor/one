package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjpv extends evsn implements evui {
    public static final cjpv a;
    private static volatile evuo c;
    public evtg b = evsn.emptyProtobufList();

    static {
        cjpv cjpvVar = new cjpv();
        a = cjpvVar;
        evsn.registerDefaultInstance(cjpv.class, cjpvVar);
    }

    private cjpv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new cjpv();
        }
        if (iOrdinal == 4) {
            return new cjpu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cjpv.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
