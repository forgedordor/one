package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feep extends evsn implements evui {
    public static final feep a;
    private static volatile evuo h;
    public int b;
    public feem c;
    public fehb d;
    public int e;
    public feek f;
    public String g = "";

    static {
        feep feepVar = new feep();
        a = feepVar;
        evsn.registerDefaultInstance(feep.class, feepVar);
    }

    private feep() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", feeo.a, "f", "g"});
        }
        if (iOrdinal == 3) {
            return new feep();
        }
        if (iOrdinal == 4) {
            return new feen();
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
        synchronized (feep.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
