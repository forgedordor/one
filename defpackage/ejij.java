package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejij extends evsn implements evui {
    public static final ejij a;
    private static volatile evuo c;
    public boolean b = true;
    private int d;

    static {
        ejij ejijVar = new ejij();
        a = ejijVar;
        evsn.registerDefaultInstance(ejij.class, ejijVar);
    }

    private ejij() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new ejij();
        }
        if (iOrdinal == 4) {
            return new ejii();
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
        synchronized (ejij.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
