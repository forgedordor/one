package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cawc extends evsn implements evui {
    public static final cawc a;
    private static volatile evuo f;
    public int b;
    public int d;
    public boolean e;
    private byte g = 2;
    public String c = "";

    static {
        cawc cawcVar = new cawc();
        a = cawcVar;
        evsn.registerDefaultInstance(cawc.class, cawcVar);
    }

    private cawc() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᴌ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", elmo.a, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new cawc();
            case NEW_BUILDER:
                return new cawb();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = f;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (cawc.class) {
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
