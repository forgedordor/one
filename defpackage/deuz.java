package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deuz extends evsn implements evui {
    public static final deuz a;
    private static volatile evuo e;
    public int b;
    public deuy d;
    private byte f = 2;
    public int c = 1;

    static {
        deuz deuzVar = new deuz();
        a = deuzVar;
        evsn.registerDefaultInstance(deuz.class, deuzVar);
    }

    private deuz() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᴌ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", deuv.a, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new deuz();
            case NEW_BUILDER:
                return new deuu();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (deuz.class) {
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
