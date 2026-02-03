package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckbv extends evsn implements evui {
    public static final ckbv a;
    private static volatile evuo d;
    public evub b;
    public evub c;

    static {
        ckbv ckbvVar = new ckbv();
        a = ckbvVar;
        evsn.registerDefaultInstance(ckbv.class, ckbvVar);
    }

    private ckbv() {
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
            return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"b", ckbt.a, "c", ckbu.a});
        }
        if (iOrdinal == 3) {
            return new ckbv();
        }
        if (iOrdinal == 4) {
            return new ckbs();
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
        synchronized (ckbv.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
