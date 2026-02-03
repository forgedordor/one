package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enva extends evsn implements evui {
    public static final enva a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        enva envaVar = new enva();
        a = envaVar;
        evsn.registerDefaultInstance(enva.class, envaVar);
    }

    private enva() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", envc.a, "d", enve.a});
        }
        if (iOrdinal == 3) {
            return new enva();
        }
        if (iOrdinal == 4) {
            return new enuz();
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
        synchronized (enva.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
