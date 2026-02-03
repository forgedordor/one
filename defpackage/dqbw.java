package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqbw extends evsn implements dqbz {
    public static final dqbw a;
    private static volatile evuo e;
    public int b;
    public dqcs c;
    public dqcf d;

    static {
        dqbw dqbwVar = new dqbw();
        a = dqbwVar;
        evsn.registerDefaultInstance(dqbw.class, dqbwVar);
    }

    private dqbw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dqbw();
        }
        if (iOrdinal == 4) {
            return new dqbv();
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
        synchronized (dqbw.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
