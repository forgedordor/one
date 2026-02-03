package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoes extends evsn implements evui {
    public static final eoes a;
    private static volatile evuo k;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public eofm j;

    static {
        eoes eoesVar = new eoes();
        a = eoesVar;
        evsn.registerDefaultInstance(eoes.class, eoesVar);
    }

    private eoes() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဉ\u0007\bင\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "i"});
        }
        if (iOrdinal == 3) {
            return new eoes();
        }
        if (iOrdinal == 4) {
            return new eoeq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eoes.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
