package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewbe extends evsn implements evui {
    public static final ewbe a;
    private static volatile evuo e;
    public int b;
    public long c;
    public int d;

    static {
        ewbe ewbeVar = new ewbe();
        a = ewbeVar;
        evsn.registerDefaultInstance(ewbe.class, ewbeVar);
    }

    private ewbe() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဂ\u0000\u0004င\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ewbe();
        }
        if (iOrdinal == 4) {
            return new ewbd();
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
        synchronized (ewbe.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
