package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emcx extends evsn implements evui {
    public static final emcx a;
    private static volatile evuo q;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public int g;
    public emdx h;
    public int i;
    public int j;
    public emcr k;
    public emcv l;
    public emct n;
    public emci p;
    private byte r = 2;
    public evsx m = emptyIntList();
    public String o = "";

    static {
        emcx emcxVar = new emcx();
        a = emcxVar;
        evsn.registerDefaultInstance(emcx.class, emcxVar);
    }

    private emcx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0002\u0001ᴌ\u0000\u0002ᴌ\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005᠌\u0004\u0006ဉ\u0005\u0007င\u0006\bင\u0007\tဉ\b\nဉ\t\u000bࠬ\fဉ\n\rဈ\u000b\u000eဉ\f", new Object[]{"b", "c", emeb.a, "d", emcl.a, "e", emcm.a, "f", "g", emcj.a, "h", "i", "j", "k", "l", "m", emcf.a, "n", "o", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new emcx();
            case NEW_BUILDER:
                return new emcw();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = q;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (emcx.class) {
                    evsgVar = q;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        q = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
