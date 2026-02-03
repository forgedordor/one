package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ernc extends evsn implements evui {
    public static final ernc a;
    private static volatile evuo f;
    public int b;
    public erne c;
    public int d;
    public evqs e = evqs.b;

    static {
        ernc erncVar = new ernc();
        a = erncVar;
        evsn.registerDefaultInstance(ernc.class, erncVar);
    }

    private ernc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ernc();
        }
        if (iOrdinal == 4) {
            return new ernb();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ernc.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
