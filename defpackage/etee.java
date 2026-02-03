package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etee extends evsn implements evui {
    public static final etee a;
    private static volatile evuo y;
    public int b;
    public etei c;
    public etei d;
    public etei e;
    public etei f;
    public etei g;
    public etei h;
    public etei i;
    public etei j;
    public etei k;
    public etei l;
    public etei m;
    public int o;
    public boolean u;
    private byte z = 2;
    public String n = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public String s = "";
    public String t = "";
    public evtg v = emptyProtobufList();
    public evtg w = emptyProtobufList();
    public String x = "";

    static {
        etee eteeVar = new etee();
        a = eteeVar;
        evsn.registerDefaultInstance(etee.class, eteeVar);
    }

    private etee() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.z);
            case 1:
                this.z = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0016\u0000\u0001\u0001\u001c\u0016\u0000\u0002\u0003\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tᔈ\u0011\nင\u0012\u000bဈ\u0013\rဈ\u0016\u000fဈ\u0017\u0010ဈ\u0018\u0011ဈ\u0014\u0012ဇ\u0019\u0013Л\u0014Л\u0015ဉ\b\u0017ဈ\u001b\u0019ဉ\t\u001cဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "n", "o", "p", "r", "s", "t", "q", "u", "v", etdx.class, "w", etdx.class, "k", "x", "l", "m"});
            case 3:
                return new etee();
            case 4:
                return new eted();
            case 5:
                return a;
            case 6:
                evuo evuoVar = y;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (etee.class) {
                    evsgVar = y;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        y = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
