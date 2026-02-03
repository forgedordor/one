package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eogq extends evsn implements evui {
    public static final eogq a;
    private static volatile evuo d;
    public int b;
    public eogk c;
    private eoga e;
    private byte f = 2;

    static {
        eogq eogqVar = new eogq();
        a = eogqVar;
        evsn.registerDefaultInstance(eogq.class, eogqVar);
    }

    private eogq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"b", "e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new eogq();
            case NEW_BUILDER:
                return new eogp();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = d;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eogq.class) {
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
