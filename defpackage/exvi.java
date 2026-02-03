package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exvi extends evsn implements evui {
    public static final exvi a;
    private static volatile evuo g;
    public int b;
    public exvg d;
    public exvm e;
    public exve f;
    private byte h = 2;
    public int c = 1;

    static {
        exvi exviVar = new exvi();
        a = exviVar;
        evsn.registerDefaultInstance(exvi.class, exviVar);
    }

    private exvi() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᴌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", exvj.a, "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new exvi();
            case NEW_BUILDER:
                return new exvh();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = g;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exvi.class) {
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
