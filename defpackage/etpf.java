package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etpf extends evsn implements evui {
    public static final etpf a;
    private static volatile evuo d;
    public String b = "";
    public evtg c = evsn.emptyProtobufList();
    private int e;

    static {
        etpf etpfVar = new etpf();
        a = etpfVar;
        evsn.registerDefaultInstance(etpf.class, etpfVar);
    }

    private etpf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001a", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new etpf();
        }
        if (iOrdinal == 4) {
            return new etpe();
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
        synchronized (etpf.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
