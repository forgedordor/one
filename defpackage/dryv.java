package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dryv extends evsn implements evui {
    public static final dryv a;
    public static final evsl b;
    private static volatile evuo e;
    public int c = 0;
    public Object d;

    static {
        dryv dryvVar = new dryv();
        a = dryvVar;
        evsn.registerDefaultInstance(dryv.class, dryvVar);
        b = evsn.newSingularGeneratedExtension(dryj.a, dryvVar, dryvVar, null, 9003, evwh.MESSAGE, dryv.class);
    }

    private dryv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"d", "c", dryu.class, dryq.class, drys.class});
        }
        if (iOrdinal == 3) {
            return new dryv();
        }
        if (iOrdinal == 4) {
            return new dryo();
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
        synchronized (dryv.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
