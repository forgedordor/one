package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etdx extends evsn implements evui {
    public static final etdx a;
    private static volatile evuo g;
    public int b;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public evtg e = evsn.emptyProtobufList();
    public String f = "";

    static {
        etdx etdxVar = new etdx();
        a = etdxVar;
        evsn.registerDefaultInstance(etdx.class, etdxVar);
    }

    private etdx() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003\u001a\u0004ဈ\u0002", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new etdx();
            case NEW_BUILDER:
                return new etdw();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = g;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (etdx.class) {
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
