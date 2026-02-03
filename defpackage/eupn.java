package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupn extends evsn implements evui {
    public static final eupn a;
    private static volatile evuo b;
    private int c;
    private int d;
    private byte e = 2;

    static {
        eupn eupnVar = new eupn();
        a = eupnVar;
        evsn.registerDefaultInstance(eupn.class, eupnVar);
    }

    private eupn() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᔄ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new eupn();
            case NEW_BUILDER:
                return new eupm();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = b;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eupn.class) {
                    evsgVar = b;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        b = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
