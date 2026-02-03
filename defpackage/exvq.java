package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exvq extends evsi implements evsj {
    public static final exvq a;
    private static volatile evuo e;
    public int b;
    public exvp c;
    public evrj d;
    private byte f = 2;

    static {
        exvq exvqVar = new exvq();
        a = exvqVar;
        evsn.registerDefaultInstance(exvq.class, exvqVar);
    }

    private exvq() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0006\u0002\u0000\u0000\u0000\u0003ဉ\u0002\u0006ဉ\u0001", new Object[]{"b", "d", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new exvq();
            case NEW_BUILDER:
                return new exvn();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exvq.class) {
                    evsgVar = e;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        e = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
