package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emjo extends evsn implements evui {
    public static final emjo a;
    private static volatile evuo e;
    public int b;
    public long c;
    public elho d;

    static {
        emjo emjoVar = new emjo();
        a = emjoVar;
        evsn.registerDefaultInstance(emjo.class, emjoVar);
    }

    private emjo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new emjo();
        }
        if (iOrdinal == 4) {
            return new emjn();
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
        synchronized (emjo.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
