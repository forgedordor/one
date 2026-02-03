package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoih extends evsn implements evui {
    public static final eoih a;
    private static volatile evuo g;
    public int b;
    public long e;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public evtg f = emptyProtobufList();

    static {
        eoih eoihVar = new eoih();
        a = eoihVar;
        evsn.registerDefaultInstance(eoih.class, eoihVar);
    }

    private eoih() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004б", new Object[]{"b", "c", "d", "e", "f", eoig.class});
            case NEW_MUTABLE_INSTANCE:
                return new eoih();
            case NEW_BUILDER:
                return new eoie();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = g;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eoih.class) {
                    evsgVar = g;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        g = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
