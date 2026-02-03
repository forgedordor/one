package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ensx extends evsn implements evui {
    public static final ensx a;
    private static volatile evuo h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    private boolean i;

    static {
        ensx ensxVar = new ensx();
        a = ensxVar;
        evsn.registerDefaultInstance(ensx.class, ensxVar);
    }

    private ensx() {
    }

    public static /* synthetic */ void a(ensx ensxVar) {
        ensxVar.b |= 8;
        ensxVar.i = true;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"b", "c", enti.a, "d", ensw.a, "e", ensu.a, "i", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ensx();
        }
        if (iOrdinal == 4) {
            return new enst();
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
        synchronized (ensx.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
