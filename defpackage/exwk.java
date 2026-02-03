package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exwk extends evsn implements evui {
    public static final exwk a;
    private static volatile evuo e;
    public int b;
    private byte g = 2;
    public String c = "";
    public evqs d = evqs.b;
    private String f = "";

    static {
        exwk exwkVar = new exwk();
        a = exwkVar;
        evsn.registerDefaultInstance(exwk.class, exwkVar);
    }

    private exwk() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ᔈ\u0000\u0003ည\u0002\u0004ᔈ\u0003", new Object[]{"b", "c", "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new exwk();
            case NEW_BUILDER:
                return new exwj();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exwk.class) {
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
