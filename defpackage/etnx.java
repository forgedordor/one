package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etnx extends evsn implements evui {
    public static final etnx a;
    private static volatile evuo t;
    public int b;
    public Object d;
    public eyax e;
    public eyax f;
    public eyax g;
    public eyax h;
    public eyax i;
    public eyax j;
    public eyax k;
    public etlk p;
    public int q;
    public boolean s;
    public int c = 0;
    public evtg l = emptyProtobufList();
    public evtg m = emptyProtobufList();
    public String n = "";
    public String o = "";
    public float r = 1.0f;

    static {
        etnx etnxVar = new etnx();
        a = etnxVar;
        evsn.registerDefaultInstance(etnx.class, etnxVar);
    }

    private etnx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0012\u0001\u0001\u0001\u0014\u0012\u0000\u0002\u0000\u0001;\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဈ\b\u0005ဈ\t\u0006ဉ\u0004\bဉ\n\n;\u0000\u000b7\u0000\fဉ\u0003\rဉ\u0005\u000eဉ\u0002\u000fဉ\u0006\u0010᠌\f\u0011ခ\r\u0012\u001b\u0013\u001b\u0014ဇ\u000e", new Object[]{"d", "c", "b", "e", "f", "n", "o", "i", "p", "h", "j", "g", "k", "q", etnv.a, "r", "l", etnt.class, "m", etnt.class, "s"});
        }
        if (iOrdinal == 3) {
            return new etnx();
        }
        if (iOrdinal == 4) {
            return new etnu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = t;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etnx.class) {
            evsgVar = t;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                t = evsgVar;
            }
        }
        return evsgVar;
    }
}
