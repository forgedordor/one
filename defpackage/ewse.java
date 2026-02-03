package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewse extends evsn implements evui {
    public static final ewse a;
    private static volatile evuo g;
    public int b;
    public Object d;
    public ewfq e;
    public ewfk f;
    public int c = 0;
    private byte h = 2;

    static {
        ewse ewseVar = new ewse();
        a = ewseVar;
        evsn.registerDefaultInstance(ewse.class, ewseVar);
    }

    private ewse() {
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
                return newMessageInfo(a, "\u0004\f\u0001\u0001\u0001\u000e\f\u0000\u0000\u0001\u0001<\u0000\u0002<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\bဉ\u0002\tဉ\u0003\n<\u0000\u000bм\u0000\f<\u0000\r<\u0000\u000e<\u0000", new Object[]{"d", "c", "b", ewsc.class, ewjy.class, ewka.class, ewda.class, ewfu.class, "e", "f", ewev.class, eweb.class, ewdk.class, ewih.class, ewjh.class});
            case NEW_MUTABLE_INSTANCE:
                return new ewse();
            case NEW_BUILDER:
                return new ewsd();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = g;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ewse.class) {
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
