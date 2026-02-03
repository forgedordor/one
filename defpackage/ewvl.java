package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewvl extends evsi implements evsj {
    public static final ewvl a;
    private static volatile evuo e;
    public int b;
    public int c;
    private eioc f;
    private byte g = 2;
    public int d = 1;

    static {
        ewvl ewvlVar = new ewvl();
        a = ewvlVar;
        evsn.registerDefaultInstance(ewvl.class, ewvlVar);
    }

    private ewvl() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0004᠌\u0004\u0007᠌\u0005", new Object[]{"b", "f", "c", ewvm.a, "d", ewvo.a});
            case NEW_MUTABLE_INSTANCE:
                return new ewvl();
            case NEW_BUILDER:
                return new ewvk();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ewvl.class) {
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
