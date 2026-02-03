package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scj extends evsn implements evui {
    public static final scj a;
    private static volatile evuo d;
    public int b;
    public float c;

    static {
        scj scjVar = new scj();
        a = scjVar;
        evsn.registerDefaultInstance(scj.class, scjVar);
    }

    private scj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new scj();
        }
        if (iOrdinal == 4) {
            return new sci();
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
        synchronized (scj.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
