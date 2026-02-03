package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdri extends evsn implements evui {
    public static final cdri a;
    private static volatile evuo d;
    public long b;
    public boolean c;

    static {
        cdri cdriVar = new cdri();
        a = cdriVar;
        evsn.registerDefaultInstance(cdri.class, cdriVar);
    }

    private cdri() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002\u0007", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new cdri();
        }
        if (iOrdinal == 4) {
            return new cdrh();
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
        synchronized (cdri.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
