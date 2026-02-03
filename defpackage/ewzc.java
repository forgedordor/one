package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewzc extends evsn implements evui {
    public static final ewzc a;
    private static volatile evuo k;
    public int b;
    public Object d;
    public int e;
    public int f;
    public int g;
    public int h;
    public ewyy i;
    public boolean j;
    public int c = 0;
    private byte l = 2;

    static {
        ewzc ewzcVar = new ewzc();
        a = ewzcVar;
        evsn.registerDefaultInstance(ewzc.class, ewzcVar);
    }

    private ewzc() {
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
                return newMessageInfo(a, "\u0004\u0014\u0001\u0001\u0002\u0017\u0014\u0000\u0000\u0001\u0002\f\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n\f\u000b<\u0000\f<\u0000\r<\u0000\u000e\f\u000f\u0004\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013ဉ\u0000\u0015ဇ\u0001\u0017м\u0000", new Object[]{"d", "c", "b", "e", ewys.class, ewyu.class, ewzm.class, ewzi.class, ewzo.class, ewxx.class, ewxv.class, "f", ewyw.class, ewze.class, ewzs.class, "g", "h", ewxs.class, ewzg.class, ewyo.class, "i", "j", ewzk.class});
            case NEW_MUTABLE_INSTANCE:
                return new ewzc();
            case NEW_BUILDER:
                return new ewyz();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = k;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ewzc.class) {
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
