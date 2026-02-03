package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doka extends evsn implements evui {
    public static final doka a;
    private static volatile evuo h;
    public int b;
    public int c = 0;
    public Object d;
    public evrj e;
    public dqbw f;
    public dokx g;

    static {
        doka dokaVar = new doka();
        a = dokaVar;
        evsn.registerDefaultInstance(doka.class, dokaVar);
    }

    private doka() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001È\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001dဉ\u0002È<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", dojz.class});
        }
        if (iOrdinal == 3) {
            return new doka();
        }
        if (iOrdinal == 4) {
            return new dojx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (doka.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
