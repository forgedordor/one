package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evbz extends evsn implements evui {
    public static final evbz a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public int d;

    static {
        evbz evbzVar = new evbz();
        a = evbzVar;
        evsn.registerDefaultInstance(evbz.class, evbzVar);
    }

    private evbz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", evbx.a});
        }
        if (iOrdinal == 3) {
            return new evbz();
        }
        if (iOrdinal == 4) {
            return new evbw();
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
        synchronized (evbz.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
