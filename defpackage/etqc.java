package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etqc extends evsn implements evui {
    public static final etqc a;
    private static volatile evuo i;
    public int b;
    public evqs c;
    public evqs d;
    public evqs e;
    public etqy f;
    public evtg g;
    public int h;

    static {
        etqc etqcVar = new etqc();
        a = etqcVar;
        evsn.registerDefaultInstance(etqc.class, etqcVar);
    }

    private etqc() {
        evqs evqsVar = evqs.b;
        this.c = evqsVar;
        this.d = evqsVar;
        this.e = evqsVar;
        this.g = emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u000e\u0006\u0000\u0001\u0000\u0001\n\u0002\n\u0006\n\fဉ\u0003\r\u001b\u000e\f", new Object[]{"b", "c", "d", "e", "f", "g", etqv.class, "h"});
        }
        if (iOrdinal == 3) {
            return new etqc();
        }
        if (iOrdinal == 4) {
            return new etqa();
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
        synchronized (etqc.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
