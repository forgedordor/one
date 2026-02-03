package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaau extends evsn implements evui {
    public static final evsy a = new eaas();
    public static final eaau b;
    private static volatile evuo n;
    public int c;
    public boolean e;
    public long g;
    public eaaz k;
    public boolean l;
    public boolean m;
    public evqs d = evqs.b;
    public String f = "";
    public evtg h = evsn.emptyProtobufList();
    public evtg i = evsn.emptyProtobufList();
    public evsx j = emptyIntList();

    static {
        eaau eaauVar = new eaau();
        b = eaauVar;
        evsn.registerDefaultInstance(eaau.class, eaauVar);
    }

    private eaau() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\n\u0000\u0001\u0001\u000b\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", eryc.a, "k", "l", "m"});
        }
        if (iOrdinal == 3) {
            return new eaau();
        }
        if (iOrdinal == 4) {
            return new eaat();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = n;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eaau.class) {
            evsgVar = n;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                n = evsgVar;
            }
        }
        return evsgVar;
    }
}
