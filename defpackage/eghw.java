package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eghw extends evsn implements evui {
    public static final eghw a;
    private static volatile evuo f;
    public int b;
    public int c;
    public egbs d;
    public int e;
    private byte g = 2;

    static {
        eghw eghwVar = new eghw();
        a = eghwVar;
        evsn.registerDefaultInstance(eghw.class, eghwVar);
    }

    private eghw() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", egcu.a});
            case NEW_MUTABLE_INSTANCE:
                return new eghw();
            case NEW_BUILDER:
                return new eghv();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = f;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eghw.class) {
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
