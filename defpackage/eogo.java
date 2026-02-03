package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eogo extends evsn implements evui {
    public static final eogo a;
    private static volatile evuo b;
    private int c;
    private eofy d;
    private byte e = 2;

    static {
        eogo eogoVar = new eogo();
        a = eogoVar;
        evsn.registerDefaultInstance(eogo.class, eogoVar);
    }

    private eogo() {
        evsn.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new eogo();
            case NEW_BUILDER:
                return new eogn();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = b;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eogo.class) {
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
