package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewhs extends evsn implements evui {
    public static final ewhs a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public evtg h = evsn.emptyProtobufList();

    static {
        ewhs ewhsVar = new ewhs();
        a = ewhsVar;
        evsn.registerDefaultInstance(ewhs.class, ewhsVar);
    }

    private ewhs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006\u001a", new Object[]{"b", "c", "d", ewhr.a, "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new ewhs();
        }
        if (iOrdinal == 4) {
            return new ewhq();
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
        synchronized (ewhs.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
