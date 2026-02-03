package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emlx extends evsn implements evui {
    public static final emlx a;
    private static volatile evuo e;
    public int b;
    public eogw d;
    private eofw f;
    private byte g = 2;
    public int c = 1;

    static {
        emlx emlxVar = new emlx();
        a = emlxVar;
        evsn.registerDefaultInstance(emlx.class, emlxVar);
    }

    private emlx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001᠌\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", emlw.a, "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new emlx();
            case NEW_BUILDER:
                return new emlv();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (emlx.class) {
                    evsgVar = e;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        e = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
