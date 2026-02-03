package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evcj extends evsn implements evui {
    public static final evcj a;
    private static volatile evuo i;
    public int b;
    public String c = "";
    public long d;
    public long e;
    public String f;
    public String g;
    public evqs h;

    static {
        evcj evcjVar = new evcj();
        a = evcjVar;
        evsn.registerDefaultInstance(evcj.class, evcjVar);
    }

    private evcj() {
        emptyProtobufList();
        this.f = "";
        this.g = "";
        this.h = evqs.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0002\tည\u0007", new Object[]{"b", "c", "d", "f", "g", "e", "h"});
        }
        if (iOrdinal == 3) {
            return new evcj();
        }
        if (iOrdinal == 4) {
            return new evci();
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
        synchronized (evcj.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
