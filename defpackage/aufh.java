package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aufh extends evsn implements evui {
    public static final evsy a = new aufd();
    public static final aufh b;
    private static volatile evuo s;
    public int c;
    public aubq d;
    public awky e;
    public aubq f;
    public awso g;
    public aubq h;
    public axfx i;
    public eyga l;
    public evvp n;
    public elpg o;
    public auib p;
    private byte t = 2;
    public String j = "";
    public String k = "";
    public evtg m = emptyProtobufList();
    public evsx q = emptyIntList();
    public String r = "";

    static {
        aufh aufhVar = new aufh();
        b = aufhVar;
        evsn.registerDefaultInstance(aufh.class, aufhVar);
    }

    private aufh() {
    }

    public final void a() {
        evtg evtgVar = this.m;
        if (evtgVar.c()) {
            return;
        }
        this.m = evsn.mutableCopy(evtgVar);
    }

    public final void b() {
        evsx evsxVar = this.q;
        if (evsxVar.c()) {
            return;
        }
        this.q = evsn.mutableCopy(evsxVar);
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
                return newMessageInfo(b, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0002\u0001\u0001ဉ\u0000\u0002ဉ\u0003\u0003ဈ\b\u0004ဈ\t\u0005ဉ\n\u0006\u001b\u0007ဉ\u000b\bᐉ\f\tဉ\r\nࠬ\u000bဉ\u0006\u000eဉ\u0002\u000fဉ\u0005\u0010ဉ\u0007\u0011ဈ\u000e", new Object[]{"c", "d", "f", "j", "k", "l", "m", aubt.class, "n", "o", "p", "q", auff.a, "h", "e", "g", "i", "r"});
            case NEW_MUTABLE_INSTANCE:
                return new aufh();
            case NEW_BUILDER:
                return new aufe();
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                evuo evuoVar = s;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (aufh.class) {
                    evsgVar = s;
                    if (evsgVar == null) {
                        evsgVar = new evsg(b);
                        s = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
