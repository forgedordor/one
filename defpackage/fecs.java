package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fecs extends evsn implements evui {
    public static final fecs a;
    private static volatile evuo m;
    public int b;
    public int c;
    public long d;
    public feeg g;
    public int h;
    public long i;
    public fedk j;
    public long k;
    public long l;
    private byte n = 2;
    public String e = "";
    public String f = "";

    static {
        fecs fecsVar = new fecs();
        a = fecsVar;
        evsn.registerDefaultInstance(fecs.class, fecsVar);
    }

    private fecs() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                evsv evsvVar = fecq.a;
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001᠌\u0000\u0002᠌\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004\fဂ\t", new Object[]{"b", "c", evsvVar, "h", evsvVar, "i", "j", "k", "d", "e", "f", "g", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new fecs();
            case NEW_BUILDER:
                return new fecp();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = m;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (fecs.class) {
                    evsgVar = m;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        m = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
