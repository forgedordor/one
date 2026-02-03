package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqiz extends evsn implements evui {
    public static final evsy a = new eqix();
    public static final eqiz b;
    private static volatile evuo k;
    public int c;
    public evqe g;
    public evvp h;
    public eqjs j;
    public String d = "";
    public evtg e = emptyProtobufList();
    public evtg f = emptyProtobufList();
    public evsx i = emptyIntList();

    static {
        eqiz eqizVar = new eqiz();
        b = eqizVar;
        evsn.registerDefaultInstance(eqiz.class, eqizVar);
    }

    private eqiz() {
    }

    public final void a() {
        evtg evtgVar = this.f;
        if (evtgVar.c()) {
            return;
        }
        this.f = evsn.mutableCopy(evtgVar);
    }

    public final void b() {
        evtg evtgVar = this.e;
        if (evtgVar.c()) {
            return;
        }
        this.e = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0000\u0007\u0000\u0001\u0001\f\u0007\u0000\u0003\u0000\u0001Ȉ\u0003\u001b\u0004\u001b\u0007ဉ\u0000\bဉ\u0001\u000b,\fဉ\u0004", new Object[]{"c", "d", "e", eqmw.class, "f", eqjb.class, "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new eqiz();
        }
        if (iOrdinal == 4) {
            return new eqiy();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eqiz.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
