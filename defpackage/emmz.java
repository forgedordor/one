package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emmz extends evsi implements evsj {
    public static final emmz a;
    private static volatile evuo l;
    public int b;
    public int c;
    public int g;
    public ewwx h;
    public int i;
    public emlk k;
    private byte m = 2;
    public int d = -1;
    public evsx e = emptyIntList();
    public String f = "";
    public int j = -1;

    static {
        emmz emmzVar = new emmz();
        a = emmzVar;
        evsn.registerDefaultInstance(emmz.class, emmzVar);
    }

    private emmz() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001è\t\u0000\u0001\u0002\u0001င\u0000\u0003င\u0001\u0004\u0016\u0005ဈ\u0002\u0006᠌\u0005\u0007င\u0003\u000bᐉ\u0004\u0095င\bèᐉ\t", new Object[]{"b", "c", "d", "e", "f", "i", emmx.a, "g", "h", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new emmz();
            case NEW_BUILDER:
                return new emmw();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = l;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (emmz.class) {
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
