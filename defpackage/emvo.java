package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emvo extends evsn implements evui {
    public static final emvo a;
    private static volatile evuo e;
    public int b;
    public emuh c;
    public evtg d = emptyProtobufList();

    static {
        emvo emvoVar = new emvo();
        a = emvoVar;
        evsn.registerDefaultInstance(emvo.class, emvoVar);
    }

    private emvo() {
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", emuh.class});
        }
        if (iOrdinal == 3) {
            return new emvo();
        }
        if (iOrdinal == 4) {
            return new emvn();
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
        synchronized (emvo.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
