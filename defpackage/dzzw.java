package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzzw extends evsn implements evui {
    public static final dzzw a;
    private static volatile evuo j;
    public int b;
    public String c = "";
    public evtg d = emptyProtobufList();
    public evtg e = emptyProtobufList();
    public evtg f = emptyProtobufList();
    public evtg g = emptyProtobufList();
    public evtg h = emptyProtobufList();
    public evsx i = emptyIntList();

    static {
        dzzw dzzwVar = new dzzw();
        a = dzzwVar;
        evsn.registerDefaultInstance(dzzw.class, dzzwVar);
    }

    private dzzw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0006\u0000\u0001ဈ\u0000\u0002\u001c\u0003\u001c\u0004\u001c\u0005\u001c\u0006\u001c\u0007\u0016", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new dzzw();
        }
        if (iOrdinal == 4) {
            return new dzzv();
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
        synchronized (dzzw.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
