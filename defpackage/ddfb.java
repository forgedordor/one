package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddfb extends evsn implements evui {
    public static final ddfb a;
    private static volatile evuo d;
    public String b = "";
    public evtg c = emptyProtobufList();

    static {
        ddfb ddfbVar = new ddfb();
        a = ddfbVar;
        evsn.registerDefaultInstance(ddfb.class, ddfbVar);
    }

    private ddfb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"b", "c", ddfo.class});
        }
        if (iOrdinal == 3) {
            return new ddfb();
        }
        if (iOrdinal == 4) {
            return new ddfa();
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
        synchronized (ddfb.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
