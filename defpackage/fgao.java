package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgao extends evsn<fgao, fgam> implements evui {
    public static final fgao DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile evuo<fgao> PARSER;
    public int bitField0_;
    public boolean enabled_;
    public evub<String, evqs> params_ = evub.a;

    static {
        fgao fgaoVar = new fgao();
        DEFAULT_INSTANCE = fgaoVar;
        evsn.registerDefaultInstance(fgao.class, fgaoVar);
    }

    private fgao() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဇ\u0000\u00022", new Object[]{"bitField0_", "enabled_", "params_", fgan.a});
            case NEW_MUTABLE_INSTANCE:
                return new fgao();
            case NEW_BUILDER:
                return new fgam();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                evuo<fgao> evuoVar = PARSER;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (fgao.class) {
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
