package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exix extends evsn implements evui {
    public static final exix a;
    private static volatile evuo d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        exix exixVar = new exix();
        a = exixVar;
        evsn.registerDefaultInstance(exix.class, exixVar);
    }

    private exix() {
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
                return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0003\u0001м\u0000\u0002м\u0000\u0003м\u0000", new Object[]{"c", "b", exjy.class, exjf.class, exjd.class});
            case NEW_MUTABLE_INSTANCE:
                return new exix();
            case NEW_BUILDER:
                return new exiw();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = d;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exix.class) {
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
