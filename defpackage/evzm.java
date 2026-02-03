package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evzm extends evsn implements evui {
    public static final evzm a;
    private static volatile evuo d;
    private byte e = 2;
    public evtg b = emptyProtobufList();
    public evtg c = emptyProtobufList();

    static {
        evzm evzmVar = new evzm();
        a = evzmVar;
        evsn.registerDefaultInstance(evzm.class, evzmVar);
    }

    private evzm() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"b", ewuw.class, "c", ewuw.class});
            case NEW_MUTABLE_INSTANCE:
                return new evzm();
            case NEW_BUILDER:
                return new evzl();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = d;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (evzm.class) {
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
