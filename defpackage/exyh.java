package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exyh extends evsi implements evsj {
    public static final exyh a;
    private static volatile evuo b;
    private int c;
    private exyf d;
    private byte e = 2;

    static {
        exyh exyhVar = new exyh();
        a = exyhVar;
        evsn.registerDefaultInstance(exyh.class, exyhVar);
    }

    private exyh() {
        emptyIntList();
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0003", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new exyh();
            case NEW_BUILDER:
                return new exyg();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = b;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exyh.class) {
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
