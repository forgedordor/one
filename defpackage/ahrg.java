package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahrg extends evsn implements evui {
    public static final ahrg a;
    private static volatile evuo f;
    public int b;
    public ahrj c;
    public ahrj d;
    public ahrv e;

    static {
        ahrg ahrgVar = new ahrg();
        a = ahrgVar;
        evsn.registerDefaultInstance(ahrg.class, ahrgVar);
    }

    private ahrg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ahrg();
        }
        if (iOrdinal == 4) {
            return new ahrf();
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
        synchronized (ahrg.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
