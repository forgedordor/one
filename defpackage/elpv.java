package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elpv extends evsn implements evui {
    public static final elpv a;
    private static volatile evuo h;
    public int b;
    public int c;
    public int d;
    public int e;
    public elit f;
    public int g;

    static {
        elpv elpvVar = new elpv();
        a = elpvVar;
        evsn.registerDefaultInstance(elpv.class, elpvVar);
    }

    private elpv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0006င\u0005\u0007ဉ\u0006\bင\u0007", new Object[]{"b", "c", elps.a, "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new elpv();
        }
        if (iOrdinal == 4) {
            return new elpu();
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
        synchronized (elpv.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
