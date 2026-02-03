package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtnq extends evsi implements evsj {
    public static final dtnq a;
    private static volatile evuo s;
    public int b;
    public long e;
    public int f;
    public exyx h;
    public long j;
    public exyx k;
    public int m;
    public int n;
    public evqe q;
    private byte t = 2;
    public String c = "";
    public String d = "";
    public String g = "";
    public String i = "";
    public evtg l = emptyProtobufList();
    public String o = "";
    public String p = "";

    static {
        dtnq dtnqVar = new dtnq();
        a = dtnqVar;
        evsn.registerDefaultInstance(dtnq.class, dtnqVar);
    }

    private dtnq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.t);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0015\u000f\u0000\u0001\u0000\u0002ဈ\u0001\u0004ဂ\u0002\u0005ဈ\u0004\u0007ဈ\u0000\u000bဉ\u0005\fဉ\b\r\u001b\u000eဈ\u0006\u000f᠌\u0003\u0010ဂ\u0007\u0011᠌\t\u0012᠌\n\u0013ဈ\u000b\u0014ဈ\f\u0015ဉ\r", new Object[]{"b", "d", "e", "g", "c", "h", "k", "l", dtnw.class, "i", "f", dtno.a, "j", "m", dtnl.a, "n", dtnj.a, "o", "p", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new dtnq();
            case NEW_BUILDER:
                return new dtnn();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = s;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (dtnq.class) {
                    evsgVar = s;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        s = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
