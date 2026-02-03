package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawc extends evsn implements evui {
    public static final aawc a;
    private static volatile evuo g;
    public evtg b = emptyProtobufList();
    public String c = "";
    public String d = "";
    public String e = "";
    public long f;

    static {
        aawc aawcVar = new aawc();
        a = aawcVar;
        evsn.registerDefaultInstance(aawc.class, aawcVar);
    }

    private aawc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0002", new Object[]{"b", aawe.class, "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aawc();
        }
        if (iOrdinal == 4) {
            return new aawb();
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
        synchronized (aawc.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
