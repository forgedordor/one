package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etfp extends evsn implements evui {
    public static final etfp a;
    private static volatile evuo k;
    public int b;
    public int c;
    public long d;
    public boolean f;
    public int i;
    private byte l = 2;
    public String e = "";
    public int g = 1;
    public String h = "";
    public String j = "";

    static {
        etfp etfpVar = new etfp();
        a = etfpVar;
        evsn.registerDefaultInstance(etfp.class, etfpVar);
    }

    private etfp() {
    }

    public static /* synthetic */ void a(etfp etfpVar) {
        etfpVar.b |= 8;
        etfpVar.f = true;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔃ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0005\u0006᠌\u0006\u0007ဈ\u0007\bင\u0004", new Object[]{"b", "c", "d", "e", "f", "h", "i", etfn.a, "j", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new etfp();
            case NEW_BUILDER:
                return new etfm();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = k;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (etfp.class) {
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
