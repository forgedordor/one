package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eohx extends evsn implements evui {
    public static final eohx a;
    private static volatile evuo f;
    public int b;
    public int d;
    public eohz e;
    private byte g = 2;
    public int c = -1;

    static {
        eohx eohxVar = new eohx();
        a = eohxVar;
        evsn.registerDefaultInstance(eohx.class, eohxVar);
    }

    private eohx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\r\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0003\rᐉ\u000b", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new eohx();
            case NEW_BUILDER:
                return new eohw();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = f;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eohx.class) {
                    evsgVar = f;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        f = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
