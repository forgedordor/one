package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjhy extends evsn implements evui {
    public static final cjhy a;
    private static volatile evuo h;
    public int b;
    public String c = "";
    public cjju d;
    public cjju e;
    public boolean f;
    public int g;

    static {
        cjhy cjhyVar = new cjhy();
        a = cjhyVar;
        evsn.registerDefaultInstance(cjhy.class, cjhyVar);
    }

    private cjhy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", "f", "g", cjhw.a});
        }
        if (iOrdinal == 3) {
            return new cjhy();
        }
        if (iOrdinal == 4) {
            return new cjhv();
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
        synchronized (cjhy.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
