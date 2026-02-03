package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdi extends evsn implements evui {
    public static final sdi a;
    private static volatile evuo g;
    public int b;
    public sbr c;
    public sbt d;
    public sby e;
    public sca f;

    static {
        sdi sdiVar = new sdi();
        a = sdiVar;
        evsn.registerDefaultInstance(sdi.class, sdiVar);
    }

    private sdi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new sdi();
        }
        if (iOrdinal == 4) {
            return new sdh();
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
        synchronized (sdi.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
