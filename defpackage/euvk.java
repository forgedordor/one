package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euvk extends evsn implements evui {
    public static final euvk a;
    private static volatile evuo b;
    private int c;
    private euvf d;
    private euvf e;
    private byte f = 2;

    static {
        euvk euvkVar = new euvk();
        a = euvkVar;
        evsn.registerDefaultInstance(euvk.class, euvkVar);
    }

    private euvk() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0005ᐉ\u0001", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new euvk();
            case NEW_BUILDER:
                return new euvj();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = b;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (euvk.class) {
                    evsgVar = b;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        b = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
