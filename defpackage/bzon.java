package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzon extends evsn implements evui {
    public static final evsy a = new bzoi();
    public static final bzon b;
    private static volatile evuo i;
    public int c;
    public int d;
    public int e;
    public int f = 1;
    public evsx g = emptyIntList();
    public int h;

    static {
        bzon bzonVar = new bzon();
        b = bzonVar;
        evsn.registerDefaultInstance(bzon.class, bzonVar);
    }

    private bzon() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = bzok.a;
            return newMessageInfo(b, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ࠞ\u0005᠌\u0003", new Object[]{"c", "d", "e", evsvVar, "f", bzom.a, "g", evsvVar, "h", cpyn.a});
        }
        if (iOrdinal == 3) {
            return new bzon();
        }
        if (iOrdinal == 4) {
            return new bzoj();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (bzon.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
