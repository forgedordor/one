package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fefr extends evsi implements evsj {
    public static final fefr a;
    private static volatile evuo l;
    public int b;
    public long d;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public int k;
    private byte m = 2;
    public String c = "";
    public String e = "";

    static {
        fefr fefrVar = new fefr();
        a = fefrVar;
        evsn.registerDefaultInstance(fefr.class, fefrVar);
    }

    private fefr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002စ\u0003\u0003စ\u0004\u0004ဂ\t\u0005ဂ\n\u0006ဂ\f\u0007᠌\r\bစ\u0001\tဈ\u0002", new Object[]{"b", "c", "f", "g", "h", "i", "j", "k", fefq.a, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new fefr();
            case NEW_BUILDER:
                return new fefp();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = l;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (fefr.class) {
                    evsgVar = l;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        l = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
