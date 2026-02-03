package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezrp extends evsn implements ezrq {
    public static final ezrp a;
    private static volatile evuo i;
    public int b;
    public ezol c;
    public ezoz d;
    public evtg e;
    public int f;
    public String g;
    public ezse h;

    static {
        ezrp ezrpVar = new ezrp();
        a = ezrpVar;
        evsn.registerDefaultInstance(ezrp.class, ezrpVar);
    }

    private ezrp() {
        emptyProtobufList();
        this.e = emptyProtobufList();
        this.g = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\n\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0006\u001b\u0007\f\tȈ\nဉ\u0003", new Object[]{"b", "c", "d", "e", ezrs.class, "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new ezrp();
        }
        if (iOrdinal == 4) {
            return new ezro();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezrp.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
