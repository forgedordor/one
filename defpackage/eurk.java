package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eurk extends evsn implements evui {
    public static final eurk a;
    private static volatile evuo e;
    public int b;
    public evtg c = emptyProtobufList();
    public euro d;

    static {
        eurk eurkVar = new eurk();
        a = eurkVar;
        evsn.registerDefaultInstance(eurk.class, eurkVar);
    }

    private eurk() {
    }

    public final void a() {
        evtg evtgVar = this.c;
        if (evtgVar.c()) {
            return;
        }
        this.c = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", eure.class, "d"});
        }
        if (iOrdinal == 3) {
            return new eurk();
        }
        if (iOrdinal == 4) {
            return new eurj();
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
        synchronized (eurk.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
