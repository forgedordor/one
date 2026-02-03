package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqly extends evsn implements evui {
    public static final eqly a;
    private static volatile evuo e;
    public int d;
    private byte f = 2;
    public evtg b = emptyProtobufList();
    public String c = "";

    static {
        eqly eqlyVar = new eqly();
        a = eqlyVar;
        evsn.registerDefaultInstance(eqly.class, eqlyVar);
    }

    private eqly() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002Ȉ\u0003\u0004", new Object[]{"b", eqko.class, "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new eqly();
            case NEW_BUILDER:
                return new eqlx();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eqly.class) {
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
