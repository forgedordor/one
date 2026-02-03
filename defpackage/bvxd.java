package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvxd extends evsn implements evui {
    public static final bvxd a;
    private static volatile evuo f;
    public evtg b = emptyProtobufList();
    public String c = "";
    public evtg d = evsn.emptyProtobufList();
    public evtg e = emptyProtobufList();

    static {
        bvxd bvxdVar = new bvxd();
        a = bvxdVar;
        evsn.registerDefaultInstance(bvxd.class, bvxdVar);
    }

    private bvxd() {
    }

    public final void a() {
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
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001c\u0002Ȉ\u0003Ț\u0004\u001b", new Object[]{"b", "c", "d", "e", bvxc.class});
        }
        if (iOrdinal == 3) {
            return new bvxd();
        }
        if (iOrdinal == 4) {
            return new bvxa();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (bvxd.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
