package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eogw extends evsn implements evui {
    public static final eogw a;
    private static volatile evuo r;
    public int b;
    public int c;
    public eofu e;
    public eohl f;
    public eohg g;
    public eohd h;
    public eogi i;
    public boolean j;
    public String k;
    public int l;
    public String m;
    public int n;
    public int o;
    public exba p;
    public boolean q;
    private eofy s;
    private eogm t;
    private byte u = 2;
    public int d = 1;

    static {
        eogw eogwVar = new eogw();
        a = eogwVar;
        evsn.registerDefaultInstance(eogw.class, eogwVar);
    }

    private eogw() {
        emptyProtobufList();
        emptyProtobufList();
        this.k = "";
        this.m = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0002\u0001&\u0010\u0000\u0000\u0003\u0001᠌\u0001\u0002ဉ\u0002\u0003ᐉ\u0003\u0005ᐉ\u0006\bᐉ\b\fဉ\t\u000eဉ\n\u0018ဉ\u0017\u001bဇ\u0018\u001eဈ\u001b ᠌\u001d!ဈ\u001e\"᠌\u001f#᠌ $ဉ!&ဇ#", new Object[]{"b", "c", "d", eogs.a, "e", "s", "f", "t", "g", "h", "i", "j", "k", "l", eogv.a, "m", "n", eogu.a, "o", eogt.a, "p", "q"});
            case 3:
                return new eogw();
            case 4:
                return new eogr();
            case 5:
                return a;
            case 6:
                evuo evuoVar = r;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eogw.class) {
                    evsgVar = r;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        r = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
