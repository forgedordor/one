package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eghr extends evsn implements evui {
    public static final eghr a;
    private static volatile evuo e;
    public int b;
    public evub d = evub.a;
    private byte f = 2;
    public int c = 1;

    static {
        eghr eghrVar = new eghr();
        a = eghrVar;
        evsn.registerDefaultInstance(eghr.class, eghrVar);
    }

    private eghr() {
    }

    public final evub a() {
        evub evubVar = this.d;
        if (!evubVar.b) {
            this.d = evubVar.a();
        }
        return this.d;
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001င\u0000\u0002в", new Object[]{"b", "c", "d", eghp.a});
            case NEW_MUTABLE_INSTANCE:
                return new eghr();
            case NEW_BUILDER:
                return new eghq();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eghr.class) {
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
