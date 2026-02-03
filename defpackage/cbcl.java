package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbcl extends evsn implements evui {
    public static final cbcl a;
    private static volatile evuo c;
    public evtg b = evsn.emptyProtobufList();

    static {
        cbcl cbclVar = new cbcl();
        a = cbclVar;
        evsn.registerDefaultInstance(cbcl.class, cbclVar);
    }

    private cbcl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new cbcl();
        }
        if (iOrdinal == 4) {
            return new cbck();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cbcl.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
