package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coqd extends evsn implements evui {
    public static final coqd a;
    private static volatile evuo h;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public long f;
    public int g;

    static {
        coqd coqdVar = new coqd();
        a = coqdVar;
        evsn.registerDefaultInstance(coqd.class, coqdVar);
    }

    private coqd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", "f", "g", enyv.a});
        }
        if (iOrdinal == 3) {
            return new coqd();
        }
        if (iOrdinal == 4) {
            return new coqc();
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
        synchronized (coqd.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
