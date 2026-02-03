package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erxy extends evsn implements evui {
    public static final erxy a;
    private static volatile evuo e;
    public evtg c;
    public evtg d;
    private byte f = 2;
    public evtg b = emptyProtobufList();

    static {
        erxy erxyVar = new erxy();
        a = erxyVar;
        evsn.registerDefaultInstance(erxy.class, erxyVar);
    }

    private erxy() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.c = evsn.emptyProtobufList();
        this.d = evsn.emptyProtobufList();
        evsn.emptyProtobufList();
        evsn.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u000f\u0003\u0000\u0003\u0001\u0001Л\nȚ\u000fȚ", new Object[]{"b", erxx.class, "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new erxy();
            case NEW_BUILDER:
                return new erxv();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (erxy.class) {
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
