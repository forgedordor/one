package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emvq extends evsn implements evui {
    public static final emvq a;
    private static volatile evuo e;
    public int b;
    public emuh c;
    public evtg d = emptyProtobufList();

    static {
        emvq emvqVar = new emvq();
        a = emvqVar;
        evsn.registerDefaultInstance(emvq.class, emvqVar);
    }

    private emvq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", emub.class});
        }
        if (iOrdinal == 3) {
            return new emvq();
        }
        if (iOrdinal == 4) {
            return new emvp();
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
        synchronized (emvq.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
