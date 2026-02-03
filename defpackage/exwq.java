package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exwq extends evsn implements evui {
    public static final exwq a;
    private static volatile evuo c;
    public exwu b;
    private int d;
    private exwo f;
    private byte g = 2;
    private String e = "";

    static {
        exwq exwqVar = new exwq();
        a = exwqVar;
        evsn.registerDefaultInstance(exwq.class, exwqVar);
    }

    private exwq() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔉ\u0001\u0003ᔉ\u0002", new Object[]{"d", "e", "b", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new exwq();
            case NEW_BUILDER:
                return new exwp();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = c;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exwq.class) {
                    evsgVar = c;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        c = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
