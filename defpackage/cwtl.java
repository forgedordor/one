package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwtl extends evsn implements evui {
    public static final cwtl a;
    private static volatile evuo g;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;

    static {
        cwtl cwtlVar = new cwtl();
        a = cwtlVar;
        evsn.registerDefaultInstance(cwtl.class, cwtlVar);
    }

    private cwtl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0004ဇ\u0002\u0005င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new cwtl();
        }
        if (iOrdinal == 4) {
            return new cwtk();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cwtl.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
