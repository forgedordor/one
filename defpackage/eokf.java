package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eokf extends evsn implements evui {
    public static final eokf a;
    private static volatile evuo i;
    public int b;
    public long c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;

    static {
        eokf eokfVar = new eokf();
        a = eokfVar;
        evsn.registerDefaultInstance(eokf.class, eokfVar);
    }

    private eokf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006᠌\u0005", new Object[]{"b", "c", "d", eokd.a, "e", "f", "g", "h", eoke.a});
        }
        if (iOrdinal == 3) {
            return new eokf();
        }
        if (iOrdinal == 4) {
            return new eokc();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eokf.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
