package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fegs extends evsn implements evui {
    public static final fegs a;
    private static volatile evuo h;
    public int b;
    public fegw c;
    public long d;
    public String e = "";
    public int f;
    public long g;

    static {
        fegs fegsVar = new fegs();
        a = fegsVar;
        evsn.registerDefaultInstance(fegs.class, fegsVar);
    }

    private fegs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဃ\u0001\u0006ဈ\u0003\u0007᠌\u0004\bဃ\u0005", new Object[]{"b", "c", "d", "e", "f", fegr.a, "g"});
        }
        if (iOrdinal == 3) {
            return new fegs();
        }
        if (iOrdinal == 4) {
            return new fegq();
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
        synchronized (fegs.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
