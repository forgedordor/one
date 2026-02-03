package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evyu extends evsn implements evui {
    public static final evyu a;
    private static volatile evuo e;
    public int b;
    public int c;
    public String d = "";

    static {
        evyu evyuVar = new evyu();
        a = evyuVar;
        evsn.registerDefaultInstance(evyu.class, evyuVar);
    }

    private evyu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"b", "c", evys.a, "d"});
        }
        if (iOrdinal == 3) {
            return new evyu();
        }
        if (iOrdinal == 4) {
            return new evyt();
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
        synchronized (evyu.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
