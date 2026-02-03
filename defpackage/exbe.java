package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exbe extends evsi implements evsj {
    public static final exbe a;
    private static volatile evuo h;
    public int b;
    public esxk c;
    public exbc e;
    public euvi f;
    private byte i = 2;
    public String d = "";
    public String g = "";

    static {
        exbe exbeVar = new exbe();
        a = exbeVar;
        evsn.registerDefaultInstance(exbe.class, exbeVar);
    }

    private exbe() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001c\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003cဈ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new exbe();
            case NEW_BUILDER:
                return new exbd();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = h;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exbe.class) {
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
