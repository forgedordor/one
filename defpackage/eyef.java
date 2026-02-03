package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyef extends evsn implements evui {
    public static final eyef a;
    private static volatile evuo d;
    public int b;
    public float c;

    static {
        eyef eyefVar = new eyef();
        a = eyefVar;
        evsn.registerDefaultInstance(eyef.class, eyefVar);
    }

    private eyef() {
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
            return new eyef();
        }
        if (iOrdinal == 4) {
            return new eyee();
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
        synchronized (eyef.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
