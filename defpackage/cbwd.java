package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbwd extends evsn implements evui {
    public static final cbwd a;
    private static volatile evuo h;
    public int b;
    public Object d;
    public enao f;
    public int g;
    public int c = 0;
    private byte i = 2;
    public String e = "";

    static {
        cbwd cbwdVar = new cbwd();
        a = cbwdVar;
        evsn.registerDefaultInstance(cbwd.class, cbwdVar);
    }

    private cbwd() {
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
                return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ለ\u0000\u0002м\u0000\u0003<\u0000\u0004ဉ\u0001\u0005᠌\u0002\u0006<\u0000", new Object[]{"d", "c", "b", "e", aufh.class, ccps.class, "f", "g", enaz.a, cbug.class});
            case NEW_MUTABLE_INSTANCE:
                return new cbwd();
            case NEW_BUILDER:
                return new cbwc();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = h;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (cbwd.class) {
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
