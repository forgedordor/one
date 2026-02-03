package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgj extends evsn implements evui {
    public static final dzgj a;
    private static volatile evuo d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        dzgj dzgjVar = new dzgj();
        a = dzgjVar;
        evsn.registerDefaultInstance(dzgj.class, dzgjVar);
    }

    private dzgj() {
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
                return newMessageInfo(a, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0002\u0001м\u0000\u0002<\u0000\u0003м\u0000\u0004<\u0000", new Object[]{"c", "b", feeg.class, dzgl.class, dzgp.class, dzgr.class});
            case NEW_MUTABLE_INSTANCE:
                return new dzgj();
            case NEW_BUILDER:
                return new dzgi();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = d;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (dzgj.class) {
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
