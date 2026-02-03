package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class set extends evsn implements evui {
    public static final set a;
    private static volatile evuo e;
    public int b;
    public boolean c;
    public long d;

    static {
        set setVar = new set();
        a = setVar;
        evsn.registerDefaultInstance(set.class, setVar);
    }

    private set() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဃ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new set();
        }
        if (iOrdinal == 4) {
            return new ses();
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
        synchronized (set.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
