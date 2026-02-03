package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emjj extends evsn implements evui {
    public static final emjj a;
    private static volatile evuo g;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    private byte h = 2;

    static {
        emjj emjjVar = new emjj();
        a = emjjVar;
        evsn.registerDefaultInstance(emjj.class, emjjVar);
    }

    private emjj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᴌ\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", emji.a, "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new emjj();
            case NEW_BUILDER:
                return new emjh();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = g;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (emjj.class) {
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
