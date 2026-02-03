package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class expq extends evsn implements evui {
    public static final expq a;
    private static volatile evuo j;
    public int b;
    public expi c;
    public exoc d;
    public exoi e;
    public exps f;
    public evtg g = emptyProtobufList();
    public evsx h = emptyIntList();
    public expk i;

    static {
        expq expqVar = new expq();
        a = expqVar;
        evsn.registerDefaultInstance(expq.class, expqVar);
    }

    private expq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0007,\tဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", exqd.class, "h", "i"});
        }
        if (iOrdinal == 3) {
            return new expq();
        }
        if (iOrdinal == 4) {
            return new expp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (expq.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
