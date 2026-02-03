package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exir extends evsn implements evui {
    public static final exir a;
    private static volatile evuo f;
    public evtg b;
    public evub c;
    public evub d;
    public evub e;
    private byte g;

    static {
        exir exirVar = new exir();
        a = exirVar;
        evsn.registerDefaultInstance(exir.class, exirVar);
    }

    private exir() {
        evub evubVar = evub.a;
        this.c = evubVar;
        this.d = evubVar;
        this.e = evubVar;
        this.g = (byte) 2;
        this.b = emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0006\u0004\u0003\u0001\u0002\u0001\u001b\u0002в\u00032\u0006в", new Object[]{"b", exit.class, "c", exio.a, "e", exiq.a, "d", exip.a});
            case NEW_MUTABLE_INSTANCE:
                return new exir();
            case NEW_BUILDER:
                return new exin();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = f;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exir.class) {
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
