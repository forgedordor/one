package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fecy extends evsn implements evui {
    public static final fecy a;
    private static volatile evuo e;
    public int b;
    public long c;
    public String d = "";

    static {
        fecy fecyVar = new fecy();
        a = fecyVar;
        evsn.registerDefaultInstance(fecy.class, fecyVar);
    }

    private fecy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new fecy();
        }
        if (iOrdinal == 4) {
            return new fecx();
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
        synchronized (fecy.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
