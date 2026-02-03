package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epme extends evsn implements evui {
    public static final epme a;
    private static volatile evuo d;
    public String b = "";
    public boolean c;

    static {
        epme epmeVar = new epme();
        a = epmeVar;
        evsn.registerDefaultInstance(epme.class, epmeVar);
    }

    private epme() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new epme();
        }
        if (iOrdinal == 4) {
            return new epmd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epme.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
