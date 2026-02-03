package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewuw extends evsi implements evsj {
    public static final ewuw a;
    private static volatile evuo f;
    public int b;
    public ewci c;
    public evqe e;
    private byte g = 2;
    public String d = "";

    static {
        ewuw ewuwVar = new ewuw();
        a = ewuwVar;
        evsn.registerDefaultInstance(ewuw.class, ewuwVar);
    }

    private ewuw() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0000\u0002ဈ\u0002\u0003ဉ\u0003\u0006ဉ\u0000", new Object[]{"b", "d", "e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ewuw();
            case NEW_BUILDER:
                return new ewuv();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = f;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ewuw.class) {
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
