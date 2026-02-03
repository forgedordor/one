package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euda extends evsn implements evui {
    public static final euda a;
    private static volatile evuo d;
    public exmy b;
    public efvz c;
    private int e;
    private byte f = 2;

    static {
        euda eudaVar = new euda();
        a = eudaVar;
        evsn.registerDefaultInstance(euda.class, eudaVar);
    }

    private euda() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0001\u0003ᐉ\u0001\u0005ဉ\u0000", new Object[]{"e", "c", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new euda();
            case NEW_BUILDER:
                return new eucz();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = d;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (euda.class) {
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
