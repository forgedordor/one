package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eofy extends evsn implements evui {
    public static final eofy a;
    private static volatile evuo b;
    private int c;
    private int d;
    private int e;
    private byte f = 2;

    static {
        eofy eofyVar = new eofy();
        a = eofyVar;
        evsn.registerDefaultInstance(eofy.class, eofyVar);
    }

    private eofy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔆ\u0000\u0002ᔆ\u0001", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new eofy();
            case NEW_BUILDER:
                return new eofx();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = b;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eofy.class) {
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
