package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejra extends evsn implements evui {
    public static final ejra a;
    private static volatile evuo d;
    public evqs c;
    private byte e = 2;
    public evtg b = emptyProtobufList();

    static {
        ejra ejraVar = new ejra();
        a = ejraVar;
        evsn.registerDefaultInstance(ejra.class, ejraVar);
    }

    private ejra() {
        emptyProtobufList();
        this.c = evqs.b;
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0001\u0001\u0001Л\u0004\n", new Object[]{"b", ejrt.class, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ejra();
            case NEW_BUILDER:
                return new ejqz();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = d;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ejra.class) {
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
