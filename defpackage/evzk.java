package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evzk extends evsn implements evui {
    public static final evzk a;
    private static volatile evuo e;
    public Object c;
    public int d;
    private int f;
    public int b = 0;
    private byte g = 2;

    static {
        evzk evzkVar = new evzk();
        a = evzkVar;
        evsn.registerDefaultInstance(evzk.class, evzkVar);
    }

    private evzk() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001᠌\u0000\u0002м\u0000", new Object[]{"c", "b", "f", "d", ewus.a, evzm.class});
            case NEW_MUTABLE_INSTANCE:
                return new evzk();
            case NEW_BUILDER:
                return new evzj();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (evzk.class) {
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
