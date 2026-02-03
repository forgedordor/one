package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esxo extends evsn implements evui {
    public static final esxo a;
    private static volatile evuo e;
    public int b;
    private byte f = 2;
    public evtg c = emptyProtobufList();
    public evqs d = evqs.b;

    static {
        esxo esxoVar = new esxo();
        a = esxoVar;
        evsn.registerDefaultInstance(esxo.class, esxoVar);
    }

    private esxo() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0001\u0001\u0001Л\u0005ည\u0000", new Object[]{"b", "c", esxq.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new esxo();
            case NEW_BUILDER:
                return new esxn();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (esxo.class) {
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
