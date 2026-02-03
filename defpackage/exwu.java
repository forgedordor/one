package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exwu extends evsn implements evui {
    public static final exwu a;
    private static volatile evuo c;
    private int d;
    private byte h = 2;
    private String e = "";
    private String f = "";
    private String g = "";
    public evtg b = emptyProtobufList();

    static {
        exwu exwuVar = new exwu();
        a = exwuVar;
        evsn.registerDefaultInstance(exwu.class, exwuVar);
    }

    private exwu() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0001\u0004\u0003ᔈ\u0002\u0004ᔈ\u0003\u0005ᔈ\u0004\u0006Л", new Object[]{"d", "e", "f", "g", "b", exws.class});
            case NEW_MUTABLE_INSTANCE:
                return new exwu();
            case NEW_BUILDER:
                return new exwt();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = c;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exwu.class) {
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
