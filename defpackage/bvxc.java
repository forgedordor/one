package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvxc extends evsn implements evui {
    public static final bvxc a;
    private static volatile evuo e;
    public String b = "";
    public evtg c = emptyProtobufList();
    public evtg d = evsn.emptyProtobufList();

    static {
        bvxc bvxcVar = new bvxc();
        a = bvxcVar;
        evsn.registerDefaultInstance(bvxc.class, bvxcVar);
    }

    private bvxc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002\u001c\u0003Ț", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new bvxc();
        }
        if (iOrdinal == 4) {
            return new bvxb();
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
        synchronized (bvxc.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
