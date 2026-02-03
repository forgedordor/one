package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejit extends evsn implements evui {
    public static final ejit a;
    private static volatile evuo f;
    public int b;
    public Object d;
    public ejit e;
    public int c = 0;
    private byte g = 2;

    static {
        ejit ejitVar = new ejit();
        a = ejitVar;
        evsn.registerDefaultInstance(ejit.class, ejitVar);
    }

    private ejit() {
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
                return newMessageInfo(a, "\u0004\b\u0001\u0001\u0004\r\b\u0000\u0000\u0002\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\tм\u0000\u000bᐉ\u0001\f<\u0000\r<\u0000", new Object[]{"d", "c", "b", ejha.class, ejha.class, ejha.class, ejih.class, ejnn.class, "e", ejhr.class, ejin.class});
            case NEW_MUTABLE_INSTANCE:
                return new ejit();
            case NEW_BUILDER:
                return new ejis();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = f;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ejit.class) {
                    evsgVar = f;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        f = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
