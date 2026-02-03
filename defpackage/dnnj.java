package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnnj extends evsn implements evui {
    public static final dnnj a;
    private static volatile evuo d;
    public evub b;
    public evub c;

    static {
        dnnj dnnjVar = new dnnj();
        a = dnnjVar;
        evsn.registerDefaultInstance(dnnj.class, dnnjVar);
    }

    private dnnj() {
        evub evubVar = evub.a;
        this.b = evubVar;
        this.c = evubVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"b", dnni.a, "c", dnnh.a});
        }
        if (iOrdinal == 3) {
            return new dnnj();
        }
        if (iOrdinal == 4) {
            return new dnne();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dnnj.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
