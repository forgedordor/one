package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajct extends evsn implements evui {
    public static final ajct a;
    private static volatile evuo e;
    public int b;
    public evub c;
    public int d;
    private evub f;

    static {
        ajct ajctVar = new ajct();
        a = ajctVar;
        evsn.registerDefaultInstance(ajct.class, ajctVar);
    }

    private ajct() {
        evub evubVar = evub.a;
        this.f = evubVar;
        this.c = evubVar;
    }

    public final evub a() {
        evub evubVar = this.c;
        if (!evubVar.b) {
            this.c = evubVar.a();
        }
        return this.c;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0002\u0000\u0000\u00012\u00022\u0003င\u0000", new Object[]{"b", "f", ajcs.a, "c", ajcr.a, "d"});
        }
        if (iOrdinal == 3) {
            return new ajct();
        }
        if (iOrdinal == 4) {
            return new ajcq();
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
        synchronized (ajct.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
