package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feeg extends evsi<feeg, feef> implements evsj {
    public static final feeg a;
    private static volatile evuo b;
    private byte c = 2;

    static {
        feeg feegVar = new feeg();
        a = feegVar;
        evsn.registerDefaultInstance(feeg.class, feegVar);
    }

    private feeg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.c);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new feeg();
            case NEW_BUILDER:
                return new feef();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = b;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (feeg.class) {
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
