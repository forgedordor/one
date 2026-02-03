package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgau extends evsn<fgau, fgar> implements evui {
    public static final int CONSTRAINED_VALUES_FIELD_NUMBER = 8;
    public static final fgau DEFAULT_INSTANCE;
    private static volatile evuo<fgau> PARSER;
    public evtg<fgat> constrainedValues_ = emptyProtobufList();

    static {
        fgau fgauVar = new fgau();
        DEFAULT_INSTANCE = fgauVar;
        evsn.registerDefaultInstance(fgau.class, fgauVar);
    }

    private fgau() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"constrainedValues_", fgat.class});
            case NEW_MUTABLE_INSTANCE:
                return new fgau();
            case NEW_BUILDER:
                return new fgar();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                evuo<fgau> evuoVar = PARSER;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (fgau.class) {
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
