package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eynl extends evsn implements evui {
    public static final eynl a;
    private static volatile evuo g;
    public int e;
    public String b = "";
    public String c = "";
    public evtg d = emptyProtobufList();
    public String f = "";

    static {
        eynl eynlVar = new eynl();
        a = eynlVar;
        evsn.registerDefaultInstance(eynl.class, eynlVar);
    }

    private eynl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004\u001b\u0005\f\u0007Ȉ", new Object[]{"b", "c", "d", eynj.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eynl();
        }
        if (iOrdinal == 4) {
            return new eynk();
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
        synchronized (eynl.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
