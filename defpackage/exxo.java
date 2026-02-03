package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exxo extends evsi implements evsj {
    public static final exxo a;
    private static volatile evuo d;
    public exyc c;
    private int e;
    private exya f;
    private byte g = 2;
    public evtg b = evsn.emptyProtobufList();

    static {
        exxo exxoVar = new exxo();
        a = exxoVar;
        evsn.registerDefaultInstance(exxo.class, exxoVar);
    }

    private exxo() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"e", "b", "f", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new exxo();
            case NEW_BUILDER:
                return new exxn();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = d;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exxo.class) {
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
