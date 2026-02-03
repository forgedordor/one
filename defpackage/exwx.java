package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exwx extends evsn implements evui {
    public static final exwx a;
    private static volatile evuo d;
    private int e;
    private byte f = 2;
    public String b = "";
    public String c = "";

    static {
        exwx exwxVar = new exwx();
        a = exwxVar;
        evsn.registerDefaultInstance(exwx.class, exwxVar);
    }

    private exwx() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0006ဈ\u0005", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new exwx();
            case NEW_BUILDER:
                return new exww();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = d;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exwx.class) {
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
