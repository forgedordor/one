package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deuy extends evsn implements evui {
    public static final deuy a;
    private static volatile evuo q;
    public int b;
    public double e;
    public float f;
    public long g;
    public int h;
    public int i;
    public boolean j;
    public long p;
    private byte r = 2;
    public evqs c = evqs.b;
    public String d = "";
    public evtg k = emptyProtobufList();
    public evtg l = emptyProtobufList();
    public evtg m = evsn.emptyProtobufList();
    public evta n = emptyLongList();
    public evsw o = emptyFloatList();

    static {
        deuy deuyVar = new deuy();
        a = deuyVar;
        evsn.registerDefaultInstance(deuy.class, deuyVar);
    }

    private deuy() {
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0002\u0001ည\u0000\u0002ဈ\u0001\u0003က\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဏ\u0006\bဇ\u0007\tЛ\nЛ\u000b\u001a\f\u0014\rဂ\b\u000e\u0013", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", deva.class, "l", deuz.class, "m", "n", "p", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new deuy();
            case NEW_BUILDER:
                return new deux();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = q;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (deuy.class) {
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
