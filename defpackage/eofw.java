package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eofw extends evsn implements evui {
    public static final eofw a;
    private static volatile evuo b;
    private int c;
    private eupn d;
    private byte e = 2;

    static {
        eofw eofwVar = new eofw();
        a = eofwVar;
        evsn.registerDefaultInstance(eofw.class, eofwVar);
    }

    private eofw() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new eofw();
            case NEW_BUILDER:
                return new eofv();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = b;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eofw.class) {
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
