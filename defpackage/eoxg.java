package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoxg extends evsn implements evui {
    public static final eoxg a;
    private static volatile evuo l;
    public evqs c;
    public int d;
    public boolean e;
    public long f;
    public int g;
    public evqs h;
    public evqs i;
    public boolean j;
    public evqs k;
    private byte m = 2;
    public String b = "";

    static {
        eoxg eoxgVar = new eoxg();
        a = eoxgVar;
        evsn.registerDefaultInstance(eoxg.class, eoxgVar);
    }

    private eoxg() {
        evqs evqsVar = evqs.b;
        this.c = evqsVar;
        this.h = evqsVar;
        this.i = evqsVar;
        this.k = evqsVar;
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
                return newMessageInfo(a, "\u0004\n\u0000\u0000\u0001\u000b\n\u0000\u0000\u0000\u0001Ȉ\u0003\u0002\u0004\f\u0005\n\u0006\u0007\u0007\u0004\b\n\t\u0007\n\n\u000b\n", new Object[]{"b", "f", "g", "h", "e", "d", "i", "j", "c", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new eoxg();
            case NEW_BUILDER:
                return new eoxf();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = l;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eoxg.class) {
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
