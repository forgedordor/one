package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eioh extends evsn implements evui {
    public static final eioh a;
    private static volatile evuo b;
    private int c;
    private evvl d;
    private byte e = 2;

    static {
        eioh eiohVar = new eioh();
        a = eiohVar;
        evsn.registerDefaultInstance(eioh.class, eiohVar);
    }

    private eioh() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0003", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new eioh();
            case NEW_BUILDER:
                return new eiog();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = b;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eioh.class) {
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
