package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaax extends evsn implements evui {
    public static final evsy a = new eaav();
    public static final eaax b;
    private static volatile evuo m;
    public int c;
    public boolean e;
    public eaaz j;
    public boolean k;
    public boolean l;
    public evqs d = evqs.b;
    public String f = "";
    public evtg g = evsn.emptyProtobufList();
    public evtg h = evsn.emptyProtobufList();
    public evsx i = emptyIntList();

    static {
        eaax eaaxVar = new eaax();
        b = eaaxVar;
        evsn.registerDefaultInstance(eaax.class, eaaxVar);
    }

    private eaax() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\t\u0000\u0001\u0001\u000b\t\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i", eryc.a, "j", "k", "l"});
        }
        if (iOrdinal == 3) {
            return new eaax();
        }
        if (iOrdinal == 4) {
            return new eaaw();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = m;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eaax.class) {
            evsgVar = m;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                m = evsgVar;
            }
        }
        return evsgVar;
    }
}
