package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtns extends evsn implements evui {
    public static final dtns a;
    private static volatile evuo j;
    public int b;
    public int e;
    public evqe f;
    public long h;
    public String i;
    private byte k = 2;
    public String c = "";
    public String d = "";
    public evtg g = emptyProtobufList();

    static {
        dtns dtnsVar = new dtns();
        a = dtnsVar;
        evsn.registerDefaultInstance(dtns.class, dtnsVar);
    }

    private dtns() {
        emptyProtobufList();
        this.i = "";
        evsn.emptyProtobufList();
    }

    public final void a() {
        evtg evtgVar = this.g;
        if (evtgVar.c()) {
            return;
        }
        this.g = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u001a\u0007\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л\u0006ဈ\u0001\nင\u0002\u0014ဉ\u0003\u0017ဂ\u000f\u001aဈ\u0010", new Object[]{"b", "c", "g", dtnq.class, "d", "e", "f", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new dtns();
            case NEW_BUILDER:
                return new dtnr();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = j;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (dtns.class) {
                    evsgVar = j;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        j = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
