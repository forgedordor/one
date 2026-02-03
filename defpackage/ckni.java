package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckni extends evsn implements evui {
    public static final ckni a;
    private static volatile evuo d;
    public int b;
    public boolean c;

    static {
        ckni ckniVar = new ckni();
        a = ckniVar;
        evsn.registerDefaultInstance(ckni.class, ckniVar);
    }

    private ckni() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ckni();
        }
        if (iOrdinal == 4) {
            return new cknh();
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
        synchronized (ckni.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
