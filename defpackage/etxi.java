package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etxi extends evsn implements evui {
    public static final etxi a;
    private static volatile evuo g;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;

    static {
        etxi etxiVar = new etxi();
        a = etxiVar;
        evsn.registerDefaultInstance(etxi.class, etxiVar);
    }

    private etxi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new etxi();
        }
        if (iOrdinal == 4) {
            return new etxh();
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
        synchronized (etxi.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
