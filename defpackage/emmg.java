package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emmg extends evsn implements evui {
    public static final emmg a;
    public static final evsl b;
    private static volatile evuo e;
    public int c;
    public emme d;

    static {
        emmg emmgVar = new emmg();
        a = emmgVar;
        evsn.registerDefaultInstance(emmg.class, emmgVar);
        b = evsn.newSingularGeneratedExtension(emkw.a, emmgVar, emmgVar, null, 118, evwh.MESSAGE, emmg.class);
    }

    private emmg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new emmg();
        }
        if (iOrdinal == 4) {
            return new emmf();
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
        synchronized (emmg.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
