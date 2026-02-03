package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfu extends evsn implements evui {
    public static final abfu a;
    private static volatile evuo h;
    public int b;
    public Object d;
    public boolean f;
    public int g;
    public int c = 0;
    public String e = "";

    static {
        abfu abfuVar = new abfu();
        a = abfuVar;
        evsn.registerDefaultInstance(abfu.class, abfuVar);
    }

    private abfu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003;\u0000\u0004᠌\u0002", new Object[]{"d", "c", "b", "e", "f", "g", abfs.a});
        }
        if (iOrdinal == 3) {
            return new abfu();
        }
        if (iOrdinal == 4) {
            return new abfr();
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
        synchronized (abfu.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
