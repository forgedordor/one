package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsvj extends evsi implements evsj {
    public static final dsvj a;
    private static volatile evuo e;
    public int b;
    public int c;
    private byte f = 2;
    public evsx d = emptyIntList();

    static {
        dsvj dsvjVar = new dsvj();
        a = dsvjVar;
        evsn.registerDefaultInstance(dsvj.class, dsvjVar);
    }

    private dsvj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"b", "c", eolg.a, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new dsvj();
            case NEW_BUILDER:
                return new dsvi();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (dsvj.class) {
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
