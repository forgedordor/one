package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejin extends evsn implements evui {
    public static final ejin a;
    private static volatile evuo f;
    public int b;
    public ejha c;
    public int d;
    public boolean e = true;

    static {
        ejin ejinVar = new ejin();
        a = ejinVar;
        evsn.registerDefaultInstance(ejin.class, ejinVar);
    }

    private ejin() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003င\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ejin();
        }
        if (iOrdinal == 4) {
            return new ejim();
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
        synchronized (ejin.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
