package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ellm extends evsn implements evui {
    public static final ellm a;
    private static volatile evuo d;
    public int b;
    public int c;
    private byte e = 2;

    static {
        ellm ellmVar = new ellm();
        a = ellmVar;
        evsn.registerDefaultInstance(ellm.class, ellmVar);
    }

    private ellm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᴌ\u0000", new Object[]{"b", "c", ellk.a});
            case NEW_MUTABLE_INSTANCE:
                return new ellm();
            case NEW_BUILDER:
                return new elll();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = d;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ellm.class) {
                    evsgVar = d;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        d = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
