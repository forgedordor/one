package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epoo extends evsn implements evui {
    public static final epoo a;
    private static volatile evuo c;
    public int b;

    static {
        epoo epooVar = new epoo();
        a = epooVar;
        evsn.registerDefaultInstance(epoo.class, epooVar);
    }

    private epoo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new epoo();
        }
        if (iOrdinal == 4) {
            return new epom();
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
        synchronized (epoo.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
