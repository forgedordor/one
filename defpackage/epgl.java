package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epgl extends evsn implements evui {
    public static final epgl a;
    private static volatile evuo h;
    public String b = "";
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;

    static {
        epgl epglVar = new epgl();
        a = epglVar;
        evsn.registerDefaultInstance(epgl.class, epglVar);
    }

    private epgl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\f\u0005\f\u0006\u0007", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new epgl();
        }
        if (iOrdinal == 4) {
            return new epgk();
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
        synchronized (epgl.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
