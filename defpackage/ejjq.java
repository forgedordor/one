package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejjq extends evsn implements evui {
    public static final ejjq a;
    private static volatile evuo j;
    public int d;
    public float e;
    public int f;
    public boolean g;
    private int k;
    public String b = "";
    public String c = "";
    public evtg h = evsn.emptyProtobufList();
    public evtg i = evsn.emptyProtobufList();

    static {
        ejjq ejjqVar = new ejjq();
        a = ejjqVar;
        evsn.registerDefaultInstance(ejjq.class, ejjqVar);
    }

    private ejjq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0002\n\b\u0000\u0002\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004᠌\u0002\u0005ခ\u0003\u0007᠌\u0004\bဇ\u0005\t\u001a\n\u001a", new Object[]{"k", "b", "c", "d", ejjo.a, "e", "f", ezam.a, "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new ejjq();
        }
        if (iOrdinal == 4) {
            return new ejjn();
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
        synchronized (ejjq.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
