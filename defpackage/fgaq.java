package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgaq extends evsn<fgaq, fgal> implements evui {
    public static final fgaq DEFAULT_INSTANCE;
    public static final int FEATURE_STATES_FIELD_NUMBER = 1;
    private static volatile evuo<fgaq> PARSER;
    public evub<String, fgao> featureStates_ = evub.a;

    static {
        fgaq fgaqVar = new fgaq();
        DEFAULT_INSTANCE = fgaqVar;
        evsn.registerDefaultInstance(fgaq.class, fgaqVar);
    }

    private fgaq() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"featureStates_", fgap.a});
            case NEW_MUTABLE_INSTANCE:
                return new fgaq();
            case NEW_BUILDER:
                return new fgal();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                evuo<fgaq> evuoVar = PARSER;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (fgaq.class) {
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
