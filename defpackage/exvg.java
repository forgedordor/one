package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exvg extends evsn implements evui {
    public static final exvg a;
    private static volatile evuo e;
    public int b;
    public evqs c;
    public evqs d;
    private byte f = 2;

    static {
        exvg exvgVar = new exvg();
        a = exvgVar;
        evsn.registerDefaultInstance(exvg.class, exvgVar);
    }

    private exvg() {
        evqs evqsVar = evqs.b;
        this.c = evqsVar;
        this.d = evqsVar;
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔊ\u0000\u0002ᔊ\u0001", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new exvg();
            case NEW_BUILDER:
                return new exvf();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exvg.class) {
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
