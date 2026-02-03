package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cklv extends evsn implements evui {
    public static final cklv a;
    private static volatile evuo d;
    public evtg b = emptyProtobufList();
    public long c;

    static {
        cklv cklvVar = new cklv();
        a = cklvVar;
        evsn.registerDefaultInstance(cklv.class, cklvVar);
    }

    private cklv() {
    }

    public final void a() {
        evtg evtgVar = this.b;
        if (evtgVar.c()) {
            return;
        }
        this.b = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"b", ckme.class, "c"});
        }
        if (iOrdinal == 3) {
            return new cklv();
        }
        if (iOrdinal == 4) {
            return new cklu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cklv.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
