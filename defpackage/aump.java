package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aump extends evsn implements evui {
    public static final aump a;
    private static volatile evuo d;
    public int b;
    public long c;

    static {
        aump aumpVar = new aump();
        a = aumpVar;
        evsn.registerDefaultInstance(aump.class, aumpVar);
    }

    private aump() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aump();
        }
        if (iOrdinal == 4) {
            return new aumo();
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
        synchronized (aump.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
