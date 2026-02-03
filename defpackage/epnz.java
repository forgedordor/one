package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epnz extends evsn implements evui {
    public static final epnz a;
    private static volatile evuo f;
    public int d;
    public evtg b = evsn.emptyProtobufList();
    public String c = "";
    public evtg e = emptyProtobufList();

    static {
        epnz epnzVar = new epnz();
        a = epnzVar;
        evsn.registerDefaultInstance(epnz.class, epnzVar);
    }

    private epnz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ț\u0002Ȉ\u0003\f\u0004\u001b", new Object[]{"b", "c", "d", "e", epns.class});
        }
        if (iOrdinal == 3) {
            return new epnz();
        }
        if (iOrdinal == 4) {
            return new epnx();
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
        synchronized (epnz.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
