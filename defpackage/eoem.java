package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoem extends evsn implements evui {
    public static final eoem a;
    private static volatile evuo m;
    public int b;
    public int c;
    public eoep d;
    public int e;
    public float f;
    public int g;
    public int i;
    public int j;
    public evsx h = emptyIntList();
    public String k = "";
    public String l = "";

    static {
        eoem eoemVar = new eoem();
        a = eoemVar;
        evsn.registerDefaultInstance(eoem.class, eoemVar);
    }

    private eoem() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0002\u0003ခ\u0003\u0004ဌ\u0004\u0005,\u0006ဉ\u0001\u0007ဌ\u0005\bဌ\u0006\tለ\u0007\nለ\b", new Object[]{"b", "c", "e", "f", "g", "h", "d", "i", "j", "k", "l"});
        }
        if (iOrdinal == 3) {
            return new eoem();
        }
        if (iOrdinal == 4) {
            return new eoel();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = m;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eoem.class) {
            evsgVar = m;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                m = evsgVar;
            }
        }
        return evsgVar;
    }
}
