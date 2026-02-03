package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewvd extends evsn implements evui {
    public static final ewvd a;
    public static final evsl b;
    private static volatile evuo e;
    public int c;
    public int d;

    static {
        ewvd ewvdVar = new ewvd();
        a = ewvdVar;
        evsn.registerDefaultInstance(ewvd.class, ewvdVar);
        b = evsn.newSingularGeneratedExtension(ewvl.a, ewvdVar, ewvdVar, null, 23, evwh.MESSAGE, ewvd.class);
    }

    private ewvd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new ewvd();
        }
        if (iOrdinal == 4) {
            return new ewvc();
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
        synchronized (ewvd.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
