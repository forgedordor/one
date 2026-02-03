package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyeo extends evsi implements evsj {
    public static final eyeo a;
    private static volatile evuo f;
    public int b;
    public exda c;
    public int d;
    public etoz e;
    private byte g = 2;

    static {
        eyeo eyeoVar = new eyeo();
        a = eyeoVar;
        evsn.registerDefaultInstance(eyeo.class, eyeoVar);
    }

    private eyeo() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", eyem.a, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new eyeo();
            case NEW_BUILDER:
                return new eyel();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = f;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eyeo.class) {
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
