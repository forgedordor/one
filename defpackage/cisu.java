package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cisu extends evsn implements evui {
    public static final cisu a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public evtg d;
    public aubq e;
    public auib f;

    static {
        cisu cisuVar = new cisu();
        a = cisuVar;
        evsn.registerDefaultInstance(cisu.class, cisuVar);
    }

    private cisu() {
        evsn.emptyProtobufList();
        this.d = emptyProtobufList();
    }

    public final void a() {
        evtg evtgVar = this.d;
        if (evtgVar.c()) {
            return;
        }
        this.d = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001Ȉ\u0003\u001b\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"b", "c", "d", alwl.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new cisu();
        }
        if (iOrdinal == 4) {
            return new cist();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cisu.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
