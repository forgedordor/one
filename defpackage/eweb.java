package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eweb extends evsn implements evui {
    public static final eweb a;
    private static volatile evuo h;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    private byte i = 2;
    public String f = "";
    public String g = "";

    static {
        eweb ewebVar = new eweb();
        a = ewebVar;
        evsn.registerDefaultInstance(eweb.class, ewebVar);
    }

    private eweb() {
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
                return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001f\u0005\u0000\u0000\u0001\u0001ᴌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002e<\u0000f<\u0000", new Object[]{"d", "c", "b", "e", ewea.a, "f", "g", ewdw.class, ewdy.class});
            case NEW_MUTABLE_INSTANCE:
                return new eweb();
            case NEW_BUILDER:
                return new ewdz();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = h;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eweb.class) {
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
