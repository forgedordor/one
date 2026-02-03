package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupf extends evsn implements evui {
    public static final eupf a;
    private static volatile evuo c;
    private byte d = 2;
    public evtg b = emptyProtobufList();

    static {
        eupf eupfVar = new eupf();
        a = eupfVar;
        evsn.registerDefaultInstance(eupf.class, eupfVar);
    }

    private eupf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.d);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", eupl.class});
            case NEW_MUTABLE_INSTANCE:
                return new eupf();
            case NEW_BUILDER:
                return new eupe();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = c;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eupf.class) {
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
