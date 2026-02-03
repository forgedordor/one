package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtpv extends evsn implements evui {
    public static final dtpv a;
    public static final evsl b;
    private static volatile evuo g;
    public int c;
    public evub f = evub.a;
    public evtg d = emptyProtobufList();
    public int e = 1;

    static {
        dtpv dtpvVar = new dtpv();
        a = dtpvVar;
        evsn.registerDefaultInstance(dtpv.class, dtpvVar);
        b = evsn.newSingularGeneratedExtension(ewvl.a, dtpvVar, dtpvVar, null, 329110223, evwh.MESSAGE, dtpv.class);
    }

    private dtpv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0001\u0000\u0001\u001b\u0002င\u0000\u00032", new Object[]{"c", "d", dtpy.class, "e", "f", dtpu.a});
        }
        if (iOrdinal == 3) {
            return new dtpv();
        }
        if (iOrdinal == 4) {
            return new dtpr();
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
        synchronized (dtpv.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
