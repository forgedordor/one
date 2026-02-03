package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evya extends evsn implements evui {
    public static final evya a;
    private static volatile evuo h;
    public int b;
    public int d;
    public int e;
    public int f;
    public String c = "";
    public String g = "";

    static {
        evya evyaVar = new evya();
        a = evyaVar;
        evsn.registerDefaultInstance(evya.class, evyaVar);
    }

    private evya() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f\u0004\u0004\u0005ለ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new evya();
        }
        if (iOrdinal == 4) {
            return new evxz();
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
        synchronized (evya.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
