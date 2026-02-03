package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejnn extends evsn implements evui {
    public static final ejnn a;
    private static volatile evuo h;
    public int b;
    public exwq c;
    public exwm d;
    public evub g = evub.a;
    private byte i = 2;
    public evtg e = emptyProtobufList();
    public String f = "";

    static {
        ejnn ejnnVar = new ejnn();
        a = ejnnVar;
        evsn.registerDefaultInstance(ejnn.class, ejnnVar);
    }

    private ejnn() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0001\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003\u001b\u0004ဈ\u0002\u00052", new Object[]{"b", "c", "d", "e", ejnk.class, "f", "g", ejnl.a});
            case NEW_MUTABLE_INSTANCE:
                return new ejnn();
            case NEW_BUILDER:
                return new ejnm();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = h;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ejnn.class) {
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
