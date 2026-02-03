package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feit extends evsn implements evui {
    public static final feit a;
    private static volatile evuo e;
    public int b;
    public int c;
    private feir f;
    private byte g = 2;
    public int d = 1;

    static {
        feit feitVar = new feit();
        a = feitVar;
        evsn.registerDefaultInstance(feit.class, feitVar);
    }

    private feit() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", feis.a, "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new feit();
            case NEW_BUILDER:
                return new feip();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (feit.class) {
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
