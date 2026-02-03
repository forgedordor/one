package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enkw extends evsn implements evui {
    public static final enkw a;
    public static final evsl b;
    private static volatile evuo c;

    static {
        enkw enkwVar = new enkw();
        a = enkwVar;
        evsn.registerDefaultInstance(enkw.class, enkwVar);
        b = evsn.newSingularGeneratedExtension(emmz.a, enkwVar, enkwVar, null, 973, evwh.MESSAGE, enkw.class);
    }

    private enkw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new enkw();
        }
        if (iOrdinal == 4) {
            return new enkv();
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
        synchronized (enkw.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
