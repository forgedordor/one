package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyes extends evsn implements evui {
    public static final eyes a;
    private static volatile evuo e;
    public Object c;
    public int b = 0;
    public evtg d = emptyProtobufList();

    static {
        eyes eyesVar = new eyes();
        a = eyesVar;
        evsn.registerDefaultInstance(eyes.class, eyesVar);
    }

    private eyes() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u00018\u0000\u0003\u001b\u00045\u0000", new Object[]{"c", "b", "d", eyeq.class});
        }
        if (iOrdinal == 3) {
            return new eyes();
        }
        if (iOrdinal == 4) {
            return new eyer();
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
        synchronized (eyes.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
