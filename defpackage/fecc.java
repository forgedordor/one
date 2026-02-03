package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fecc extends evsn implements evui {
    public static final fecc a;
    private static volatile evuo j;
    public int b;
    public fhaz c;
    public febw d;
    public int e;
    public int f;
    public int g;
    public evvp h;
    public febz i;

    static {
        fecc feccVar = new fecc();
        a = feccVar;
        evsn.registerDefaultInstance(fecc.class, feccVar);
    }

    private fecc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f\u0004\f\u0007ဉ\u0002\nဉ\u0005\u000b\f", new Object[]{"b", "c", "d", "e", "f", "h", "i", "g"});
        }
        if (iOrdinal == 3) {
            return new fecc();
        }
        if (iOrdinal == 4) {
            return new febx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (fecc.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
