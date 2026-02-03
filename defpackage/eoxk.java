package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoxk extends evsn implements evui {
    public static final eoxk a;
    private static volatile evuo d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        eoxk eoxkVar = new eoxk();
        a = eoxkVar;
        evsn.registerDefaultInstance(eoxk.class, eoxkVar);
    }

    private eoxk() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001м\u0000\u0002<\u0000", new Object[]{"c", "b", evbp.class, eoxj.class});
            case NEW_MUTABLE_INSTANCE:
                return new eoxk();
            case NEW_BUILDER:
                return new eoxh();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = d;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eoxk.class) {
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
