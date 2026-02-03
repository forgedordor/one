package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feji extends evsn implements evui {
    public static final feji a;
    private static volatile evuo f;
    public int b;
    public Object d;
    public fejg e;
    public int c = 0;
    private byte g = 2;

    static {
        feji fejiVar = new feji();
        a = fejiVar;
        evsn.registerDefaultInstance(feji.class, fejiVar);
    }

    private feji() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001<\u0000\u0002ᐉ\u0000\u0003м\u0000", new Object[]{"d", "c", "b", fegm.class, "e", fejw.class});
            case NEW_MUTABLE_INSTANCE:
                return new feji();
            case NEW_BUILDER:
                return new fejh();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = f;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (feji.class) {
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
