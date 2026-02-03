package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvty extends evsn implements evui {
    public static final bvty a;
    private static volatile evuo e;
    public boolean c;
    public evtg b = evsn.emptyProtobufList();
    public String d = "";

    static {
        bvty bvtyVar = new bvty();
        a = bvtyVar;
        evsn.registerDefaultInstance(bvty.class, bvtyVar);
    }

    private bvty() {
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
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002\u0007\u0003Ȉ", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new bvty();
        }
        if (iOrdinal == 4) {
            return new bvtx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (bvty.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
