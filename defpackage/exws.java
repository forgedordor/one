package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exws extends evsn implements evui {
    public static final exws a;
    private static volatile evuo c;
    private int d;
    private byte e = 2;
    public String b = "";

    static {
        exws exwsVar = new exws();
        a = exwsVar;
        evsn.registerDefaultInstance(exws.class, exwsVar);
    }

    private exws() {
        evqs evqsVar = evqs.b;
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new exws();
            case NEW_BUILDER:
                return new exwr();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = c;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exws.class) {
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
