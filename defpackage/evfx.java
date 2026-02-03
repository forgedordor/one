package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evfx extends evsn implements evui {
    public static final evfx a;
    private static volatile evuo i;
    public int b;
    public evhs d;
    public evhf f;
    public String c = "";
    public evtg e = evsn.emptyProtobufList();
    public String g = "";
    public String h = "";

    static {
        evfx evfxVar = new evfx();
        a = evfxVar;
        evsn.registerDefaultInstance(evfx.class, evfxVar);
    }

    private evfx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဉ\u0002\u0005ဈ\u0004\u0006ဉ\u0001\u0007ဈ\u0005", new Object[]{"b", "c", "e", "f", "g", "d", "h"});
        }
        if (iOrdinal == 3) {
            return new evfx();
        }
        if (iOrdinal == 4) {
            return new evfw();
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
        synchronized (evfx.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
