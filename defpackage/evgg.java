package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evgg extends evsn implements evui {
    public static final evgg a;
    private static volatile evuo e;
    public long d;
    private int f;
    private byte g = 2;
    public evtg b = emptyProtobufList();
    public String c = "";

    static {
        evgg evggVar = new evgg();
        a = evggVar;
        evsn.registerDefaultInstance(evgg.class, evggVar);
    }

    private evgg() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0007ဂ\u0001", new Object[]{"f", "b", evgf.class, "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new evgg();
            case NEW_BUILDER:
                return new evgd();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (evgg.class) {
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
