package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erxx extends evsn implements evui {
    public static final erxx a;
    private static volatile evuo h;
    public int b;
    public erxu g;
    private byte i = 2;
    public String c = "";
    public String d = "";
    public evtg e = evsn.emptyProtobufList();
    public evtg f = evsn.emptyProtobufList();

    static {
        erxx erxxVar = new erxx();
        a = erxxVar;
        evsn.registerDefaultInstance(erxx.class, erxxVar);
    }

    private erxx() {
        evsn.emptyProtobufList();
        evsn.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        evsn.emptyProtobufList();
        evsn.emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0001\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ț\u0007ᐉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new erxx();
            case NEW_BUILDER:
                return new erxw();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = h;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (erxx.class) {
                    evsgVar = h;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        h = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
