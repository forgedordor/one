package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgfj extends evsn implements evui {
    public static final cgfj a;
    private static volatile evuo d;
    public evtg b = evsn.emptyProtobufList();
    public boolean c;
    private int e;

    static {
        cgfj cgfjVar = new cgfj();
        a = cgfjVar;
        evsn.registerDefaultInstance(cgfj.class, cgfjVar);
    }

    private cgfj() {
    }

    public static /* synthetic */ void b(cgfj cgfjVar) {
        cgfjVar.e |= 1;
        cgfjVar.c = true;
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
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဇ\u0000", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new cgfj();
        }
        if (iOrdinal == 4) {
            return new cgfi();
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
        synchronized (cgfj.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
