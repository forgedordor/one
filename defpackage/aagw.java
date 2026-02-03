package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagw extends evsn implements evui {
    public static final aagw a;
    private static volatile evuo d;
    public boolean b;
    public long c;

    static {
        aagw aagwVar = new aagw();
        a = aagwVar;
        evsn.registerDefaultInstance(aagw.class, aagwVar);
    }

    private aagw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0002", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aagw();
        }
        if (iOrdinal == 4) {
            return new aagv();
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
        synchronized (aagw.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
