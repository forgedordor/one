package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enhs extends evsn implements evui {
    public static final enhs a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        enhs enhsVar = new enhs();
        a = enhsVar;
        evsn.registerDefaultInstance(enhs.class, enhsVar);
    }

    private enhs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", enhw.class, enhy.class});
        }
        if (iOrdinal == 3) {
            return new enhs();
        }
        if (iOrdinal == 4) {
            return new enhr();
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
        synchronized (enhs.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
