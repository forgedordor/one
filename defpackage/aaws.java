package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaws extends evsn implements evui {
    public static final aaws a;
    private static volatile evuo f;
    public evtg b = emptyProtobufList();
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        aaws aawsVar = new aaws();
        a = aawsVar;
        evsn.registerDefaultInstance(aaws.class, aawsVar);
    }

    private aaws() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"b", aawe.class, "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new aaws();
        }
        if (iOrdinal == 4) {
            return new aawr();
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
        synchronized (aaws.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
