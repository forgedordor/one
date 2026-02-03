package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exve extends evsn implements evui {
    public static final exve a;
    private static volatile evuo d;
    public int b;
    private byte e = 2;
    public evqs c = evqs.b;

    static {
        exve exveVar = new exve();
        a = exveVar;
        evsn.registerDefaultInstance(exve.class, exveVar);
    }

    private exve() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔊ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new exve();
            case NEW_BUILDER:
                return new exvd();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = d;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exve.class) {
                    evsgVar = d;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        d = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
