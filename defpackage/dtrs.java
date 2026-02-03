package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtrs extends evsn implements evui {
    public static final dtrs a;
    private static volatile evuo e;
    public evub b;
    public evub c;
    public evtg d;

    static {
        dtrs dtrsVar = new dtrs();
        a = dtrsVar;
        evsn.registerDefaultInstance(dtrs.class, dtrsVar);
    }

    private dtrs() {
        evub evubVar = evub.a;
        this.b = evubVar;
        this.c = evubVar;
        this.d = emptyProtobufList();
    }

    public final evub a() {
        evub evubVar = this.b;
        if (!evubVar.b) {
            this.b = evubVar.a();
        }
        return this.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0002\u0001\u0000\u00012\u00022\u0003\u001b", new Object[]{"b", dtrq.a, "c", dtrr.a, "d", dtqy.class});
        }
        if (iOrdinal == 3) {
            return new dtrs();
        }
        if (iOrdinal == 4) {
            return new dtrp();
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
        synchronized (dtrs.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
