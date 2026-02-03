package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coqp extends evsn implements evui {
    public static final coqp a;
    private static volatile evuo g;
    public int b;
    public elpg e;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        coqp coqpVar = new coqp();
        a = coqpVar;
        evsn.registerDefaultInstance(coqp.class, coqpVar);
    }

    private coqp() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0005ဈ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new coqp();
            case NEW_BUILDER:
                return new coqo();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = g;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (coqp.class) {
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
