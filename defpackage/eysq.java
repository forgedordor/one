package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eysq extends evsn implements evui {
    public static final eysq a;
    private static volatile evuo w;
    public int b;
    public Object d;
    public Object f;
    public Object h;
    public long j;
    public eypt k;
    public eyph l;
    public int n;
    public boolean q;
    public eynl r;
    public int s;
    public int t;
    public eyss u;
    public evqs v;
    public int c = 0;
    public int e = 0;
    public int g = 0;
    public evub o = evub.a;
    public String i = "";
    public String m = "";
    public String p = "";

    static {
        eysq eysqVar = new eysq();
        a = eysqVar;
        evsn.registerDefaultInstance(eysq.class, eysqVar);
    }

    private eysq() {
        emptyIntList();
        this.v = evqs.b;
        evsn.emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0017\u0003\u0001\u0001\u0097\u0017\u0001\u0000\u0000\u0001Ȉ\u0002\u0002\u0003ဉ\u0000\u0004ဉ\u0001\u0005<\u0000\tȈ\n\f\u000b2\fȈ\r\u0007\u000eဉ\u0004\u000f\f\u0010\f\u0011ဉ\u0005\u0013\ne<\u0001f<\u0001g<\u0001h<\u0001i<\u0001j<\u0001k<\u0001\u0097<\u0002", new Object[]{"d", "c", "f", "e", "h", "g", "b", "i", "j", "k", "l", eypt.class, "m", "n", "o", eysp.a, "p", "q", "r", "s", "t", "u", "v", eysl.class, eytc.class, eysu.class, eysh.class, eysn.class, eyuw.class, eytq.class, eyqj.class});
        }
        if (iOrdinal == 3) {
            return new eysq();
        }
        if (iOrdinal == 4) {
            return new eyso();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = w;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eysq.class) {
            evsgVar = w;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                w = evsgVar;
            }
        }
        return evsgVar;
    }
}
