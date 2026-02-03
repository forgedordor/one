package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evju extends evsn implements evui {
    public static final evju a;
    private static volatile evuo c;
    public long b;
    private int d;

    static {
        evju evjuVar = new evju();
        a = evjuVar;
        evsn.registerDefaultInstance(evju.class, evjuVar);
    }

    private evju() {
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဂ\u0001", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new evju();
        }
        if (iOrdinal == 4) {
            return new evjt();
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
        synchronized (evju.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
