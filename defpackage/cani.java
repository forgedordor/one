package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cani extends evsn implements evui {
    public static final cani a;
    private static volatile evuo h;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public evvp f;
    public evvp g;

    static {
        cani caniVar = new cani();
        a = caniVar;
        evsn.registerDefaultInstance(cani.class, caniVar);
    }

    private cani() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဉ\u0003\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new cani();
        }
        if (iOrdinal == 4) {
            return new canh();
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
        synchronized (cani.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
