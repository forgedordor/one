package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtlw extends evsi implements evsj {
    public static final dtlw a;
    private static volatile evuo j;
    public int b;
    public long e;
    public long f;
    public evqe g;
    public boolean h;
    private byte k = 2;
    public String c = "";
    public String d = "";
    public String i = "";

    static {
        dtlw dtlwVar = new dtlw();
        a = dtlwVar;
        evsn.registerDefaultInstance(dtlw.class, dtlwVar);
    }

    private dtlw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဈ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new dtlw();
            case NEW_BUILDER:
                return new dtlv();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = j;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (dtlw.class) {
                    evsgVar = j;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        j = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
