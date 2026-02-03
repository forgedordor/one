package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewuq extends evsn implements evui {
    public static final ewuq a;
    private static volatile evuo f;
    public Object c;
    public int d;
    public ewvv e;
    private int g;
    public int b = 0;
    private byte h = 2;

    static {
        ewuq ewuqVar = new ewuq();
        a = ewuqVar;
        evsn.registerDefaultInstance(ewuq.class, ewuqVar);
    }

    private ewuq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001<\u0000\u0002м\u0000\u0003᠌\u0000\u0004ဉ\u0001", new Object[]{"c", "b", "g", exmy.class, ewvt.class, "d", ewus.a, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new ewuq();
            case NEW_BUILDER:
                return new ewup();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = f;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ewuq.class) {
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
