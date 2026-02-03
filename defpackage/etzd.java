package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etzd extends evsn implements evui {
    public static final etzd a;
    private static volatile evuo i;
    public int b;
    public etyd c;
    public int f;
    public etyr g;
    public String d = "";
    public evtg e = evsn.emptyProtobufList();
    public evtg h = evsn.emptyProtobufList();

    static {
        etzd etzdVar = new etzd();
        a = etzdVar;
        evsn.registerDefaultInstance(etzd.class, etzdVar);
    }

    private etzd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ț\u0004\f\u0006ဉ\u0001\u0007Ț", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new etzd();
        }
        if (iOrdinal == 4) {
            return new etzc();
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
        synchronized (etzd.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
