package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epbl extends evsn implements evui {
    public static final epbl a;
    private static volatile evuo y;
    public int b;
    public eoxa f;
    public epbx g;
    public long h;
    public epbn i;
    public int l;
    public epbp m;
    public boolean o;
    public boolean p;
    public int q;
    public boolean s;
    public ahsa t;
    public epbk u;
    public epqd v;
    public epqh w;
    public epcj x;
    public String c = "";
    public String d = "";
    public String e = "";
    public String j = "";
    public evtg k = emptyProtobufList();
    public String n = "";
    public evtg r = emptyProtobufList();

    static {
        epbl epblVar = new epbl();
        a = epblVar;
        evsn.registerDefaultInstance(epbl.class, epblVar);
    }

    private epbl() {
    }

    public final void a() {
        evtg evtgVar = this.k;
        if (evtgVar.c()) {
            return;
        }
        this.k = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0016\u0000\u0001\u0001\u0019\u0016\u0000\u0002\u0000\u0001Ȉ\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u0002\u0006ဉ\u0003\u0007Ȉ\tȈ\n\u001b\u000b\f\fȈ\rဉ\u0004\u000eȈ\u000f\u0007\u0010\u0007\u0012\f\u0013\u001b\u0014\u0007\u0015ဉ\u0006\u0016ဉ\u0007\u0017ဉ\b\u0018ဉ\t\u0019ဉ\n", new Object[]{"b", "c", "f", "g", "h", "i", "j", "e", "k", epbi.class, "l", "d", "m", "n", "o", "p", "q", "r", epda.class, "s", "t", "u", "v", "w", "x"});
        }
        if (iOrdinal == 3) {
            return new epbl();
        }
        if (iOrdinal == 4) {
            return new epbb();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = y;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epbl.class) {
            evsgVar = y;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                y = evsgVar;
            }
        }
        return evsgVar;
    }
}
