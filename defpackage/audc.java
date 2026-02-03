package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class audc extends evsn implements evui {
    public static final evsy a = new aucz();
    public static final evsy b = new auda();
    public static final audc c;
    private static volatile evuo w;
    public int d;
    public awso f;
    public boolean k;
    public boolean m;
    public boolean o;
    public aubq q;
    public aufb r;
    public aucv s;
    public aubq t;
    public auid u;
    public audg v;
    public String e = "";
    public evtg g = emptyProtobufList();
    public evtg h = emptyProtobufList();
    public evsx i = emptyIntList();
    public evsx j = emptyIntList();
    public String l = "";
    public String n = "";
    public String p = "";

    static {
        audc audcVar = new audc();
        c = audcVar;
        evsn.registerDefaultInstance(audc.class, audcVar);
    }

    private audc() {
    }

    public final void a() {
        evtg evtgVar = this.g;
        if (evtgVar.c()) {
            return;
        }
        this.g = evsn.mutableCopy(evtgVar);
    }

    public final void b() {
        evtg evtgVar = this.h;
        if (evtgVar.c()) {
            return;
        }
        this.h = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = auco.a;
            return newMessageInfo(c, "\u0001\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0004\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ࠞ\u0005ࠞ\u0006ဇ\u0003\u0007ဈ\u0004\bဉ\t\tဉ\n\nဉ\u000b\u000bဉ\f\fဇ\u0005\rဈ\u0006\u000fဉ\r\u0010ဉ\u000e\u0011ဉ\u0002\u0012ဇ\u0007\u0013ဈ\b", new Object[]{"d", "e", "g", aubq.class, "h", aubq.class, "i", evsvVar, "j", evsvVar, "k", "l", "q", "r", "s", "t", "m", "n", "u", "v", "f", "o", "p"});
        }
        if (iOrdinal == 3) {
            return new audc();
        }
        if (iOrdinal == 4) {
            return new audb();
        }
        if (iOrdinal == 5) {
            return c;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = w;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (audc.class) {
            evsgVar = w;
            if (evsgVar == null) {
                evsgVar = new evsg(c);
                w = evsgVar;
            }
        }
        return evsgVar;
    }
}
