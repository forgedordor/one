package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqnd extends evsn implements evui {
    public static final eqnd a;
    private static volatile evuo p;
    public int b;
    public int e;
    public eqml f;
    public eqns i;
    public long j;
    public evvp n;
    public evvp o;
    public evub g = evub.a;
    public String c = "";
    public String d = "";
    public evtg h = evsn.emptyProtobufList();
    public String k = "";
    public String l = "";
    public String m = "";

    static {
        eqnd eqndVar = new eqnd();
        a = eqndVar;
        evsn.registerDefaultInstance(eqnd.class, eqndVar);
    }

    private eqnd() {
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
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\r\u0000\u0001\u0001\u0011\r\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004ဉ\u0000\u00062\u0007ဉ\u0002\b\u0003\tȈ\nȈ\u000bȈ\u000eဉ\u0005\u0010Ț\u0011ဉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", eqnb.a, "i", "j", "k", "l", "m", "n", "h", "o"});
        }
        if (iOrdinal == 3) {
            return new eqnd();
        }
        if (iOrdinal == 4) {
            return new eqnc();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = p;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eqnd.class) {
            evsgVar = p;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                p = evsgVar;
            }
        }
        return evsgVar;
    }
}
