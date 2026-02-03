package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aavu extends evsn implements evui {
    public static final aavu a;
    private static volatile evuo c;
    public long b;

    static {
        aavu aavuVar = new aavu();
        a = aavuVar;
        evsn.registerDefaultInstance(aavu.class, aavuVar);
    }

    private aavu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new aavu();
        }
        if (iOrdinal == 4) {
            return new aavt();
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
        synchronized (aavu.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
