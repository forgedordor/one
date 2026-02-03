package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euwx extends evsn implements evui {
    public static final euwx a;
    private static volatile evuo h;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    private byte i = 2;

    static {
        euwx euwxVar = new euwx();
        a = euwxVar;
        evsn.registerDefaultInstance(euwx.class, euwxVar);
    }

    private euwx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003\u0005ခ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new euwx();
            case NEW_BUILDER:
                return new euww();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = h;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (euwx.class) {
                    evsgVar = h;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        h = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
