package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejgl extends evsn implements evui {
    public static final ejgl a;
    private static volatile evuo e;
    public int c;
    public evtg b = emptyProtobufList();
    public String d = "";

    static {
        ejgl ejglVar = new ejgl();
        a = ejglVar;
        evsn.registerDefaultInstance(ejgl.class, ejglVar);
    }

    private ejgl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\f\u0003Ȉ", new Object[]{"b", ejgj.class, "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ejgl();
        }
        if (iOrdinal == 4) {
            return new ejgk();
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
        synchronized (ejgl.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
