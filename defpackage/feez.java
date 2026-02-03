package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feez extends evsn implements evui {
    private static volatile evuo A;
    public static final feez a;
    public int b;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public fegz l;
    public int m;
    public feev n;
    public int o;
    public long p;
    public int q;
    public int r;
    public int s;
    public int t;
    public String u;
    public evta v;
    public String w;
    public fefi x;
    public feer y;
    public long z;
    private byte B = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        feez feezVar = new feez();
        a = feezVar;
        evsn.registerDefaultInstance(feez.class, feezVar);
    }

    private feez() {
        emptyProtobufList();
        this.u = "";
        this.v = emptyLongList();
        this.w = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.B);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.B = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0018\u0000\u0001\u0001\u001c\u0018\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဋ\u0006\u0007ဋ\u0007\b᠌\b\nဉ\t\u000bဉ\u000b\rဂ\u000e\u000e᠌\u000f\u000f᠌\u0010\u0010င\u0012\u0011ဈ\u0013\u0013င\u0011\u0014ဈ\u0015\u0015(\u0016ဉ\u0016\u0018᠌\n\u0019ဈ\u0002\u001aဉ\u0017\u001b᠌\f\u001cဂ\u0018", new Object[]{"b", "c", "d", "f", "g", "h", "i", "j", "k", feff.a, "l", "n", "p", "q", fefg.a, "r", fefd.a, "t", "u", "s", "w", "v", "x", "m", feex.a, "e", "y", "o", fefc.a, "z"});
            case NEW_MUTABLE_INSTANCE:
                return new feez();
            case NEW_BUILDER:
                return new feew();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = A;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (feez.class) {
                    evsgVar = A;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        A = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
