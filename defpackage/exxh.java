package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exxh extends evsi implements evsj {
    public static final exxh a;
    private static volatile evuo d;
    public exyc c;
    private int e;
    private exxm f;
    private exya g;
    private byte h = 2;
    public evtg b = evsn.emptyProtobufList();

    static {
        exxh exxhVar = new exxh();
        a = exxhVar;
        evsn.registerDefaultInstance(exxh.class, exxhVar);
    }

    private exxh() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\r\u0004\u0000\u0001\u0000\u0001\u001a\u0004ဉ\u0005\u0007ဉ\u0007\rဉ\u0004", new Object[]{"e", "b", "g", "c", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new exxh();
            case NEW_BUILDER:
                return new exxg();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = d;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exxh.class) {
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
