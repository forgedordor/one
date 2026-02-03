package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byiv extends evsn implements evui {
    public static final byiv a;
    private static volatile evuo k;
    public int b;
    public int c;
    public int d;
    public int f;
    public boolean g;
    public int h;
    public evvp i;
    private byte l = 2;
    public String e = "";
    public String j = "";

    static {
        byiv byivVar = new byiv();
        a = byivVar;
        evsn.registerDefaultInstance(byiv.class, byivVar);
    }

    private byiv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔈ\u0002\u0004င\u0003\u0005ᔇ\u0004\u0006င\u0005\u0007ဉ\u0006\bဈ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new byiv();
            case NEW_BUILDER:
                return new byiu();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = k;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (byiv.class) {
                    evsgVar = k;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        k = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
