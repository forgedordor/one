package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtma extends evsn implements evui {
    public static final dtma a;
    private static volatile evuo o;
    public int b;
    public int f;
    public int g;
    public long i;
    public evqe l;
    public evqe m;
    private byte p = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public evtg h = emptyProtobufList();
    public String j = "";
    public evtg k = evsn.emptyProtobufList();
    public String n = "";

    static {
        dtma dtmaVar = new dtma();
        a = dtmaVar;
        evsn.registerDefaultInstance(dtma.class, dtmaVar);
    }

    private dtma() {
    }

    public final void a() {
        evtg evtgVar = this.h;
        if (evtgVar.c()) {
            return;
        }
        this.h = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0002\u0001\u0001ဈ\u0000\u0002Л\u0003ဈ\u0001\u0004င\u0003\u0005᠌\u0004\u0006ဈ\u0002\bဂ\u0005\n\u001a\u000bဉ\u0007\fဈ\u0006\rဉ\b\u000fဈ\n", new Object[]{"b", "c", "h", dtlw.class, "d", "f", "g", dtly.a, "e", "i", "k", "l", "j", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new dtma();
            case NEW_BUILDER:
                return new dtlx();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = o;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (dtma.class) {
                    evsgVar = o;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        o = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
