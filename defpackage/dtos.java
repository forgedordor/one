package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtos extends evsn implements evui {
    public static final dtos a;
    public static final evsl b;
    private static volatile evuo f;
    public int c;
    public long d;
    public long e;

    static {
        dtos dtosVar = new dtos();
        a = dtosVar;
        evsn.registerDefaultInstance(dtos.class, dtosVar);
        b = evsn.newSingularGeneratedExtension(dtnq.a, dtosVar, dtosVar, null, 1000, evwh.MESSAGE, dtos.class);
    }

    private dtos() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new dtos();
        }
        if (iOrdinal == 4) {
            return new dtor();
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
        synchronized (dtos.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
