package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgax extends evsn<fgax, fgav> implements evui {
    public static final fgax DEFAULT_INSTANCE;
    public static final int FLAGS_FIELD_NUMBER = 1;
    private static volatile evuo<fgax> PARSER;
    public evub<String, fgau> flags_ = evub.a;

    static {
        fgax fgaxVar = new fgax();
        DEFAULT_INSTANCE = fgaxVar;
        evsn.registerDefaultInstance(fgax.class, fgaxVar);
    }

    private fgax() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"flags_", fgaw.a});
            case NEW_MUTABLE_INSTANCE:
                return new fgax();
            case NEW_BUILDER:
                return new fgav();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                evuo<fgax> evuoVar = PARSER;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (fgax.class) {
                    evsgVar = PARSER;
                    if (evsgVar == null) {
                        evsgVar = new evsg(DEFAULT_INSTANCE);
                        PARSER = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
