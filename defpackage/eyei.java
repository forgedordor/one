package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyei extends evsi implements evsj {
    public static final eyei a;
    private static volatile evuo n;
    public int b;
    public long c;
    public long d;
    public int e;
    public evqs f;
    public long g;
    public evqs h;
    public boolean i;
    public String j;
    public double k;
    public eyeg l;
    public eyeo m;
    private byte o = 2;

    static {
        eyei eyeiVar = new eyei();
        a = eyeiVar;
        evsn.registerDefaultInstance(eyei.class, eyeiVar);
    }

    private eyei() {
        emptyProtobufList();
        evqs evqsVar = evqs.b;
        evqs evqsVar2 = evqs.b;
        this.f = evqsVar2;
        this.g = 180000L;
        this.h = evqsVar2;
        emptyIntList();
        emptyIntList();
        this.j = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001#\u000b\u0000\u0000\u0001\u0001ဂ\u0000\u0006ည\u000b\u000bင\u0005\u000fတ\u0011\u0011ဂ\u0001\u0012ည\u0013\u0019ဇ\u0017\u001cဈ\u0018 က\u001a!ᐉ\u001c#ဉ\u001b", new Object[]{"b", "c", "f", "e", "g", "d", "h", "i", "j", "k", "m", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new eyei();
            case NEW_BUILDER:
                return new eyeh();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = n;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eyei.class) {
                    evsgVar = n;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        n = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
