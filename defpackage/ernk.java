package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ernk extends evsn implements evui {
    public static final ernk a;
    private static volatile evuo f;
    public int b;
    public ernm c;
    public int d;
    public evqs e = evqs.b;

    static {
        ernk ernkVar = new ernk();
        a = ernkVar;
        evsn.registerDefaultInstance(ernk.class, ernkVar);
    }

    private ernk() {
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
            return new ernk();
        }
        if (iOrdinal == 4) {
            return new ernj();
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
        synchronized (ernk.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
